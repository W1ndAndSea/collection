package com.yjxxt.pojo;

public class User {
    private Integer id;
    private String userName;
    private String userPwd;
    private String NickName;
    private String Mood;
    private String HeadImages;

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

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }

    public String getMood() {
        return Mood;
    }

    public void setMood(String mood) {
        Mood = mood;
    }

    public String getHeadImages() {
        return HeadImages;
    }

    public void setHeadImages(String headImages) {
        HeadImages = headImages;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", NickName='" + NickName + '\'' +
                ", Mood='" + Mood + '\'' +
                ", HeadImages='" + HeadImages + '\'' +
                '}';
    }

    public User() {
    }

    public User(Integer id, String userName, String userPwd, String nickName, String mood, String headImages) {
        this.id = id;
        this.userName = userName;
        this.userPwd = userPwd;
        NickName = nickName;
        Mood = mood;
        HeadImages = headImages;
    }
}
