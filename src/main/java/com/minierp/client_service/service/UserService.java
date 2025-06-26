package com.minierp.client_service.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getStatus() {
        return "Project is up and running!";
    }
}
