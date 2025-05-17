package com.example.ottplatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.service.UserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userService;
	
	@GetMapping("/")
	public String homePage() {
	    return "index"; // templates/index.html
	}

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // templates/login.html
    }

    @GetMapping("/signup")
    public String signupPage() {
        return "signup"; // templates/signup.html
    }
    
    @PostMapping("/signup")
    public String signup(@RequestParam String uid,
                         @RequestParam String upw,
                         @RequestParam String role) {
        userService.registerUser(uid, upw, role);  // 인스턴스 메서드 호출
        return "redirect:/login";
    }
}
