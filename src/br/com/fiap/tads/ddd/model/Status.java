package br.com.fiap.tads.ddd.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Status {

	@JsonProperty("nome")
	private String nome;

	@JsonProperty("id")
	private Integer id;

	public Status(String nome, Integer id) {
		super();
		this.nome = nome;
		this.id = id;
	}

	public Status() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Status [nome=" + nome + ", id=" + id + "]";
	}

}
