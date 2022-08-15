package com.yjxxt.service;

import com.yjxxt.pojo.User;
import org.junit.Before;
import org.junit.Test;

public class Test1 {

    private UserService userService = null;

    @Before
    public void init() {
//        System.out.println("方法执行前执行");
        userService = new UserService();
    }

    @Test
    public void addUser() {
        userService.addUser(new User(5, "xwp", "123456", "xwp", "", ""));
        userService.showUser();

    }

    @Test
    public void showUser() {
        userService.showUser();
    }

    @Test
    public void login() {
        userService.login("xwp", "123456");
    }

    @Test
    public void update() {
        System.out.println("这是之前的----");
        userService.showUser();
        System.out.println("这是之后的-----");
        userService.updateUser(new User(1, "xwp", "123456", "aaa", "", ""));
        userService.showUser();

    }

    @Test
    public void delete() {
        System.out.println("这是删除之前哦！");
        userService.showUser();
        System.out.println("这是删除之后哦！");
        userService.delUser(2);
        userService.showUser();

    }

}
