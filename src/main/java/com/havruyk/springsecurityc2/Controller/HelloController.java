package com.havruyk.springsecurityc2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping(value = "hello")
    public String helloGetMapping(){
        return "Hello";
    }
}
