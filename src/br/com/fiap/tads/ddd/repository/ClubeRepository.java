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

import br.com.fiap.tads.ddd.model.Clube;

public class ClubeRepository {

	private static List<Clube> clubes = new ArrayList<>();

	static {

		try {
			ObjectMapper objectMapper = new ObjectMapper();
			// @formatter:off
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("./resources/clubes.json"), StandardCharsets.ISO_8859_1));
			clubes = objectMapper.readValue(br, new TypeReference<ArrayList<Clube>>() {});
			// @formatter:on
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static List<Clube> findAll() {
		return clubes;
	}

	public static Clube findById(Long clube) {
		return clubes.stream().filter(c -> c.getId().equals(clube)).findFirst().orElse(null);
	}
}
