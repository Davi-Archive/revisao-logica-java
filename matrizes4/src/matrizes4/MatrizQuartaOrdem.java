package matrizes4;

import java.util.Scanner;

public class MatrizQuartaOrdem {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[][] matriz = new int[5][5];
		int somaColP = 0;
		int produto = 1;
		int maiorNumero = 0;
		int media = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("Digite o valor de matriz[%d][%d] = ", i, j);
				matriz[i][j] = teclado.nextInt();
			}
		}
		System.out.println(" MATRIZ IDENTIDADE 4x4 ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf(" %d ", matriz[i][j]);
				if (i == j) {
					somaColP += matriz[i][j];
				}
			}

		}

		for (int i = 0; i < matriz.length; i++) {
			if (matriz[1][i] > maiorNumero) {
				maiorNumero = matriz[i][1];
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			produto *= matriz[1][i];
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				media += matriz[i][j];

			}

		}

		System.out.printf("%nA soma da coluna Identitdade é %d%n", somaColP);
		System.out.println("O produto da segunda linha é: " + produto);
		System.out.println("O maior numero da segunda coluna é : " + maiorNumero);
		System.out.println("A media dos números da matriz é : " + media/(matriz.length*matriz[0].length));

	}

}
