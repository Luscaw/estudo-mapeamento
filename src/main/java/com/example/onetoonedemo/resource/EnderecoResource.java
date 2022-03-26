package com.example.onetoonedemo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.onetoonedemo.model.Endereco;
import com.example.onetoonedemo.repository.EnderecoRepository;

@RestController
@RequestMapping("/escola/enderecos")
public class EnderecoResource {
	
	@Autowired
	private EnderecoRepository er;
	
	@GetMapping("/alunos")
	public List<Endereco> getEnderecos(){
		return er.findAll();
	}
	
	@GetMapping("/alunos/{codigo}")
	public List<Endereco> getEnderecos(@PathVariable Long codigo) {
		return er.findByCodigoAluno(codigo);
}
	
	@PostMapping("/alunos")
	@ResponseStatus(HttpStatus.CREATED)
	public Endereco salvarEndereco(@RequestBody Endereco endereco) {
		return er.save(endereco);
	}
}
