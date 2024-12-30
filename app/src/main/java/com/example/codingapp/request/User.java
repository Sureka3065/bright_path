package com.example.codingapp.request;

public class User {
    private String name;
    private String email;
    private long mobile_no;
    private String password;
    private String sch_name;
    private String standard;

    public User(String name, String email, long mobile_no, String password,String sch_name,String standard) {
        this.name = name;
        this.email = email;
        this.mobile_no = mobile_no;
        this.password = password;
        this.sch_name = sch_name;
        this.standard = standard;
    }
}
