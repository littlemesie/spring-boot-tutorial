package cn.mesie.controller;

import cn.mesie.model.User;
import cn.mesie.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import com.alibaba.fastjson.JSON;

/**
 * Created by 2018/12/4 22:45
 *
 * @author: mesie
 */
@RestController
public class RESTfulAPIController {

    @Resource
    UserService userService;

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public List<User> findAll() {
        // GET请求，用来获取信息
        return userService.findAll();
    }

    @RequestMapping(value = { "/login" }, method = RequestMethod.POST)
    public String login(@RequestParam("id") String id, @RequestParam("name") String name) {
        // POST请求
        User user = new User();
        user.setId(id);
        user.setName(name);
        String res = JSON.toJSONString(user);
        System.out.println(res);
        return res;
    }
}
