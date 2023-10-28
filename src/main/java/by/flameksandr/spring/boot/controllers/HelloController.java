package by.flameksandr.spring.boot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/test")
    public String test(@RequestParam String a,
                       @RequestParam String b,
                       @RequestParam String c) {

        return a + " " + b + " " + c;
    }
}
