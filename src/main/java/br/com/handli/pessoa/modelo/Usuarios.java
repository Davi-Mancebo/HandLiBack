package br.com.handli.pessoa.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import br.com.handli.pessoa.config.EnumerateCadastro;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Usuarios {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true, name = "id")
    private int id_usuarios;

    private String nome;


    private String cpf;

    private LocalDate nasc;

    private String email;


    @Enumerated(EnumType.STRING)
    private EnumerateCadastro tipo;

    @Column(nullable = true)
    private String password;
    
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @PrePersist
    protected void prePersist(){
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }
    @PreUpdate
    protected void preUpdate(){
        updatedAt = LocalDateTime.now();
    }
}
