package cn.mesie.service.user.impl;

import cn.mesie.annotation.timebuskerMethod;
import cn.mesie.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by 2019-03-24 17:29
 *
 * @author: mesie
 */
@Service
public class UserServiceImpl implements UserService {
    private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    @timebuskerMethod
    public String addUserInfo(String name) throws IllegalArgumentException {
        logger.info("新增的用户姓名是：" + name);
        return name + "U";
    }
}
