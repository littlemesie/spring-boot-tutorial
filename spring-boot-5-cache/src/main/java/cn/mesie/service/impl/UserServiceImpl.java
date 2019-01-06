package cn.mesie.service.impl;

import cn.mesie.dao.UserDao;
import cn.mesie.entity.User;
import cn.mesie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 2018/12/16 23:37
 *
 * @author: mesie
 */
@Service
@CacheConfig(cacheNames = "user-cache")
public class UserServiceImpl implements UserService{

    public static final String CACHE_KEY = "USERS_CACHE_KEY";

    @Autowired
    UserDao userDao;

    @Override
    @Cacheable(value = {})
    public User findUserById(Integer id) {
        User u = userDao.findById(id);
        return u;
    }

    @Override
    public User findUserByName(String userName) {
        return null;
    }

    @Override
    public List<User> findAllUser() {
        return null;
    }

    @Override
    public void saveAndFlush(User user) {

    }

    @Override
    public void deleteUserById(Integer id) {

    }
}
