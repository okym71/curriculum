package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//ポイント1
@Controller
public class SampleCotroller {
    //ポイント2
    @GetMapping
    String getHello() {
        //ポイント3
        return "hello";
    }
}