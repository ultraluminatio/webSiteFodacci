package br.com.programandofodacci.webSiteFodacci.repositories;

import br.com.programandofodacci.webSiteFodacci.entitys.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Long> {

}
