package com.elenilson.cursojava.aula19;

import java.util.Scanner;

public class Aula19Exercicio31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
	
		int posB = 0;
		
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um número para a posição " + i + " do vetorA");
			vetorA[i] = scan.nextInt();				
			if(vetorA[i] % 2 == 0) {
				vetorB[posB] = vetorA[i];
				posB++;
			}
		}
		for(int i = 0; i < vetorA.length; i++) {	
			if(vetorA[i] % 2 != 0) {
				vetorB[posB] = vetorA[i];
				posB++;
			}
		}
		
		System.out.print("Vetor A= ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(", " + vetorA[i]);
		}
		System.out.println();
		System.out.print("Vetor B= ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(", " + vetorB[i]);
		}
	}

}
