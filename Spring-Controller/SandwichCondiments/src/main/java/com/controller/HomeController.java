package com.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
 @GetMapping("/home")
 public String homeController( ){
    return "home";
 }

 @PostMapping("/save")
 public String save(@RequestParam("condiments")String[] condiments, Model model) {
     model.addAttribute("sandwich", condiments);
     return "result";
 }
}
