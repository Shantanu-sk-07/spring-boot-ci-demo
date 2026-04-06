package com.Hello.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/")
    public String Hello() {
        return "Hello i am Dragon1347";
    }
}
