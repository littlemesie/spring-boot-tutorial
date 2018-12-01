# spring-boot-helloworld
1.创建一个HelloController.java
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("Hello Spring-Boot");
        return "hello world";
    }
}

2.运行SpringBootHelloworldApplication.java 在浏览器里输入：http://localhost:8080/hello。然后显示hello world表示项目运行成功。