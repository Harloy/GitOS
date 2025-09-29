package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextController {

    @GetMapping("/api")
    public String home() {
        return "API работает! Добро пожаловать.";
    }
}
