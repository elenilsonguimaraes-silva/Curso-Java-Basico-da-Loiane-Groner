package com.elenilson.cursojava.aula19;

import java.util.Scanner;

public class Aula19Exercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	
		
		int[] vetorA = new int[10];
		int n = 0;
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um número para a posição " + i);
			vetorA[i] = scan.nextInt();			
		}
		boolean palindromo = true;
		for(int i = 0; i < (vetorA.length / 2); i++) {
			if(vetorA[i] != vetorA[vetorA.length - 1 - i]) {
				palindromo = false;
				break;
			}
		}
		System.out.print("Vetor A= ");
		for(int vet : vetorA) {
			System.out.print(", " + vet);
		}
		System.out.println();
		if(palindromo) {
			System.out.println("Palíndromo");
		}else {
			System.out.println("Não é palíndromo");
		}

	}

}
