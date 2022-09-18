package br.com.fiap.tads.ddd.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Atleta {

	@JsonProperty("atleta_id")
	private Long id;

	@JsonProperty("rodada_id")
	private Long rodada;

	@JsonProperty("clube_id")
	private Long clube;

	@JsonProperty("posicao_id")
	private Long posicao;

	@JsonProperty("status_id")
	private Long status;

	@JsonProperty("pontos_num")
	private Long pontos;

	@JsonProperty("preco_num")
	private Double preco;

	@JsonProperty("variacao_num")
	private Double variacao;

	@JsonProperty("media_num")
	private Double media;

	@JsonProperty("jogos_num")
	private Long jogos;

	@JsonProperty("minimo_para_valorizar")
	private double minimo;

	@JsonProperty("slug")
	private String slug;

	@JsonProperty("apelido")
	private String apelido;

	@JsonProperty("apelido_abreviado")
	private String apelidoAbreviado;

	@JsonProperty("nome")
	private String nome;

	@JsonProperty("foto")
	private String foto;

	@JsonProperty("scout")
	private Map<String, Integer> scout = new HashMap<>();

	@JsonProperty("gato_mestre")
	private GatoMestre gatoMestre;

	public Atleta(Long id, Long rodada, Long clube, Long posicao, Long status, Long pontos, Double preco,
			Double variacao, Double media, Long jogos, double minimo, String slug, String apelido,
			String apelidoAbreviado, String nome, String foto, Map<String, Integer> scout, GatoMestre gatoMestre) {
		super();
		this.id = id;
		this.rodada = rodada;
		this.clube = clube;
		this.posicao = posicao;
		this.status = status;
		this.pontos = pontos;
		this.preco = preco;
		this.variacao = variacao;
		this.media = media;
		this.jogos = jogos;
		this.minimo = minimo;
		this.slug = slug;
		this.apelido = apelido;
		this.apelidoAbreviado = apelidoAbreviado;
		this.nome = nome;
		this.foto = foto;
		this.scout = scout;
		this.gatoMestre = gatoMestre;
	}

	public Atleta() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRodada() {
		return rodada;
	}

	public void setRodada(Long rodada) {
		this.rodada = rodada;
	}

	public Long getClube() {
		return clube;
	}

	public void setClube(Long clube) {
		this.clube = clube;
	}

	public Long getPosicao() {
		return posicao;
	}

	public void setPosicao(Long posicao) {
		this.posicao = posicao;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getPontos() {
		return pontos;
	}

	public void setPontos(Long pontos) {
		this.pontos = pontos;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double getVariacao() {
		return variacao;
	}

	public void setVariacao(Double variacao) {
		this.variacao = variacao;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	public Long getJogos() {
		return jogos;
	}

	public void setJogos(Long jogos) {
		this.jogos = jogos;
	}

	public double getMinimo() {
		return minimo;
	}

	public void setMinimo(double minimo) {
		this.minimo = minimo;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getApelidoAbreviado() {
		return apelidoAbreviado;
	}

	public void setApelidoAbreviado(String apelidoAbreviado) {
		this.apelidoAbreviado = apelidoAbreviado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Map<String, Integer> getScout() {
		return scout;
	}

	public void setScout(Map<String, Integer> scout) {
		this.scout = scout;
	}

	public GatoMestre getGatoMestre() {
		return gatoMestre;
	}

	public void setGatoMestre(GatoMestre gatoMestre) {
		this.gatoMestre = gatoMestre;
	}

	@Override
	public String toString() {
		return "Atleta [id=" + id + ", rodada=" + rodada + ", clube=" + clube + ", posicao=" + posicao + ", status="
				+ status + ", pontos=" + pontos + ", preco=" + preco + ", variacao=" + variacao + ", media=" + media
				+ ", jogos=" + jogos + ", minimo=" + minimo + ", slug=" + slug + ", apelido=" + apelido
				+ ", apelidoAbreviado=" + apelidoAbreviado + ", nome=" + nome + ", foto=" + foto + ", scout=" + scout
				+ ", gatoMestre=" + gatoMestre + "]";
	}

}
