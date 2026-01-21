package com.elenilson.cursojava.aula19;

import java.util.Scanner;

public class Aula19Exercicio35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		System.out.println("Números Pares!");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um número para a posição " + i + " do vetorA");
			vetorA[i] = scan.nextInt();	
		}
		System.out.println();
		/*
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Numero  " + vetorA[i] + ": ");
			for(int j = 1;j <= vetorA[i]; j++) {
				if(vetorA[i] % j == 0) {
					System.out.println(j + " é divisor");
				}
			}
			System.out.println();
		}	
		*/
		System.out.println();
		
		for(int vetor : vetorA) {
			System.out.println("Numero  " + vetor + ": ");
			for( int vet : vetorA) {
				if(vetor % vet == 0) {
					System.out.println(vet + " é divisor");
				}
			}	
			System.out.println();
		}
		
	}
}
