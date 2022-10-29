package com.logica2;

import java.util.Scanner;

public class OlaType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o seu nome");
		String res= teclado.next();
		System.out.println("Olá " +res+", seja bem vindo.");
	}

}
