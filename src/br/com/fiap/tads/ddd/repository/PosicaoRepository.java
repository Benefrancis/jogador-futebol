package br.com.fiap.tads.ddd.repository;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.fiap.tads.ddd.model.Posicao;

public class PosicaoRepository {
	private static List<Posicao> posicoes = new ArrayList<>();

	static {

		try {
			ObjectMapper objectMapper = new ObjectMapper();
			// @formatter:off
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("./resources/posicoes.json"), StandardCharsets.UTF_8));
			posicoes = objectMapper.readValue(br, new TypeReference<ArrayList<Posicao>>() {});
			// @formatter:on
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static List<Posicao> findAll() {
		return posicoes;
	}

	public static Posicao findById(Long id) {
		try {
			List<Posicao> ret = posicoes.stream().filter(p -> p.getId().equals(id)).toList();
			Posicao atleta = (ret.size() > 0) ? ret.get(0) : null;

			return atleta;
		} catch (Exception e) {
			return null;
		}

	}

}
