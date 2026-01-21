package com.elenilson.cursojava.aula19;

import java.util.Scanner;

public class Aula19Exercicio34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int soma = 0;
		System.out.println("Números Pares!");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um número para a posição " + i + " do vetorA");
			vetorA[i] = scan.nextInt();	
		}
		System.out.println();
		
		for(int i = 0; i < (vetorA.length); i++) {
			System.out.print("Numero pares de zero até o número " + vetorA[i] + ": ");
			for(int j = 0;j <= vetorA[i]; j++) {
				if(j % 2 == 0) {
					System.out.print(" " + j);
				}
			}
			System.out.println();
		}
	}

}
