package com.cooper.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Home")
@Tag(name = "endpoint para  o usuario logar na aplicação",
        description = "endpoint para mostar os dados atual do roteiro para o usuario")
public class LoginController {

    //end-point da rota login
    @PostMapping("/login")
    @Operation(summary = "metodo post para o usuario logado", description = "pagina home da aplicação")
    public String Login() {
        return "";
    }
}
