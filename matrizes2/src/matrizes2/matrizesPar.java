package matrizes2;

import java.util.Scanner;

public class matrizesPar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int valorPar = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("Insira um numero em matriz[%d][%d]: ", i, j);
				matriz[i][j] = teclado.nextInt();
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("[%d][%d] = %d ", i, j, matriz[i][j]);
			}
		}
		System.out.println(" ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] % 2 == 0) {
					System.out.printf("%nmatriz[%d][%d] = %d  É PAR", i, j, matriz[i][j]);
					valorPar++;
				}

			}
		}
		System.out.printf("%nForam digitados %d valores PARES", valorPar);

	}

}
