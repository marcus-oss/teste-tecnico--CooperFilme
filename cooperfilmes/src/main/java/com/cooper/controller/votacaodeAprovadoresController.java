package com.cooper.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/votação")
@Tag(name = "endpoint para votação do roteiro",
        description = "endpoint para os aprovadores votar no melhor roteiro")
public class votacaodeAprovadoresController {

    //end-point da rota de  mudança
    @GetMapping("/votos")
    @Operation(summary = " metododo get que obtenha os dados da votação  dos aprovadores do roteiro",
            description = "rota para os aprovadores votar nos roteiros")
    public String votacaodoRoteiro() {
        return "Votação dos aprovadores";
    }
}
