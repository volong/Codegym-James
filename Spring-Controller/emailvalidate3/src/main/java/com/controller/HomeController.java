package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



@Controller
public class HomeController {
    private static Pattern pattern;
    private Matcher matcher;

    // Khai báo Regex
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public HomeController() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        return "home";
    }



    @RequestMapping(value = "/validate", method = RequestMethod.POST)
    public String user(@RequestParam String email, Model model) {
        boolean isvalid = this.validate(email);
        if (!isvalid) {
            model.addAttribute("message", "Email is invalid");
            return "home";
        }

        model.addAttribute("email", email);
        return "success";
    }

    private boolean validate(String EMAIL_REGEX) {
        matcher = pattern.matcher(EMAIL_REGEX);
        return matcher.matches();
    }
}