package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("raghav")
public class RaghuController {
    
    @GetMapping("/AutoflowIndex")
    public String autoflow() {
        return "hello world from autoflow raghu";
    }

    @GetMapping("/Parm")
    public String parm() {
        return "hello world from parm raghav";
    }
}