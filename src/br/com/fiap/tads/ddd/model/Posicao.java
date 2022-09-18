package br.com.fiap.tads.ddd.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Posicao {

	@JsonProperty("id")
	private Long id;

	@JsonProperty("nome")
	private String nome;

	@JsonProperty("abreviacao")
	private String abreviacao;

	public Posicao(Long id, String nome, String abreviacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.abreviacao = abreviacao;
	}

	public Posicao() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAbreviacao() {
		return abreviacao;
	}

	public void setAbreviacao(String abreviacao) {
		this.abreviacao = abreviacao;
	}

	@Override
	public String toString() {
		return "Posicao [id=" + id + ", nome=" + nome + ", abreviacao=" + abreviacao + "]";
	}

}
