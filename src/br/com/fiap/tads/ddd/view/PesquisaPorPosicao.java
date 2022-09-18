package br.com.fiap.tads.ddd.view;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import br.com.fiap.tads.ddd.model.Atleta;
import br.com.fiap.tads.ddd.model.Clube;
import br.com.fiap.tads.ddd.model.Posicao;
import br.com.fiap.tads.ddd.repository.AtletaRepository;
import br.com.fiap.tads.ddd.repository.ClubeRepository;
import br.com.fiap.tads.ddd.repository.PosicaoRepository;

public class PesquisaPorPosicao {

	public static void show() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("=====     PESQUISA DE JOGADORES DE FUTEBOL POR POSICAO      ===========");

		List<Posicao> posicoes = PosicaoRepository.findAll();
		
		for (int i = 0; i < posicoes.size(); i++) {
			Posicao p = posicoes.get(i);
			System.out.println("[" + p.getId() + "] " + p.getNome() + "");
		}

		System.out.println("===============================================================");
		Long posicao = sc.nextLong();
		
		for (Clube clube : ClubeRepository.findAll()) {
			// @formatter:off
	 		System.out.println("\n"+clube.getNome() + "       ................................................................................................................");
			List<Atleta> atletas =	AtletaRepository.findAll()
					.stream()
					.filter(a -> a.getPosicao().equals(posicao))
					.filter(a -> a.getClube().equals(clube.getId()))
					.collect(Collectors.toList());
		 	for(Atleta a: atletas) {
		 		System.out.println(a);
		 	}
	 		// @formatter:on
		}
		sc.close();
	}

}
