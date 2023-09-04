package com.example.remedios.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//Representa que será um endpoint
@RequestMapping("/hello")//Será acessado por esse endereço na url
public class helloWorld {

    @GetMapping//Verbo utilizado para retomar o valor desse método
    public String olaMundo(){
        return "hello world";
    }
}
