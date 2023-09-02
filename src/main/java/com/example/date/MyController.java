package com.example.date;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController


public class MyController {
    @GetMapping("/")
    public String getDate(){
        LocalDate now = LocalDate.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(now, format1); 
        return date;
    }
}
