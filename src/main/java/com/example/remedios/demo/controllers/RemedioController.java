package com.example.remedios.demo.controllers;

import com.example.remedios.demo.remedio.DadosCadastroRemedio;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remedios")
public class RemedioController {
    @PostMapping//Envio de dados
    //Apenas retorna todos os dados
    /*public void cadastrar(@RequestBody/*pega todos os dados do corpo da requisição e retorna na variável String json){
        System.out.println(json);
    }*/
    public void cadastrar(@RequestBody DadosCadastroRemedio dados){
        System.out.println();
    }
}
