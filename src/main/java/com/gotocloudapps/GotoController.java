package com.gotocloudapps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GotoController {

    @GetMapping("/")
    public String sayHello(){
        return "How are you?";
    }
}
