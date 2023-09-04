package com.example.remedios.demo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remedios")
public class RemedioController {
    @PostMapping//Envio de dados
    public void cadastrar(@RequestBody/*pega todos os dados do corpo da requisição e retorna na variável*/ String json){
        System.out.println(json);
    }
}
