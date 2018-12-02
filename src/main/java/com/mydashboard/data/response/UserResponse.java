package com.mydashboard.data.response;

import com.mydashboard.data.dto.UserDTO;

import java.util.List;

public class UserResponse {

    List<UserDTO> users;

    public UserResponse(List<UserDTO> users) {
        this.users = users;
    }

    public List<UserDTO> getUsers() {
        return users;
    }

    public void setUsers(List<UserDTO> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserResponse{" +
                "users=" + users +
                '}';
    }
}
