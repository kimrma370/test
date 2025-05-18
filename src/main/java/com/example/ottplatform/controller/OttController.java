package com.example.ottplatform.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ottplatform.entity.Ott;
import com.example.service.OttService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/ott")
public class OttController {

    private final OttService ottService;

    @GetMapping("/list")
    public String list(Model model) {
        List<Ott> ottList = ottService.findAll();
        model.addAttribute("ottList", ottList);
        return "ott-list";  // templates/ott/list.html
    }
}
