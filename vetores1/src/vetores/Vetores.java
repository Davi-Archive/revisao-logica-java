package vetores;

import java.util.Scanner;

public class Vetores {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] vetor= new int[4];		
		for (int i = 0; i < 4; i++) {
			System.out.printf("Digite o "+ i +"° valor: ");
			vetor[i]=teclado.nextInt();
		}
		for(int valor:vetor) {
			System.out.print(valor + " ");
		}
		
	}
}
