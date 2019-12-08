package com.veselov.alex.springmvc.service;

import org.springframework.stereotype.Service;

@Service
public class UserValidationService {
    public boolean isUserValid(String user, String password) {
        return "rmk".equals(user) && "pass".equals(password);
    }
}
