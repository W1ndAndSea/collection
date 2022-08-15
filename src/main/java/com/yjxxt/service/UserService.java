package com.yjxxt.service;

import com.yjxxt.pojo.User;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * 云日记-用户管理模块
 * 用户登录
 * 用户注册
 * 用户列表展示
 * 用户信息更新
 */
public class UserService {
    /**
     * 用户记录的保存
     * List ArrayList
     * Map HashMap
     * Set HashSet
     * List <<map<k,v>>
     */
    private List<User> users;

    public UserService() {
        users = new ArrayList<>();
        users.add(new User(1, "admin", "123456", "admin", "", ""));
        users.add(new User(2, "xwp", "123456", "xwp", "", ""));
    }

    public void addUser(User user) {
        //先进行参数合法性的校验

        if (null == user) {
            throw new RuntimeException("请传入用户");
        }
        if (StringUtils.isBlank(user.getUserName())) {
            throw new RuntimeException("用户名不能为空哦");
        }
        if (StringUtils.isBlank(user.getUserPwd())) {
            throw new RuntimeException("密码不能为空哦");
        }

        //用户名唯一性的校验

        //数组遍历
        for (User temp :
                users) {
            if (temp.getUserName().equals(user.getUserName())) {
                System.out.println("用户名已经存在了哦~");
            }

        }
        //contains

//        if (users.contains(user)) {
//            throw new RuntimeException("用户名已经存在咯~");
//        }
//
//        long count = users.stream().filter(u -> u.getUserName().equals(user.getUserName())).count();
//
//        if (count == 1) {
//            throw new RuntimeException("用户名已存在~");
//        }
        users.add(user);

    }
    public void showUser(){
//        //遍历
//        for (int i = 0; i < users.size(); i++) {
//            System.out.println(users.get(i));
//        }
//
//        for (User temp:users){
//            System.out.println(temp);
//        }
//
//        Iterator<User> iterator = users.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        ListIterator<User> listIterator = users.listIterator();
//        while(listIterator.hasNext()){
//            System.out.println(listIterator.next());
//        }

        users.forEach(u->{
            System.out.println(u);
        });


    }


}
