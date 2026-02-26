package com.gateway.apigateway.Controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class APIController {
    @GetMapping(path = "/", produces = MediaType.TEXT_PLAIN_VALUE)
    public String home(){
        return "Hola soy el api gateway";
    }
}
