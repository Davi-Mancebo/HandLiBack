package br.com.handli.pessoa.modelo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="cadastro_pro")
public class CadastroPro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id_pro;
    private String nome_pro;
    private Date nasc_pro;
    private int cpf;
    private String email_pro;

    @OneToOne
    @JoinColumn(name="usuarioId")
    private Usuarios usuario;

}
