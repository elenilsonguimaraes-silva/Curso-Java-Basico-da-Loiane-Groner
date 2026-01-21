package com.elenilson.cursojava.aula19;

import java.util.Scanner;

public class Aula19Exercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um número para a posição " + i + " do vetorA");
			vetorA[i] = scan.nextInt();		
			
			vetorB[vetorA.length - i -1] = vetorA[i];
		}
		System.out.print("Vetor A= ");
		for(int vet : vetorA) {
			System.out.print(vet + ", ");
		}
		System.out.println();
		System.out.print("Vetor B= ");
		for(int vet : vetorB) {
			System.out.print(vet + ", ");
		}
		
	}

}
