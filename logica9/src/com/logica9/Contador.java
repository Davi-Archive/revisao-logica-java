package com.logica9;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num = 0;
		int soma = 0;
		do {
			System.out.println("Digite um numero para ser somado: ");
			num = teclado.nextInt();
			soma += num;
			System.out.println(" ");
			System.out.print("O resultado da soma é: ");
			System.out.println(soma);
			System.out.println("________________________");
			System.out.println(" ");
		} while (!(num == 0));
		System.out.println("Zero foi digitado e o programa terminou com sucesso.");
	}

}
