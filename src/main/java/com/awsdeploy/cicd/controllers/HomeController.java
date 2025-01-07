package com.awsdeploy.cicd.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {
    @GetMapping("/")
    ResponseEntity<Map<String,String>> getWelcomeMessage(){
        Map<String, String> message =new HashMap<>(2);
        message.put("message","Second deploy");
        message.put("version","deploy at 2024-12-19");

        return ResponseEntity.ok( message);
    }
}
