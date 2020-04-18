package com.jdutton.photoapp.api.account.ui.controllers;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
    
    private final Environment env;
    
        
    public AccountController(Environment env) {
	super();
	this.env = env;
    }



    @GetMapping("/status/check")
    public String status() {
	return "Working! Port: " + env.gerProperty("");
    }
}
