package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("naveen")
public class HelloController {
    
    @GetMapping("/AutoflowIndex")
    public String autoflow() {
        return "hello world from autoflow";
    }

    @GetMapping("/Parm")
    public String parm() {
        return "hello world from parm";
    }
}