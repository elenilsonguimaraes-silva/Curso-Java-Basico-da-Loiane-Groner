package com.elenilson.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Entre com o número de pessoas que serão entrevistadas:");
		int numEntrevistados = scan.nextInt();
		
		String[][] nomesFilhos = new String[numEntrevistados][];
		
		for(int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Entre com a quantidade de filhos ");
			int qtdeFilhos = scan.nextInt();
			
			nomesFilhos[i] = new String[qtdeFilhos];
			
			for(int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println("Digite o nome do filho " + (j +1));
				
				nomesFilhos[i][j] = scan.next();
				
			}
		}
			
		for(int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Pessoa " + i + " tem " + nomesFilhos[i].length + " filhos");
			for(int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
					
			}
		}
	}

}
