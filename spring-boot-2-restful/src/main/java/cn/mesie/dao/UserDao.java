package cn.mesie.dao;

import cn.mesie.model.User;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by 2018/12/4 22:51
 *
 * @author: mesie
 */
@Repository
public class UserDao {
    // 创建线程安全的Map
    public static Map<String, User> map = Collections.synchronizedMap(new HashMap<String, User>());

    static {
        User user = new User();
        user.setId("123");
        user.setName("Mesie");
        user.setAge("20");
        map.put("基本信息",user);
    }

    public List<User> findAll() {
        List<User> list = getListUser(map);
        return list;
    }

    private List<User> getListUser(Map<String, User> map) {
        Set<String> set = map.keySet();
        List<User> list = new ArrayList<User>();
        for (String string : set) {
            User user = map.get(string);
            list.add(user);
        }
        return list;
    }
}
