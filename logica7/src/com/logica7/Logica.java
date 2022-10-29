package com.logica7;

import java.util.Scanner;

public class Logica {

	public static String contador(int num) {
		String soma="";
		if (num == 1) {
			for(int i=1;i<=10;i++) {
				soma += i + ".. ";
			}
			return soma;
		}
		if (num == 2) {
			for(int i=10;i>=1;i--) {
				soma += i + ".. ";
			}
			return soma;
		}

		return "Digite um numero de 1 a 3";
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int sair;
		do {
			System.out.println("Digite:");
			System.out.println("1. Contar de 1 até 10.");
			System.out.println("2. Contar de 10 até 1.");
			System.out.println("3. Para sair.");
						int digitou = teclado.nextInt();
			String res = contador(digitou);
			System.out.println(res);
			System.out.println("  ");
			System.out.println("_____________________");
			System.out.println("  ");
			System.out.println("Para Sair digite 3, qualquer outra tecla reinicia o programa.");
			System.out.println("  ");
			sair = teclado.nextInt();
			System.out.println("  ");
			System.out.println("  ");
			
		} while (!(sair==3));
		System.out.println("o programa terminou com sucesso.");
	}


}
