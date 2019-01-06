package cn.mesie.service;

import cn.mesie.entity.User;

import java.util.List;

/**
 * Created by 2018/12/16 23:36
 *
 * @author: mesie
 */
public interface UserService {

    /**
     * 使用ID查询用户
     *
     * @param id
     * @return
     */
    public User findUserById(Integer id);

    public User findUserByName(String userName);

    /**
     * 查询所有用户
     *
     * @return
     */
    public List<User> findAllUser();


    /**
     * 更新或新增用户信息
     *
     * @param user
     */
    public void saveAndFlush(User user);

    /**
     * 通过ID删除一个用户
     *
     * @param id
     */
    public void deleteUserById(Integer id);
}
