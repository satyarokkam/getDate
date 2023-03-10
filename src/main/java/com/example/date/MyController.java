package com.example.date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class MyController {

    @GetMapping("/")
    public String getDate(){
        LocalDateTime dateObj= LocalDateTime.now();
        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDateTime=dateObj.format(format1);
        return formattedDateTime;
    } 

}
