package com.example.ottplatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OaccController {

    @GetMapping("/oacc")
    public String oaccPage() {
        return "oacc-list"; // templates/oacc-list.html 로 연결
    }
}
