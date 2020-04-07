package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ConvertController {
    @GetMapping("/convert")
    public String index(){
      return "index";
    }

    @PostMapping("/result")
    public String submit(@RequestParam String usd, Model model) {
        float vnd = Float.parseFloat(usd) * 23000;
        model.addAttribute("vnd", vnd);
        return "result";
    }
}
