package cn.mesie.controller;

import cn.mesie.model.User;
import cn.mesie.service.UserService;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "user/{id}",method = RequestMethod.GET)
    public String getUserId(@PathVariable("id") String id){
        // url中的id可通过@PathVariable绑定到函数的参数中
        return "用户id:" + id;
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

    @RequestMapping(value = { "/login1" }, method = RequestMethod.POST)
    public String login1(@ModelAttribute User user) {
        // POST请求
        //@ModelAttribute绑定参数
        String u = JSON.toJSONString(user);
        System.out.println(user.getId());
        System.out.println(u);
        return u;
    }


}
