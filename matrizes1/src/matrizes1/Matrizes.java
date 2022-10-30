package matrizes1;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[][] matriz = new int[3][2];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("Insira um valor inteiro de matriz[%d][%d]: ", i, j);
				matriz[i][j] = teclado.nextInt();

			}
		}

		for (int i = 0; i < matriz.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf(" [%d][%d] = %d ", i, j, matriz[i][j]);
			}
		}

	}

}
