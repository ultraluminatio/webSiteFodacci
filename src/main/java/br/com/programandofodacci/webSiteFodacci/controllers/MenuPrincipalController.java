package br.com.programandofodacci.webSiteFodacci.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuPrincipalController {


    @GetMapping("/")
    public String menuInicial(){

        return "<h1>Teste</h1>";
    }

}
