package org.example.Entity;

public class User {
    private final Integer userId;
    private final String userName;
    private final String password;

    public  User(Integer userId, String userName, String password){
        this.userName = userName;
        this.userId = userId;
        this.password = password;

    }

    public String getPassword() {
        return password;
    }



    public String getUserNme() {
        return userName;
    }



    public Integer getUserId() {
        return userId;
    }


}
