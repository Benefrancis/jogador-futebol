package br.com.fiap.tads.ddd.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Clube {

	@JsonProperty("id")
	private Long id;

	@JsonProperty("nome")
	private String nome;

	@JsonProperty("abreviacao")
	private String abreviacao;

	@JsonProperty("nome_fantasia")
	private String nomeFantasia;

	@JsonProperty("escudos")
	private Map<String, String> escudos = new HashMap<String, String>();

	public Clube() {
		super();
	}

	public Clube(Long id, String nome, String abreviacao, String nomeFantasia, Map<String, String> escudos) {
		super();
		this.id = id;
		this.nome = nome;
		this.abreviacao = abreviacao;
		this.nomeFantasia = nomeFantasia;
		this.escudos = escudos;
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

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public Map<String, String> getEscudos() {
		return escudos;
	}

	public void setEscudos(Map<String, String> escudos) {
		this.escudos = escudos;
	}

	@Override
	public String toString() {
		return "Clube [id=" + id + ", nome=" + nome + ", abreviacao=" + abreviacao + ", nomeFantasia=" + nomeFantasia
				+ ", escudos=" + escudos + "]";
	}

}
