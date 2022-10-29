package logica5;

import java.util.Scanner;

public class CalculoImc {

	public static float CalculoIMC(float altura, float peso) {
		float imc = (float) (peso / Math.pow(altura, 2));
		return imc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Boolean continuar = true;
		while (continuar) {
			System.out.println("insira a altura em metros: (1,82) ");
			float altura = teclado.nextFloat();
			System.out.println("insira a Peso em kilogramas: (80) ");
			float peso = teclado.nextFloat();
			float res = CalculoIMC(altura, peso);
			if (res > 18 && res < 25) {
				System.out.println("Parabéns, você está no seu peso ideal. IMC= " + res);
			} else {
				System.out.println("Você não está na faixa de peso ideal. IMC= " + res);
			}
			System.out.println("________________________");
			System.out.println("Deseja continuar [S/N]");
			String peguntaContinuar = teclado.next();
			if (peguntaContinuar.equalsIgnoreCase("N")) {
				continuar = false;
				System.out.println("Programa finalizado.");
			}

		} ;
	}

}
