package com.example.demo;

import com.example.demo.Model.Employee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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

    @PostMapping("/Parm")
    public @ResponseBody ResponseEntity<String> parmPost(@RequestBody Employee emp) {

        return new ResponseEntity<String>(emp.toString(), HttpStatus.ACCEPTED);
    }

}