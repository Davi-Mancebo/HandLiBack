package br.com.handli.pessoa.services.dto;

import java.sql.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResponseAluDto {
    private int id;
    private String nome;
    private String cpf;
    private Date nasc;
    private String email;
    private Integer usuario_id; 
}
