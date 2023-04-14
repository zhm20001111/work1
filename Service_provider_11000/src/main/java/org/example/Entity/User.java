package org.example.Entity;

public class User {
    private Integer userId;
    private String userName;
    private String password;
    public  User(Integer userId, String userName, String password){
        this.password = password;
        this.userName = userName;
        this.userId = userId;

    }

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
