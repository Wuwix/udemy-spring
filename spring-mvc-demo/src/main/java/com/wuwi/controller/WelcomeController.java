package com.wuwi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * @author uk00500
 * 25.06.2019
 */
@Controller
public class WelcomeController {

    @GetMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message", "aaa");
        return "welcome";
    }

    @GetMapping("/form")
    public String showForm(Map<String, Object> model) {
        model.put("message", "aaa");
        return "form";
    }

    @GetMapping("/processform")
    public String showProcessForm(Map<String, Object> model) {
        model.put("message", "aaa");
        return "processform";
    }
}
