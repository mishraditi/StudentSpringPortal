package com.portal.student.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password) {

    boolean isValidUserName = username.equalsIgnoreCase("aditi");
    boolean isValidPassword = password.equalsIgnoreCase("Udemy");

    return isValidUserName && isValidPassword;
}
}
