package com.example.awsProba;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @CrossOrigin
    @RequestMapping("/")
    public String index(){
        return "sikerult";
    }
}
