# spring-boot集成Ehcache缓存框架

EhCache 是一个纯Java的进程内缓存框架，具有快速、精干等特点，是Hibernate中默认的CacheProvider。

ehcache提供了多种缓存策略，主要分为内存和磁盘两级，所以无需担心容量问题。

spring-boot是一个快速的集成框架，其设计目的是用来简化新Spring应用的初始搭建以及开发过程。该框架使用了特定的方式来进行配置，从而使开发人员不再需要定义样板化的配置。

由于spring-boot无需任何样板化的配置文件，所以spring-boot集成一些其他框架时会有略微的不同。

核心依赖包：

```
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-cache</artifactId>
		</dependency>
		<dependency>
			<groupId>net.sf.ehcache</groupId>
			<artifactId>ehcache</artifactId>
		</dependency>
```
