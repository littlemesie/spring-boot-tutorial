package cn.mesie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by 2018/12/16 23:33
 *
 * @author: mesie
 */
@Entity
public class User {
    private static final long serialVersionUID = 1352188299317199595L;

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String userName;

    public User() {
    }

    public User(Integer id,String userName) {
        this.id = id;
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + userName + '\'' +
                '}';
    }
}
