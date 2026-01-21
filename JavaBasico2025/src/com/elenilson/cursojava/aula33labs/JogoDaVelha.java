package com.elenilson.cursojava.aula33labs;

public class JogoDaVelha {
	char[][] jogoVelha;
	int jogada;
	
	
	public JogoDaVelha() {
		jogoVelha = new char[3][3];
		jogada = 1;
	}
	
	public JogoDaVelha(char[][] jogoVelha, int jogada) {
		super();
		this.jogoVelha = new char[3][3];
		this.jogada = jogada;
	}
	
	
	public char[][] getJogoVelha() {
		return jogoVelha;
	}

	public void setJogoVelha(char[][] jogoVelha) {
		this.jogoVelha = jogoVelha;
	}

	public int getJogada() {
		return jogada;
	}

	public void setJogada(int jogada) {
		this.jogada = jogada;
	}

	public boolean validarJogada(int linha, int coluna, char sinal) {
		if(this.getJogoVelha()[linha][coluna] == 'X' || this.getJogoVelha()[linha][coluna] =='O') {
			return false;
		}else {
			this.setarJogoVelha(linha, coluna, sinal);
			this.jogada++;
			return true;
		}
		/*if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
			return false;
		} else {// jogada válida
			jogoVelha[linha][coluna] = sinal;
			jogada++;
			return true;
		}
		*/
	}
	
	void imprimirTabuleiro() {
		//imprimir tabuleriro
		for(int i = 0; i < this.getJogoVelha().length;i++) {
			for(int j = 0; j < this.getJogoVelha()[i].length; j++){
				System.out.print(" " + this.getJogoVelha()[i][j] + " | ");
			}
			System.out.println();
		}
		
	}
	boolean verificarGanhador(char sinal) {
		// verificar se tem ganhador
		if ((jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal) || // linha 1
				(jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[1][2] == sinal) || // linha 2
				(jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha[2][2] == sinal) || // linha 3
				(jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal && jogoVelha[2][0] == sinal) || // coluna 1
				(jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1] == sinal) || // coluna 2
				(jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2] == sinal) || // coluna 3
				(jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal) || // Diagonal
				(jogoVelha[0][2] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][0] == sinal)) { // diagonal
																										// Inversa
			return true;
		}

		return false;
	}
	
	boolean vezJogador1() {
		if(this.jogada % 2 == 1) {
			return true;
		}
			return false;
	}
	
	public void setarJogoVelha(int linha, int coluna, char sinal) {
		this.jogoVelha[linha][coluna] = sinal;
		
	}


	

}
