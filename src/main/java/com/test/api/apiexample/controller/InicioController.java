package com.test.api.apiexample.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
@Slf4j
public class InicioController {

    @Autowired
    private Environment environment;

    @GetMapping
    public ResponseEntity sayHello(){
        log.info("Respondemos!");
        return ResponseEntity.ok("Hola a todos"+environment.getActiveProfiles()[0]);
    }
}
