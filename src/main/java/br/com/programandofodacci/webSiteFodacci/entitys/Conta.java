package br.com.programandofodacci.webSiteFodacci.entitys;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.time.LocalDateTime;

@NoArgsConstructor 
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "conta")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Getter
    @Setter
    @Size(min=5, max = 45, message = "O seu nickname só pde ter de 5 até 45 caracteres")
    private String nome;

    @Column(name = "email", nullable = false, unique = true)
    @Getter
    @Setter
    private String email;

    @CreatedDate
    @Getter
    @Column(name = "data_registro", nullable = false)
    private LocalDateTime data = LocalDateTime.now();

    @Column(name ="telefone", nullable = false, unique = true)
    @Getter
    @Setter
    private String telefone;

    @Column(name = "password", nullable = false)
    @Getter
    @Setter
    private String password;
}
