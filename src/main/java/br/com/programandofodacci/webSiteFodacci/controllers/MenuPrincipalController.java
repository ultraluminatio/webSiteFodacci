package br.com.programandofodacci.webSiteFodacci.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller("/")
public class MenuPrincipalController {


    @GetMapping("/")
    public String menuInicial(Model modelo){
        modelo.addAttribute("titulo", "Programando Fodacci Web Site");
        modelo.addAttribute("descricao", "Olá, nós somos um pequeno grupo de desenvolvimento de TI, a qual está desenvolvendo jogos, " +
                "apps e web sites, inclusive esse");
        return "html/menuInicial";
    }

}
