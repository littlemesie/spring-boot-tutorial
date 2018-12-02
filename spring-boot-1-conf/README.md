# 配置文件解析
Spring Boot使用了一个全局的配置文件application.properties或者application.yml，放在src/main/resources目录下或者类路径的/config下。Sping Boot的全局配置文件的作用是对一些默认配置的配置值进行修改

1.自定义属性

application.properties提供自定义属性的支持，com.mesie.name="mesie",然后直接在要使用的地方通过注解@Value(value=”${config.name}”)就可以绑定到你想要的属性上面

2.配置文件的优先级

application.properties和application.yml文件可以放在一下四个位置：

外置，在相对于应用程序运行目录的/congfig子目录里。
外置，在应用程序运行的目录里
内置，在config包内
内置，在Classpath根目录
同样，这个列表按照优先级排序，也就是说，src/main/resources/config下application.properties覆盖src/main/resources下application.properties中相同的属性
此外，如果你在相同优先级位置同时有application.properties和application.yml，那么application.yml里面的属性就会覆盖application.properties里的属性。

3.Profile-多环境配置

当应用程序需要部署到不同运行环境时，一些配置细节通常会有所不同，最简单的比如日志，生产日志会将日志级别设置为WARN或更高级别，并将日志写入日志文件，而开发的时候需要日志级别为DEBUG，日志输出到控制台即可。
如果按照以前的做法，就是每次发布的时候替换掉配置文件，这样太麻烦了，Spring Boot的Profile就给我们提供了解决方案，命令带上参数就搞定。

这里我们来模拟一下，只是简单的修改端口来测试
在Spring Boot中多环境配置文件名需要满足application-{profile}.properties的格式，其中{profile}对应你的环境标识，比如：

application-dev.properties：开发环境
application-prod.properties：生产环境
想要使用对应的环境，只需要在application.properties中使用spring.profiles.active属性来设置，值对应上面提到的{profile}，这里就是指dev、prod这2个。