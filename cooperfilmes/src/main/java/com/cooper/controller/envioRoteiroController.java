package com.cooper.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roteiro")
@Tag(name = "endpoint para o usuario enviar o roteiro para analise ",
        description = "endpoint para o usuario enviar o seu roteiro  para analise")
public class envioRoteiroController {

    //end-point da rota de enviar roteiro
    @GetMapping("/enviar")
    @Operation(summary = " metododo get para enviar o roteiro para analise ",
            description = "rota para envio de roteiro do usuario")
    public String envioRoteiro() {
        return "enviar roteiro de filme ";
    }
}
