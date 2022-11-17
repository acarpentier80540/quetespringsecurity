package com.wildcodeschool.myProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String CHAMPION() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String DIRECTOR() {
        return "Biarritz" +
                "Bordeaux" +
                "La Loupe " +
                "Lille" +
                "Lyon" +
                "Marseille" +
                "Nantes" +
                "Orléans" +
                "Paris" +
                "Reims" +
                "Strasbourg" +
                "Toulouse" +
                "Tours";
    }
}