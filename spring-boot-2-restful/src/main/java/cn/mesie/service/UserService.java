package cn.mesie.service;

import cn.mesie.model.User;

import java.util.List;

/**
 * Created by 2018/12/4 22:49
 *
 * @author: mesie
 */
public interface UserService {

    List<User> findAll();
}
