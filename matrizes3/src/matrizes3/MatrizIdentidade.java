package matrizes3;

public class MatrizIdentidade {

	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		int valorPar = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					matriz[i][j] = 1;
				} else {
					matriz[i][j] = 0;
				}
			}
		}
		System.out.println(" MATRIZ IDENTIDADE TEM COLUNAS E LINHAS DE NUMEROS IGUAIS = 1 ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf(" %d ", matriz[i][j]);
			}
		}

	}

}
