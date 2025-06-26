package com.minierp.client_service.controller;

import com.minierp.client_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String checkStatus() {
        return userService.getStatus();
    }
}
