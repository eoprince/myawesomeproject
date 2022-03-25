package com.tts.myAwesomeProject.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainControllers {
    @RequestMapping("") //http:localhost:8080/
    public String home() {
        return "Hello World!";
    }
}

