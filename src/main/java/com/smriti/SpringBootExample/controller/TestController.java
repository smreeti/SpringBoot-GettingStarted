package com.smriti.SpringBootExample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/automaticLoading")
    public String automaticLoad() {
        return "Application running automatically.";
    }

    @GetMapping("/teamInfo")
    public String getTeamInfo() {
        return "Coach Name : " + coachName + ", Team Name : " + teamName;
    }
}
