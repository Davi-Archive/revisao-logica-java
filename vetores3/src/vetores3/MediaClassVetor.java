package vetores3;

import java.util.Scanner;

public class MediaClassVetor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nome = new String[4];
		int[] n1 = new int[4];
		int[] n2 = new int[4];
		float[] media = new float[4];
		float mediaSalaAccumulator = 0;
		float mediaSala = 0;
		int pessoasAcimaDaMediaSala = 0;

		for (int i = 0; i < 4; i++) {
			System.out.println("Aluno " + i);
			System.out.print("Nome do Aluno: ");
			nome[i] = teclado.next();
			System.out.print("Primeira Nota: ");
			n1[i] = teclado.nextInt();
			System.out.print("Segunda Nota: ");
			n2[i] = teclado.nextInt();
			media[i] = (n1[i] + n2[i]) / 2;
			mediaSalaAccumulator += media[i];
		}
		mediaSala = mediaSalaAccumulator / 4;

		for (int i = 0; i < 4; i++) {
			System.out.printf("A media do %s é %.1f%n", nome[i], media[i]);
			if (media[i] > mediaSala) {
				pessoasAcimaDaMediaSala++;
			}
		}

		System.out.printf("A média da sala é %.1f%n", mediaSala);
		System.out.printf("%d pessoas estão acima da média da sala", pessoasAcimaDaMediaSala);

	}

}
