package matrizes6_jogodavelha;

import java.util.Scanner;

public class JogoDaVelha {
	static String[][] matriz = new String[3][3];
	static Boolean vezDoX = true;
	static String vencedor = " ";
	static int casaJogada = 0;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int escolha = 0;
		// gera o jogo da velha
		GerarJogo();

		do {
			System.out.println("JOGO DA VELHA - digite 20 para sair");
			MostrarJogadas();
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
			// reseta casa jogada
			casaJogada = 0;

			// o vencedor é visto a cada jogada
			ChecarVencedor();
			// fim ver vencedor

			if (vencedor.equals("X")) {
				escolha = 20;
				MostrarJogadas();
				System.out.print("O vencedor foi " + vencedor);
			}
			if (vencedor.equals("O")) {
				escolha = 20;
				MostrarJogadas();
				System.out.print("O vencedor foi " + vencedor);
			}
			System.out.printf("%n");
		} while (!(escolha == 20));
		System.out.println("O Jogo foi encerrado.");
	}

	public static void MostrarJogadas() {
		for (int i = 0; i < matriz.length; i++) {

			System.out.printf(" %n =================== %n");

			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf(" | %s | ", matriz[i][j]);
			}
		}
		System.out.printf(" %n =================== %n");
	}

	public static void GerarJogo() {
		int contador = 1;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = Integer.toString(contador);
				contador++;

			}
		}
	}

	public static void Jogar(int numJogado, String vezDeQuem) {
		String numJogString = Integer.toString(numJogado);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (numJogString.equalsIgnoreCase(matriz[i][j])) {
					matriz[i][j] = vezDeQuem;
				} else {
					casaJogada++;
					RetornaMsg();
				}
			}
		}
		

	}

	public static void RetornaMsg() {
		if (casaJogada > 8) {
			System.out.printf("%n%n-----------------%n");
			System.out.println("Casa já escolhida");
			System.out.println("-----------------");
		}

	}

	public static void ChecarVencedor() {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				CondicaoVitoria("X");
				CondicaoVitoria("O");
			}
		}
	}

	public static void CondicaoVitoria(String condicao) {
		// linha 1 vitoria
		if (matriz[0][0].equals(condicao) && matriz[0][1].equals(condicao) && matriz[0][2].equals(condicao)) {
			vencedor = condicao;
		}
		// linha 2 vitoria
		if (matriz[1][0].equals(condicao) && matriz[1][1].equals(condicao) && matriz[1][2].equals(condicao)) {
			vencedor = condicao;
		}
		// linha 3 vitoria
		if (matriz[2][0].equals(condicao) && matriz[2][1].equals(condicao) && matriz[2][2].equals(condicao)) {
			vencedor = condicao;
		}
		// coluna 1 vitoria
		if (matriz[0][0].equals(condicao) && matriz[1][0].equals(condicao) && matriz[2][0].equals(condicao)) {
			vencedor = condicao;
		}
		// coluna 2 vitoria
		if (matriz[0][1].equals(condicao) && matriz[1][1].equals(condicao) && matriz[2][1].equals(condicao)) {
			vencedor = condicao;
		}
		// coluna 3 vitoria
		if (matriz[0][2].equals(condicao) && matriz[1][2].equals(condicao) && matriz[2][2].equals(condicao)) {
			vencedor = condicao;
		}
		// diagonal 1 vitoria
		if (matriz[0][0].equals(condicao) && matriz[1][1].equals(condicao) && matriz[2][2].equals(condicao)) {
			vencedor = condicao;
		}
		// diagonal 2 vitoria
		if (matriz[0][2].equals(condicao) && matriz[1][1].equals(condicao) && matriz[2][0].equals(condicao)) {
			vencedor = condicao;
		}

	}

}
