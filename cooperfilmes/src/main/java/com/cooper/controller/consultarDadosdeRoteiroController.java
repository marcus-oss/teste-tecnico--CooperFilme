package com.cooper.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consultar")
@Tag(name = "endpoint para mostar os dados  atual do roteiro ",
        description = "endpoint para mostar os dados atual do roteiro para o usuario")
public class consultarDadosdeRoteiroController {


    //end-point da rota de mostrar os dados atual  do roteiro
    @GetMapping("/dados")
    @Operation(summary = " metododo get para mostrar os dados atual  que o roteiro se encontra ",
            description = "rota para o  usuario consultar dados do roteiro")
    public String dadosRoteiro() {
        return "consultar dados do roteiro ";
    }

}
