package br.com.programandofodacci.webSiteFodacci.controllers;


import br.com.programandofodacci.webSiteFodacci.entitys.Conta;
import br.com.programandofodacci.webSiteFodacci.repositories.ContaRepository;
import br.com.programandofodacci.webSiteFodacci.services.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/conta")
public class  ContaController {

    @Autowired
    private ContaRepository contaRepository;

    @Autowired
    private ContaService contaService;


    @GetMapping("")
    public ModelAndView menuCriarConta(Conta conta){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/criacaoConta");
        mv.addObject("conta", new Conta());
        return mv;
    }

    @PostMapping("/criarConta")
    public ModelAndView criarConta(Conta conta){
        ModelAndView mv = new ModelAndView();
        contaRepository.save(conta);
        return mv;
    }

    @PostMapping("/jsonCriarConta")
    public ModelAndView salvarConta(){
        ModelAndView mv = new ModelAndView();
        return mv;
    }


}
