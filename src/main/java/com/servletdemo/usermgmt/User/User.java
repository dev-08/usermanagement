package com.servletdemo.usermgmt.User;

public class User {

    private int id;
    private String username;
    private String email;
    private String mobileNumber;
    private String date;
    private String gender;


    public User(String username, String email, String mobileNumber, String date, String gender) {

        this.username = username;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.date = date;
        this.gender = gender;
    }

    public User() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
