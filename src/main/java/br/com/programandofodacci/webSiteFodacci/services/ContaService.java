package br.com.programandofodacci.webSiteFodacci.services;

import br.com.programandofodacci.webSiteFodacci.entitys.Conta;
import org.springframework.stereotype.Service;
import br.com.programandofodacci.webSiteFodacci.utils.CLADJ;

@Service
public class ContaService {



    public Conta converterJson(String json){

    }

    public boolean contemId(Conta conta){
        return conta.getId() != null;
    }

    public boolean contemTelefone(Conta conta){
        return conta.getTelefone() != null;
    }

    public boolean contemNome(Conta conta){
        return conta.getNome() != null;
    }

    public boolean contemEmail(Conta conta){
        return conta.getEmail() != null;
    }

    
}
