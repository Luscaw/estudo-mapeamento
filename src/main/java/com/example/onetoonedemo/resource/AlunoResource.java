package com.example.onetoonedemo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.onetoonedemo.model.Aluno;
import com.example.onetoonedemo.repository.AlunoRepository;

@RestController
@RequestMapping("/escola")
public class AlunoResource {
	
	@Autowired
	private AlunoRepository ar;
	
	@GetMapping("/alunos")
	public List<Aluno> getAlunos(){
		return ar.findAll();
	}
	
	@PostMapping("/alunos")
	@ResponseStatus(HttpStatus.CREATED)
	public Aluno save(@RequestBody Aluno aluno) {
		return ar.save(aluno);
	}
	
	@DeleteMapping("/alunos/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void excluir(@PathVariable Long codigo) {
		ar.deleteById(codigo);
	}
}
