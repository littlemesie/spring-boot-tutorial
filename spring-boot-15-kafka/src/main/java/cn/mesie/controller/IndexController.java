package cn.mesie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 2019-04-23 23:25
 *
 * @author: mesie
 */
@RestController
@RequestMapping("/index/")
public class IndexController {

    @GetMapping("test")
    public Long test() {
        System.out.println("----------------------------------INFO");
        return System.currentTimeMillis();
    }
}
