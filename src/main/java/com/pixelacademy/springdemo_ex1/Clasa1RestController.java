package com.pixelacademy.springdemo_ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Clasa1RestController {
    @GetMapping("/victor")
    public String sayMyName() {
        return "Demerji Victor"
    }
}
