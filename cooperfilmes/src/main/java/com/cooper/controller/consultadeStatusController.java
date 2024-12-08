package com.cooper.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consultar")
@Tag(name = "endpoint consultar  status do roteiro",
        description = "endpoint para o usuario  consultar status do roteiro ")
public class consultadeStatusController {

    //end-point da rota de status
    @GetMapping("/status do roteiro")
    @Operation(summary = " metododo get que consulta os  dados do roteiro enviado pelo usuario ",
            description = "rota para o usuario consultar  o dados atual do seu roteiro")
    public String consultarRoteiro() {
        return "consultar status atual do roteiro";
    }

}
