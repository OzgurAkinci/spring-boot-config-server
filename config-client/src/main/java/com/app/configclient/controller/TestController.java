package com.app.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class TestController {

    @Value("${my.prop}")
    String fromEnvironment;

    @GetMapping("/from")
    public String test() {
        return "From: " + fromEnvironment;
    }
}
