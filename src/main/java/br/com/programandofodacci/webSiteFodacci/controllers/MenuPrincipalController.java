package br.com.programandofodacci.webSiteFodacci.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MenuPrincipalController {


    @GetMapping("/")
    public String menuInicial(){

        return "html/menuInicial";
    }

}
