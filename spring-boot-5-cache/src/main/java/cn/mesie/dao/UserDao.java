package cn.mesie.dao;

import cn.mesie.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 2018/12/16 23:33
 *
 * @author: mesie
 */
public interface UserDao extends JpaRepository<User, Long> {

    /**
     * 通过用户名查询用户
     *
     * @param userName
     * @return
     */
    //User findByName(String userName);

    /**
     * 通过用户ID查询用户
     *
     * @param id
     * @return
     */
    User findById(Integer id);
}
