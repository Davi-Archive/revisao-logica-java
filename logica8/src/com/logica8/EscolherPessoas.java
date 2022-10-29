package com.logica8;

import java.util.Scanner;

public class EscolherPessoas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String sair;
		String sexo;
		int idade;
		int corCabelo;
		int homemCastanho = 0;
		int mulherLoira = 0;
		do {
			System.out.println("SELETOR DE PESSOAS:");
			System.out.println("Qual o Sexo? [ M / F ]:");
			sexo = teclado.next();
			System.out.println("Qual a Idade?");
			idade = teclado.nextInt();
			System.out.println("Qual a cor do cabelo?");
			System.out.println("[1] - Preto");
			System.out.println("[2] - Castanho");
			System.out.println("[3] - Loiro");
			System.out.println("[4] - Ruivo");
			corCabelo = teclado.nextInt();

	
			

			if (sexo.equalsIgnoreCase("m")) {
				if (idade > 18) {
					switch (corCabelo) {
					case 2:
						homemCastanho++;
						break;
					default:
						break;
					}
				}
			} else if (sexo.equalsIgnoreCase("f")) {
				if (idade >= 25 && idade <= 30) {
					switch (corCabelo) {
					case 3:
						mulherLoira++;
						break;
					default:
						break;
					}
				}
			} else {
				System.out.println("Sexo inválido.");
			}

			System.out.println("Total de Homems com mais de 18 e cabelos castanhos é "+homemCastanho);
			System.out.println("Total de Mulheres entre 25 e 30 e cabelos loiros é "+mulherLoira);			
			System.out.println("  ");
			System.out.println("_____________________");
			System.out.println("Deseja adicionar outra pessoa? [ S / N ]");
			System.out.println("  ");
			sair = teclado.next();
			System.out.println("  ");
			System.out.println("  ");

		} while (!sair.equalsIgnoreCase("n"));

		System.out.println("o programa terminou com sucesso.");
	}
}


