package br.com.fiap.tads.ddd.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GatoMestre {

	@JsonProperty("media_pontos_mandante")
	private Double mediaPontosMandandte;

	@JsonProperty("media_pontos_visitante")
	private Double mediaPontosVisitante;

	@JsonProperty("media_minutos_jogados")
	private Integer mediaMinutosJogados;

	@JsonProperty("minutos_jogados")
	private Integer minutosJogados;

	@JsonProperty("scouts")
	private Map<String, Map<String, Double>> scouts = new HashMap<>();

	public GatoMestre(Double mediaPontosMandandte, Double mediaPontosVisitante, Integer mediaMinutosJogados,
			Integer minutosJogados, Map<String, Map<String, Double>> scouts) {
		super();
		this.mediaPontosMandandte = mediaPontosMandandte;
		this.mediaPontosVisitante = mediaPontosVisitante;
		this.mediaMinutosJogados = mediaMinutosJogados;
		this.minutosJogados = minutosJogados;
		this.scouts = scouts;
	}

	public GatoMestre() {
		super();
	}

	public Double getMediaPontosMandandte() {
		return mediaPontosMandandte;
	}

	public void setMediaPontosMandandte(Double mediaPontosMandandte) {
		this.mediaPontosMandandte = mediaPontosMandandte;
	}

	public Double getMediaPontosVisitante() {
		return mediaPontosVisitante;
	}

	public void setMediaPontosVisitante(Double mediaPontosVisitante) {
		this.mediaPontosVisitante = mediaPontosVisitante;
	}

	public Integer getMediaMinutosJogados() {
		return mediaMinutosJogados;
	}

	public void setMediaMinutosJogados(Integer mediaMinutosJogados) {
		this.mediaMinutosJogados = mediaMinutosJogados;
	}

	public Integer getMinutosJogados() {
		return minutosJogados;
	}

	public void setMinutosJogados(Integer minutosJogados) {
		this.minutosJogados = minutosJogados;
	}

	public Map<String, Map<String, Double>> getScouts() {
		return scouts;
	}

	public void setScouts(Map<String, Map<String, Double>> scouts) {
		this.scouts = scouts;
	}

	@Override
	public String toString() {
		return "GatoMestre [mediaPontosMandandte=" + mediaPontosMandandte + ", mediaPontosVisitante="
				+ mediaPontosVisitante + ", mediaMinutosJogados=" + mediaMinutosJogados + ", minutosJogados="
				+ minutosJogados + ", scouts=" + scouts + "]";
	}

}
