package by.flameksandr.spring.boot.controllers;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Map;

@RestController
public class HelloController {

    @PostMapping("/test/{name}")
    public String test(@PathVariable String name,
                       @RequestHeader String a,
                       @RequestHeader String b,
                       @RequestHeader String c,
                       @RequestBody String body,
                       HttpServletResponse response) {
            response.setStatus(HttpServletResponse.SC_ACCEPTED);
            response.addHeader("Test", "good");
        return name + " " + a + " " + b + " " + c + " " + body;
    }

    @GetMapping("/all")
    public Map<String, String> all(@RequestHeader Map<String, String> map) {
        return map;
    }

    @GetMapping(value = "/pdf", produces = MediaType.APPLICATION_PDF_VALUE)
    public byte[] file(){
        byte[] file = new byte[100];
        return file;
    }
}
