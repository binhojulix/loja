package br.com.faluz.productapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")

public class UserController {

    @GetMapping("/")
    public String getMensagem(){
        var x = 1;
        var y = 3;
        var soma = x+y;
        return "Spring boot is working  user controller!" + soma;
    }

}
