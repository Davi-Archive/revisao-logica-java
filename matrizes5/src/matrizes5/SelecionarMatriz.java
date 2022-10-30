package matrizes5;

import java.util.Scanner;

public class SelecionarMatriz {
	static Scanner teclado = new Scanner(System.in);
	static int[][] matriz = new int[4][4];
	static int escolha = 0;

	public static void main(String[] args) {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("Digite o valor de matriz[%d][%d] = ", i, j);
				matriz[i][j] = teclado.nextInt();
			}
		}

		do {
			System.out.printf("OPÇÕES DA MATRIZ%n--------------------%n");
			System.out.println("1 - Mostrar a Matriz");
			System.out.println("2 - Diagonal Principal");
			System.out.println("3 - Triangulo Superior");
			System.out.println("4 - Triangulo Inferior");
			System.out.println("5 - SAIR");
			System.out.printf("--------------------%n%n");
			escolha = teclado.nextInt();

			switch (escolha) {
			case 1:
				MostrarMatriz();
				break;
			case 2:
				DiagonalPrincipal();
				break;
			case 3:
				TrianguloSuperior();
				break;
			case 4:
				TrianguloInferior();
				break;
			case 5:
				escolha = 5;
				break;
			}
		} while (escolha != 5);
		System.out.println("programa executado com sucesso.");
	}

	public static void MostrarMatriz() {
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf(" %d ", matriz[i][j]);
			}
		}
		System.out.printf("%n%n%n");
	}

	public static void DiagonalPrincipal() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					System.out.printf(" %d ", matriz[i][j]);
				}

			}
		}
		System.out.printf("%n%n%n");
	}

	public static void TrianguloSuperior() {
		System.out.println("Matriz Superior");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < matriz[i].length; j++) {
				if (i < j) {
					System.out.printf(" [%d][%d] = %d ", i,j, matriz[i][j]);
				}

			}
		}
		System.out.printf("%n%n%n");
	}

	public static void TrianguloInferior() {
		System.out.println("Matriz Inferior");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < matriz[i].length; j++) {
				if (i > j) {
					System.out.printf(" [%d][%d] = %d ",i,j, matriz[i][j]);
				}

			}
		}
		System.out.printf("%n%n%n");
	}
}
