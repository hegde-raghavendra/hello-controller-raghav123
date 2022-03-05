package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("naveen")
public class HelloController {
    
    @GetMapping("/AutoflowIndex")
    public ResponseEntity<String> autoflow() {

        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl
                = "http://dummy.restapiexample.com/api/v1/employees";

        ResponseEntity<String> response
                = restTemplate.getForEntity(fooResourceUrl, String.class);

        return response;
    }

    @GetMapping("/Parm/{name}")
    public String parm(@PathVariable String name, @RequestParam String id) {
        return "hello " + name + " id is " + id;
    }
}