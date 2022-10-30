package vetores6;

import java.util.Date;
import java.util.Scanner;

public class Gabarito {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nome = new String[3];
		String[] q1 = new String[3];
		String[] q2 = new String[3];
		String[] q3 = new String[3];
		String[] q4 = new String[3];
		String[] q5 = new String[3];
		int[] soma = new int[3];
		float media = 0;
		String[] gabarito = { "a", "b", "c", "d", "e" };

		for (int i = 0; i < nome.length; i++) {
			System.out.printf("--------------%n   ALUNO %n-------------- %n ");
			System.out.printf("Nome: ");
			nome[i] = teclado.next();
			System.out.print("Questão 1: ");
			q1[i] = teclado.next();
			System.out.print("Questão 2: ");
			q2[i] = teclado.next();
			System.out.print("Questão 3: ");
			q3[i] = teclado.next();
			System.out.print("Questão 4: ");
			q4[i] = teclado.next();
			System.out.print("Questão 5: ");
			q5[i] = teclado.next();
		}

		for (int i = 0; i < 3; i++) {
			if (q1[i].equalsIgnoreCase(gabarito[0])) {
				soma[i] += 2;
			}
			if (q2[i].equalsIgnoreCase(gabarito[1])) {
				soma[i] += 2;
			}
			if (q3[i].equalsIgnoreCase(gabarito[2])) {
				soma[i] += 2;
			}
			if (q4[i].equalsIgnoreCase(gabarito[3])) {
				soma[i] += 2;
			}
			if (q5[i].equalsIgnoreCase(gabarito[4])) {
				soma[i] += 2;
			}
		}

		System.out.printf("---------%n NOTAS FINAIS %n------------%n ");
		for (int i = 0; i < 3; i++) {
			System.out.printf("%s tirou a nota de %d %n ", nome[i], soma[i]);
		}
		System.out.printf("%n-----------------------------------%n ");
		for (int i = 0; i < 3; i++) {
			media+=soma[i];
		}
		
		System.out.printf("A média da turma foi %,.1f", media/3);
	}

}
