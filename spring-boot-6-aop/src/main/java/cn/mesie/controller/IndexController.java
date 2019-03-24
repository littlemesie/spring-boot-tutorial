package cn.mesie.controller;

import cn.mesie.service.CommonService;
import cn.mesie.service.order.OrderService;
import cn.mesie.service.user.UserService;
import cn.mesie.utils.CommonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by 2019-03-24 17:15
 *
 * @author: mesie
 */
@RestController
public class IndexController {
    private final static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Resource
    CommonService service;

    @Resource
    OrderService orderService;

    @Resource
    UserService userService;

    @RequestMapping(value = { "/**", "/" }, method = RequestMethod.GET)
    public Long testAop() {
        logger.info("\n=======================spring aop========================\n");
        int i = 1;
        i = CommonUtil.add(i);
        i = service.add(i);
        logger.info("\n====================处理结果为:" + i + "====================\n");
        String name = "#####";
        name = orderService.addOrderInfo(name);
        name = userService.addUserInfo(name);
        logger.info("\n====================名称为\t" + name + "====================\n");
        return System.currentTimeMillis();
    }
}
