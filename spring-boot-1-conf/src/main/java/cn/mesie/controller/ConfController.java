package cn.mesie.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 2018/12/2 22:52
 *
 * @author: mesie
 */
@RestController
public class ConfController {

    private  String name;
    private  int age;

    @RequestMapping("/")
    public String conf(){
        return "姓名：" + name + ",年龄：" + age;
    }
}
