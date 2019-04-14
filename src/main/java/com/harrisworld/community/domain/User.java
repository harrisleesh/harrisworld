package com.harrisworld.community.domain;

import lombok.Getter;

@Getter
public class User {

    String name;
    String password;
    String email;


    public User(String name, String password, String email){
        this.name=name;
        this.password = password;
        this.email = email;
    }
}
