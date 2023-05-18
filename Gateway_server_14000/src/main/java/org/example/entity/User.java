package org.example.entity;

public class User {
    private Integer userId;
    private String userName;
    private String password;



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserNme() {
        return userName;
    }

    public void setUserNme(String userNme) {
        this.userName = userNme;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}
