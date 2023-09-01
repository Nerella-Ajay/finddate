package com.example.date;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Date;

@RestController


public class MyController {
    @GetMapping("/")
    public String getDate(){
        Date date = new Date()
        return date;
    }
}
