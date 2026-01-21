package com.elenilson.cursojava.aula19;

import java.util.Scanner;

public class Aula19Exercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int soma = 0;
		System.out.println("Números Primos");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um número para a posição " + i + " do vetorA");
			vetorA[i] = scan.nextInt();	
		}
		System.out.println();
		for(int i = 1; i <= (vetorA.length - 1); i++) {
			soma = 0;
			for(int j = 0;j < vetorA[i]; j++) {
				if(vetorA[i] % (j + 1) == 0) {
					soma++;
				}
				//System.out.println(vetorA[i] + " " + (j + 1));
			}
			if(soma == 2) {
				System.out.println("O número " + vetorA[i] + " é um número primo!");
				
			}
		}	

	}

}
