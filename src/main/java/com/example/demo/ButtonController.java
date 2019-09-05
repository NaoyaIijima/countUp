package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ButtonController{
    private int N = 0;
    
    @GetMapping
    public String getRequest(){
        return "count";
    }
    
    @PostMapping("/count")
    public String postRequest(Model model){
        
        N += 1;
        model.addAttribute("num", N);
        
        return "count";
        
    }
}