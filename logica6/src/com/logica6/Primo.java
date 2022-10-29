package com.logica6;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String continuar = "";
		do {
			System.out.println("Insira um número: ");
			int numero = teclado.nextInt();
			int primo = 0;
			
			for (int i = 1; i <= numero; i++) {
		//		System.out.println(numero+" / "+i+" = "+ numero%i);
				if(numero%i==0) {
					primo += 1;
				}
			}
			if(primo<=2) {
				System.out.println("O número é primo.");
			} else {
				System.out.println("O número NÃO é primo.");
			}
			System.out.println(" ");
			System.out.println("_____________________________");
			System.out.println("Deseja continuar?  [ S / N ]: ");
			continuar = teclado.next();
		} while (!continuar.equalsIgnoreCase("n"));
		System.out.println("Programa terminou.");
	}

}
