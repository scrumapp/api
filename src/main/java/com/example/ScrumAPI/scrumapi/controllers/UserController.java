package com.example.ScrumAPI.scrumapi.controllers;

import com.example.ScrumAPI.scrumapi.models.User;
import com.example.ScrumAPI.scrumapi.services.UserService;
import com.example.ScrumAPI.scrumapi.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/register")
    public ResponseEntity<Map<String, String>> register(@RequestBody final User body){
        userService.createUser(body);
        return Util.getCreateSuccessResponse("success");
    }

    // TODO login
    // TODO logut
    // TODO update
    // TODO delete


}
