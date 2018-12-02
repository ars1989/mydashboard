package com.mydashboard.controllers;


import com.google.gson.JsonObject;
import com.mydashboard.data.response.UserResponse;
import com.mydashboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/mydashboard/getallactiveusers")
    @ResponseBody
    public String getAllActiveUsers() {
        JsonObject response = new JsonObject();

        UserResponse userResponse = userService.getAllActiveUsers();

        response.add("result", response);
        return response.toString();
    }
}
