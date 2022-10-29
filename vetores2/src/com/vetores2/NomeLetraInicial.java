package com.vetores2;

import java.util.Scanner;

public class NomeLetraInicial {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] vetorNome = new String[5];
		String nomeDigitado = " ";
		int novoVetorPosicao = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o nome: ");
			nomeDigitado=teclado.next();
			String firstLetter = Character.toString(nomeDigitado.charAt(0));
			if(firstLetter.equalsIgnoreCase("c")) {
				vetorNome[novoVetorPosicao] = nomeDigitado;
				novoVetorPosicao++;
			}
		}
		System.out.println("LISTAGEM FINAL DE NOMES COM C: ");
		for(String valor: vetorNome) {
			if(!(valor==null)) {
				System.out.println(valor);
			}
			
		}
		
	}
}
