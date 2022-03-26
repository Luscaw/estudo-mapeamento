package com.example.onetoonedemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_endereco")
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_endereco")
	private Long codEndereco;

	@Column(name = "logradouro")
	private String logradouro;

	@Column(name = "cidade")
	private String cidade;

	@ManyToOne
	@JoinColumn(name = "cod_aluno")
	private Aluno aluno;

	public Endereco() {

	}

	public Endereco(String logradouro, String cidade, Aluno aluno) {
		super();
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.aluno = aluno;
	}

	public Long getCodEndereco() {
		return codEndereco;
	}

	public void setCodEndereco(Long codEndereco) {
		this.codEndereco = codEndereco;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

}
