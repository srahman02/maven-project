package com.gotocloudapps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GotoController {

    @GetMapping("/")
    public String sayHello(){
        return "Another change made to the controller";
    }
}
