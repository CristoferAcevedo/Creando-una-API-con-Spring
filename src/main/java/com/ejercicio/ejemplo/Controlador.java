package com.ejercicio.ejemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class Controlador {

    @GetMapping("/hola")
    public String saludo(){
        return "Cristofer el mejor";
    }
}
