package by.flameksandr.spring.boot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/test")
    public String test(@RequestHeader String a,
                       @RequestHeader String b,
                       @RequestHeader String c) {

        return a + " " + b + " " + c;
    }
}
