package matrizes6_jogodavelha;

import java.util.Scanner;

public class JogoDaVelha {
	static String[][] matriz = new String[3][3];
	static Boolean vezDoX = true;
	static String vencedor = " ";

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int contador = 1;
		int escolha = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = Integer.toString(contador);
				contador++;

			}
		}

		do {
			System.out.println("JOGO DA VELHA - digite 20 para sair");
			for (int i = 0; i < matriz.length; i++) {

				System.out.printf(" %n =================== %n");

				for (int j = 0; j < matriz[i].length; j++) {
					System.out.printf(" | %s | ", matriz[i][j]);
				}
			}
			System.out.printf(" %n =================== %n");
			if (vezDoX) {
				vezDoX = false;
				System.out.print("Onde voce quer jogar o X? ");
				escolha = teclado.nextInt();

				switch (escolha) {
				case 1:
					Jogar(1, "X");
					break;
				case 2:
					Jogar(2, "X");
					break;
				case 3:
					Jogar(3, "X");
					break;
				case 4:
					Jogar(4, "X");
					break;
				case 5:
					Jogar(5, "X");
					break;
				case 6:
					Jogar(6, "X");
					break;
				case 7:
					Jogar(7, "X");
					break;
				case 8:
					Jogar(8, "X");
					break;
				case 9:
					Jogar(9, "X");
					break;
				case 20:
					break;
				default:
					break;
				}
			} else {
				vezDoX = true;
				System.out.print("Onde voce quer jogar o O? ");
				escolha = teclado.nextInt();

				switch (escolha) {
				case 1:
					Jogar(1, "O");
					break;
				case 2:
					Jogar(2, "O");
					break;
				case 3:
					Jogar(3, "O");
					break;
				case 4:
					Jogar(4, "O");
					break;
				case 5:
					Jogar(5, "O");
					break;
				case 6:
					Jogar(6, "O");
					break;
				case 7:
					Jogar(7, "O");
					break;
				case 8:
					Jogar(8, "O");
					break;
				case 9:
					Jogar(9, "O");
					break;
				case 20:
					break;
				default:
					break;
				}
			}
			// ChecarVencedor();
			if(vencedor.equals("X")) {
				escolha=20;
				System.out.print("O vencedor foi "+vencedor);
			}
			if(vencedor.equals("O")) {
				escolha=20;
				System.out.print("O vencedor foi "+vencedor);
			}
			System.out.printf("%n");
		} while (!(escolha == 20));
		System.out.println("O Jogo foi encerrado.");
	}

	public static void Jogar(int numJogado, String vezDeQuem) {
		String numJogString = Integer.toString(numJogado);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (numJogString.equalsIgnoreCase(matriz[i][j])) {
					matriz[i][j] = vezDeQuem;
				} else {
					System.out.println("Casa já escolhida");
				}
			}
		}

	}

	public static void ChecarVencedor() {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				
				if (matriz[0][j].equals("X") && matriz[0][j+1].equals("X") && matriz[0][j+2].equals("X")
						|| matriz[1][j].equals("X") && matriz[1][j].equals("X") && matriz[1][j].equals("X")
						|| matriz[2][j].equals("X") && matriz[2][j].equals("X") && matriz[2][j].equals("X")
						|| matriz[i][0].equals("X") && matriz[j][0].equals("X") && matriz[j][0].equals("X")
						|| matriz[i][1].equals("X") && matriz[j][1].equals("X") && matriz[j][1].equals("X")
						|| matriz[i][2].equals("X") && matriz[j][2].equals("X") && matriz[j][2].equals("X")
						|| matriz[0][0].equals("X") && matriz[1][1].equals("X") && matriz[2][2].equals("X")
						|| matriz[0][2].equals("X") && matriz[1][1].equals("X") && matriz[2][0].equals("X")) {
					vencedor="X";
				}
				if (matriz[0][j].equals("O") && matriz[0][j].equals("O") && matriz[0][j].equals("O")
						|| matriz[1][j].equals("O") && matriz[1][j].equals("O") && matriz[1][j].equals("O")
						|| matriz[2][j].equals("O") && matriz[2][j].equals("O") && matriz[2][j].equals("O")
						|| matriz[i][0].equals("O") && matriz[j][0].equals("O") && matriz[j][0].equals("O")
						|| matriz[i][1].equals("O") && matriz[j][1].equals("O") && matriz[j][1].equals("O")
						|| matriz[i][2].equals("O") && matriz[j][2].equals("O") && matriz[j][2].equals("O")
						|| matriz[0][0].equals("O") && matriz[1][1].equals("O") && matriz[2][2].equals("O")
						|| matriz[0][2].equals("O") && matriz[1][1].equals("O") && matriz[2][0].equals("O")) {
					vencedor="O";
				} 
				
			}
		}
	}

}
