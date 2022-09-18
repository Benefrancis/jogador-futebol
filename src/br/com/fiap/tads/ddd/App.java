package br.com.fiap.tads.ddd;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import br.com.fiap.tads.ddd.model.Atleta;
import br.com.fiap.tads.ddd.model.Clube;
import br.com.fiap.tads.ddd.model.Posicao;
import br.com.fiap.tads.ddd.repository.AtletaRepository;
import br.com.fiap.tads.ddd.repository.ClubeRepository;
import br.com.fiap.tads.ddd.repository.PosicaoRepository;
import br.com.fiap.tads.ddd.repository.StatusRepository;
import br.com.fiap.tads.ddd.view.PesquisaPorPosicao;

@SuppressWarnings("unused")
public class App {

	public static void main(String[] args) {

		PesquisaPorPosicao.show();

	}

	private static void printAtletaById() {
		Atleta a = AtletaRepository.findById(42234L);
		System.out.println(a);
	}

	private static void printStatus() {
		StatusRepository.findAll().forEach(System.out::println);
	}

	private static void printAtletas() {
		AtletaRepository.findAll().forEach(System.out::println);
	}

	private static void printClubes() {
		ClubeRepository.findAll().forEach(System.out::println);
	}

}
