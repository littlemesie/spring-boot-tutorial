package cn.mesie.model;

import java.io.Serializable;

/**
 * Created by 2018/12/4 22:52
 *
 * @author: mesie
 */
public class User implements Serializable {

    private static final long serialVersionUID = -1727537778826379384L;

    private String id;

    private String name;

    private String age;

    private String sex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
