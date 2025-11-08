package com.pixelacademy.springdemo_ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Clasa3RestController {
    @GetMapping("/tudor")
    public String sayMyName() {
        return "Tepordei Tudor"
    }
}
