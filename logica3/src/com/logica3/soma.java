package com.logica3;

import java.util.Scanner;

public class soma {
	
	public static int Soma(int a, int b) {
		int res = a + b;
		return res;
	}	
	
	public static float Media(int... a) {
		int res=0;
		for(int valor: a) {
			res += valor;
		}
		return res/2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro numero");
		n1 = teclado.nextInt();
		System.out.println("Digite o segundo numero");
		n2 = teclado.nextInt();
		int res = Soma(n1, n2);
		System.out.println("A soma é "+res);
		
		System.out.println(Media(1,3,4,6,7,8,9));
	}

}
