package com.dev.xandy.cadastro_usuarios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class controler {

    @GetMapping("/boasvindas")
    public String boavindas() {
        return "Boa vindas ao sistema de cadastro ;)";
    }

    @GetMapping("/cadastro")
    public String cadastro() {
        return "Iniciando o cadastro";
    }
}

