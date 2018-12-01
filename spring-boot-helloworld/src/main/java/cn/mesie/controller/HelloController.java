package cn.mesie.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 2018/12/1 16:52
 *
 * @author: mesie
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("Hello Spring-Boot");
        return "hello world";
    }
}
