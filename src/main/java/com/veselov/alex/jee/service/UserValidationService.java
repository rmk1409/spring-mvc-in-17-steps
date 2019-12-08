package com.veselov.alex.jee.service;

public class UserValidationService {
    public boolean isUserValid(String user, String password) {
        if ("rmk".equals(user) && "pass".equals(password)) {
            return true;
        }
        return false;
    }
}
