package com.harrisworld.community.dto;

import com.harrisworld.community.domain.User;
import lombok.Getter;

import java.util.List;

@Getter
public class UserListResponse {
    private List<User> users;

    public UserListResponse(List<User> users){
        this.users = users;
    }
}
