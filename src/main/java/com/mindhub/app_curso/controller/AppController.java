package com.mindhub.app_curso.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class AppController {


    @GetMapping
    public String getUserName(Authentication authentication){
        return authentication.getName();
    }

}
