package com.gohilumang.quiz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    
    @GetMapping("/hello")
    public String handle1(Model model){
        model.addAttribute("message", "Hello World");
        return "index";
    }

    @GetMapping("/bye")
    public String handle(Model model){
        model.addAttribute("message", "Namaste!");
        return "index";
    }
}
