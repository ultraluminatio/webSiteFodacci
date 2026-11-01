package br.com.programandofodacci.webSiteFodacci.entitys;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;
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

    @Column(name = "name", nullable = false)
    @Getter
    @Setter
    private String nome;

    @Column(name = "email", nullable = false, unique = true)
    @Getter
    @Setter
    private String email;

    @CreatedDate
    @Getter
    @Column(name = "data_registro", nullable = false)
    private LocalDateTime data;

    @Column(name ="telefone", nullable = false, unique = true)
    @Getter
    @Setter
    private String telefone;
}
