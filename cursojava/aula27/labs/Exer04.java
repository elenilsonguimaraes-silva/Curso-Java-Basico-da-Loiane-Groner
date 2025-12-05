package com.elenilson.cursojava.aula27.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		Scanner scan = new Scanner(System.in);
		
		JogoVelha jogoDaVelha = new JogoVelha();
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		boolean ganhou = false;
		char sinal;
		int linha = 0, coluna = 0;
		
		while(!ganhou) {
			if (jogoDaVelha.vezJogador1()) {
				System.out.println("Vez do jogador de 1. Escolha linha e coluna (1-3)");
				sinal = 'X';
			} else {
				System.out.println("Vez do jogador de 2. Escolha linha e coluna (1-3)");
				sinal = 'O';
			}

			linha = valor("Linha", scan);
			coluna = valor("Coluna", scan);

			if(!jogoDaVelha.validarJogada(linha, coluna, sinal)){
				System.out.println("System.out.println(\"Entrada inválida, tente novamente!");
			}

			jogoDaVelha.imprimirTabuleiro();

			if(ganhou = jogoDaVelha.verificarGanhador('X')) {
				System.out.println("Parabéns, jogador 1 ganhou!");
			}else if(ganhou = jogoDaVelha.verificarGanhador('O')) { 
				System.out.println("Parabéns, jogador 2 ganhou!");
			}
				
			if(jogoDaVelha.jogada > 9) {
				System.out.println("Ninguém ganhou a partida!");
				ganhou = true;
			}
		}
	}
	static int valor(String tipoValor, Scanner scan) {
		int valor = 0;
		boolean valorValido = false;
		while(!valorValido) {
			System.out.println("Entre com a " + tipoValor + "1, 2 ou 3");
			valor = scan.nextInt();
			if(valor >= 1 && valor <= 3) {
				valorValido = true;
			}else {
				System.out.println("Entrada Inválida, tente novamengte");
			}
		}
		valor--;
		return valor;
	}
	

}
