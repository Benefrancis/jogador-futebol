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

import br.com.fiap.tads.ddd.model.Status;

public class StatusRepository {

	private static List<Status> status = new ArrayList<>();

	static {

		try {
			ObjectMapper objectMapper = new ObjectMapper();
			// @formatter:off
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("./resources/status.json"), StandardCharsets.UTF_8));
			status = objectMapper.readValue(br, new TypeReference<ArrayList<Status>>() {});
			// @formatter:on
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static List<Status> findAll() {
		return status;
	}

}
