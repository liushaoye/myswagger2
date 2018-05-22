package com.springboot.pojo;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/22 14:04
 * @Description: myswagger2
 * <p>
 * 测试需要的实体类
 */
public class User {


    /**
     * 主键ID
     */
    private Long id;

    /**
     * 客户的姓名
     */
    private String name;


    /**
     * 客户的年龄
     */
    private String age;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
