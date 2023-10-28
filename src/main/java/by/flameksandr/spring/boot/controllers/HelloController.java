package by.flameksandr.spring.boot.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class HelloController {

    @PostMapping("/test/{name}")
    public String test(@PathVariable String name,
                       @RequestHeader String a,
                       @RequestHeader String b,
                       @RequestHeader String c,
                       @RequestBody String body) {

        return name + " " + a + " " + b + " " + c + " " + body;
    }

    @GetMapping("/all")
    public Map<String, String> all(@RequestHeader Map<String, String> map) {
        return map;
    }
}
