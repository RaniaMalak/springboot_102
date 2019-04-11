package com.example.springboot_102;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController1 {
    @RequestMapping("/loadform")
    public String homepage(Model model){
        model.addAttribute("myvar","say hello");
        return "hometemplate";
    }
}
