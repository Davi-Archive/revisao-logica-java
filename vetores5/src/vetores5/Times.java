package vetores5;

import java.util.Scanner;

public class Times {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] times = new String[4];
		System.out.printf("Jogos de Times %n");
		for (int i = 0; i < 3; i++) {
			System.out.print("Digite o nome do time: ");
			times[i] = teclado.next();

		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(!(times[i]==times[j])||!(times[j]==times[i])) {
					System.out.printf("%s [ ] x [ ] %s %n", times[i], times[j]);
				}
				
			}
		}

		teclado.close();

	}
}