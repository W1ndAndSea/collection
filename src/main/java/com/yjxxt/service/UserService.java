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
        users = new ArrayList<User>();
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
        for (User temp : users) {
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

    public void showUser() {
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

        users.forEach(u -> {
            System.out.println(u);
        });


    }


    public void login(String userName, String userPwd) {
        /**
         *  1.判空
         *     用户名 密码非空校验
         *  2.根据用户名查找用户记录
         *  3.记录存在判断
         *     不存在-->抛异常
         *  4.用户存在
         *      用户密码比较
         *         不正确-->抛异常
         *  5.密码正确
         *      登录成功
         */

        if (StringUtils.isBlank(userName)) {
            throw new RuntimeException("用户名不能为空");
        }
        if (StringUtils.isBlank(userPwd)) {
            throw new RuntimeException("密码不能为空哦~");
        }

        //根据用户名查找密码

        Integer index=null;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(userName)){
                index=i;
                break;
            }
        }
        if (index==null){
            throw  new RuntimeException("用户记录不存在~");
        }
        User temp=users.get(index);
        if (!temp.getUserPwd().equals(userPwd)){
            throw  new RuntimeException("用户密码错误~");
        }
        System.out.println("登录成功了哦");



    }


}
