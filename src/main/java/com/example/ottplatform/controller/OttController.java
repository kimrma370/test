package com.example.ottplatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OttController {

    @GetMapping("/ott")
    public String ottPage() {
        return "ott-list"; // templates/ott-list.html 로 연결
    }
}
