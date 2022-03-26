package com.example.onetoonedemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.onetoonedemo.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
	
	@Query("SELECT e FROM Endereco e WHERE e.aluno.codigo = :codigoAluno")
	List<Endereco> findByCodigoAluno(Long codigoAluno);
	
}
