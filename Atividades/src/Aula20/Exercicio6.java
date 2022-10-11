package Aula20;

import java.util.Scanner;

//6. Faça um programa para jogar o jogo da velha. O programa deve
//permitir que dois jogadores façam uma partida do jogo da velha,
//usando o computador para ver o tabuleiro. Cada jogador vai
//alternadamente informando a posição onde deseja colocar a sua
//peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e
//determinar automaticamente quando o jogo terminou e quem foi o
//vencedor (jogador1 ou jogador2). A cada nova jogada, o programa
//deve atualizar a situação do tabuleiro na tela.

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char[][] tabuleiro = new char[3][3];

		System.out.println("JOGADOR 1 = X");
		System.out.println("JOGADOR 2 = O");

		int jogada = 1;
		char simbolo;
		int linha = 0;
		int coluna = 0;

		while (true) {

			if (jogada % 2 == 1) {
				System.out.println("É a vez do JOGADOR 1");
				simbolo = 'X';
			} else {
				System.out.println("É a vez do JOGADOR 2.");
				simbolo = 'O';
			}
			boolean linhaValida = false;
			while (linhaValida == false) {
				System.out.println("Digite a linha desejada (1-3): ");
				linha = sc.nextInt();
				if (linha > 0 && linha < 4) {
					linhaValida = true;
				} else {
					System.out.println("Posição inválida! Tente novamente uma posição válida (1-3): ");
				}
			}
			boolean colunaValida = false;
			while (colunaValida == false) {
				System.out.println("Digite a coluna desejada (1-3): ");
				coluna = sc.nextInt();
				if (coluna > 0 && coluna < 4) {
					colunaValida = true;
				} else {
					System.out.println("Posição inválida! Tente novamente uma posição válida (1-3): ");
				}
			}

			linha = linha - 1;
			coluna = coluna - 1;

			if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
				System.out.println("Posição já preenchida, tente novamente em outra posição");
			} else {
				tabuleiro[linha][coluna] = simbolo;
				jogada++;
			}

			for (int i = 0; i < tabuleiro.length; i++) {
				for (int j = 0; j < tabuleiro[i].length; j++) {
					System.out.print(tabuleiro[i][j] + " | ");

				}
				System.out.println();
			}

			if ((tabuleiro[0][0] == 'X') && (tabuleiro[0][1] == 'X') && (tabuleiro[0][2] == 'X')
					|| (tabuleiro[1][0] == 'X') && (tabuleiro[1][1] == 'X') && (tabuleiro[1][2] == 'X')
					|| (tabuleiro[2][0] == 'X') && (tabuleiro[2][1] == 'X') && (tabuleiro[2][2] == 'X')
					|| (tabuleiro[0][0] == 'X') && (tabuleiro[1][0] == 'X') && (tabuleiro[2][0] == 'X')
					|| (tabuleiro[0][1] == 'X') && (tabuleiro[1][1] == 'X') && (tabuleiro[2][1] == 'X')
					|| (tabuleiro[0][2] == 'X') && (tabuleiro[1][2] == 'X') && (tabuleiro[2][2] == 'X')
					|| (tabuleiro[0][0] == 'X') && (tabuleiro[1][1] == 'X') && (tabuleiro[2][2] == 'X')
					|| (tabuleiro[0][2] == 'X') && (tabuleiro[1][1] == 'X') && (tabuleiro[2][0] == 'X')) {
				System.out.println("Jogo encerrado. O ganhador foi o JOGADOR 1");
				break;
			} else

			if ((tabuleiro[0][0] == 'O') && (tabuleiro[0][1] == 'O') && (tabuleiro[0][2] == 'O')
					|| (tabuleiro[1][0] == 'O') && (tabuleiro[1][1] == 'O') && (tabuleiro[1][2] == 'O')
					|| (tabuleiro[2][0] == 'O') && (tabuleiro[2][1] == 'O') && (tabuleiro[2][2] == 'O')
					|| (tabuleiro[0][0] == 'O') && (tabuleiro[1][0] == 'O') && (tabuleiro[2][0] == 'O')
					|| (tabuleiro[0][1] == 'O') && (tabuleiro[1][1] == 'O') && (tabuleiro[2][1] == 'O')
					|| (tabuleiro[0][2] == 'O') && (tabuleiro[1][2] == 'O') && (tabuleiro[2][2] == 'O')
					|| (tabuleiro[0][0] == 'O') && (tabuleiro[1][1] == 'O') && (tabuleiro[2][2] == 'O')
					|| (tabuleiro[0][2] == 'O') && (tabuleiro[1][1] == 'O') && (tabuleiro[2][0] == 'O')) {
				System.out.println("Jogo encerrado. O ganhador foi o JOGADOR 2");
				break;

			} else if (jogada == 9) {
				System.out.println("Jogo encerradi e ninguém ganhou! ");
				break;
			}
		}

	}

}
