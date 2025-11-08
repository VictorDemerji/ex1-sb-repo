package com.pixelacademy.springdemo_ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Clasa2RestController {
    @GetMapping("/cristian")
    public String sayMyName() {
        return "Mija Cristian";
    }
}
