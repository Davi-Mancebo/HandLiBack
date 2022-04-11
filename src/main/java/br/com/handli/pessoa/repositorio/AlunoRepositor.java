package br.com.handli.pessoa.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.handli.pessoa.modelo.CadastroAlu;

@Repository
public interface AlunoRepositor extends JpaRepository<CadastroAlu, Integer> {
    
}