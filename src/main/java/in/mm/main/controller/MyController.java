package in.mm.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/showData")
    public String showData(){
        return "Hello World";
    }
}