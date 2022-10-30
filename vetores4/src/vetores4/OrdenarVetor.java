package vetores4;


// Algoritimo que ordena VETORES

public class OrdenarVetor {

	public static void main(String[] args) {
		int[] vetor = { 0, 9, 6, 5, 56, 1, 2, 3 };
		int auxiliar = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("O vetor na posição %d é de %d%n", i, vetor[i]);
		}

		for (int i = 0; i < vetor.length - 1; i++) {
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[i] > vetor[j]) {
					auxiliar = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = auxiliar;
				}

			}
		}

		System.out.println("_____________________");
		System.out.println("ORDENADO");
		System.out.println("_____________________");
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("O vetor na posição %d é de %d %n", i, vetor[i]);
		}
	}

}
