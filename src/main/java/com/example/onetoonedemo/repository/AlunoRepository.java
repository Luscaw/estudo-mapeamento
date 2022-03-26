package com.example.onetoonedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetoonedemo.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
