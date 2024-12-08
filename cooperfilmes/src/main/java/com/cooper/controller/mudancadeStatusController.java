package com.cooper.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consultar")
@Tag(name = "endpoint para mudança de status do roteiro",
        description = "endpoint para o usuario consultar a mudança de status do  roteiro")
public class mudancadeStatusController {

    //end-point da rota de  mudança
    @PostMapping("/mudanca de status")
    @Operation(summary = "endpoint para o usuario consultar a mudança de status do roteiro",
            description = "mudança de status do roteiro")
    public String mudancadeStatus() {
        return "consultar a mudança de status do roteiro ";
    }
}
