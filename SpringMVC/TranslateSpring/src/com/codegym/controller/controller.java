package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controller {
    @GetMapping("/translate")
    public String index(){
        return "index";
    }

    @PostMapping("/result")
    public String result(@RequestParam String english, Model model){
        String result;
        switch (english) {
            case "book":
                result = "quyen sach";
                break;
            case "car":
                result = "xe o to";
                break;
            default:
                result = "can't found!";
               break;
        }
        model.addAttribute("result", result);
        return "result";
    }
}
