package com.concious.authserveapplet.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

 @RequestMapping("/test")
    public String getLogin() {
     return "Welcome to the login page";
 }
}
