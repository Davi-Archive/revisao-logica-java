package vetores7;

import java.util.Scanner;

public class Cadeiras {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String continuar = " ";
		String[] cadeira = { "B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10" };
		String escolha = " ";
		Boolean alugada = false;
		int numero = -1;

		do {
			for (int i = 0; i < cadeira.length; i++) {
				System.out.print(" [ " + cadeira[i] + " ] ");
			}

			System.out.println(" ");
			System.out.printf("Deseja alugar alguma cadeira?%n");
			escolha = teclado.next();
			
			numero = Character.getNumericValue(escolha.charAt(1));
			if(cadeira[numero-1].equals("--")) {
				System.out.println("A Cadeira escolhida já foi alugada.");
			}
			
			for (int i = 0; i < cadeira.length; i++) {
				if (cadeira[i].equalsIgnoreCase(escolha)) {					
					System.out.printf("Cadeira %s foi alugada%n", cadeira[i]);
					cadeira[i] = "--";
				}
			}
			

			

			System.out.println(" ");
			System.out.println("Deseja continuar? [ S / N ]");
			continuar = teclado.next();
		} while (!(continuar.equalsIgnoreCase("n")));

	}
}