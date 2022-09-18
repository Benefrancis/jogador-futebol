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

import br.com.fiap.tads.ddd.model.Atleta;

public class AtletaRepository {
	private static List<Atleta> atletas = new ArrayList<>();

	static {

		try {
			ObjectMapper objectMapper = new ObjectMapper();
			// @formatter:off
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("./resources/atletas.json"), StandardCharsets.UTF_8));
			atletas = objectMapper.readValue(br, new TypeReference<ArrayList<Atleta>>() {});
			// @formatter:on
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static List<Atleta> findAll() {
		return atletas;
	}

	public static Atleta findById(Long id) {
		try {
			List<Atleta> ret = atletas.stream().filter(a -> a.getId().equals(id)).toList();
			Atleta atleta = (ret.size() > 0) ? ret.get(0) : null;

			return atleta;
		} catch (Exception e) {
			return null;
		}

	}

	public static List<Atleta> findByClubeId(long clube_id) {
		 
		return atletas.stream().filter(a -> a.getClube().equals(clube_id)).toList();
		
	}

}
