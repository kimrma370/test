package com.example.ottplatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RentController {

    @GetMapping("/rent")
    public String rentPage() {
        return "rent-status"; // templates/rent-status.html 로 연결
    }
}
