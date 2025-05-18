package com.example.ottplatform.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dto.RentDto;
import com.example.service.RentService;

import lombok.RequiredArgsConstructor;
@Controller
@RequestMapping("/rent")
@RequiredArgsConstructor
public class RentController {

    private final RentService rentService;

    @GetMapping("/user/{userno}")
    public String showRentList(@PathVariable Long userno, Model model) {
        List<RentDto> rentList = rentService.findByUserno(userno);
        model.addAttribute("rentList", rentList);
        model.addAttribute("userno", userno); // 필요 시 폼에 같이 넘김
        return "rent-status"; // templates/rent-list.html
    }
}
