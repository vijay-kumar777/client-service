package com.minierp.client_service.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getStatus() {
        return "https://github.com/vijay-kumar777/client-service" +
                "Project is up and running!";
    }
}
