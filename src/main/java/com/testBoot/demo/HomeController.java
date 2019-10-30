package com.testBoot.demo;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  

@RestController  
public class HomeController {  
    @RequestMapping("/login")  
    public String hello(){  
        return"Returns Login Code Here! check for auto deployment";  
    }  
}  
