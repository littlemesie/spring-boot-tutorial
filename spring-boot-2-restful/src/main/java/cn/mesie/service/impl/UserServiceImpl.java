package cn.mesie.service.impl;

import cn.mesie.dao.UserDao;
import cn.mesie.model.User;
import cn.mesie.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 2018/12/4 22:50
 *
 * @author: mesie
 */
@Service
public class UserServiceImpl implements UserService{
    @Resource
    UserDao userDao;

    @Override
    public List<User> findAll() {

        return userDao.findAll();
    }
}
