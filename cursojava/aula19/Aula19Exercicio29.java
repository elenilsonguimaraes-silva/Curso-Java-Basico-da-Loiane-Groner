package com.elenilson.cursojava.aula19;

import java.util.Scanner;

public class Aula19Exercicio29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length + vetorB.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um número para a posição " + i + " do vetorA");
			vetorA[i] = scan.nextInt();	
			vetorC[i] = vetorA[i];
		}
		for(int i = 0; i < vetorB.length; i++) {
			System.out.println("Entre com um número para a posição " + i + " do vetorB");
			vetorB[i] = scan.nextInt();	
			vetorC[vetorB.length + i] = vetorB[i];
		}
		System.out.print("Vetor A= ");
		for(int vet : vetorA) {
			System.out.print(", " + vet);
		}
		System.out.println();
		System.out.print("Vetor B= ");
		for(int vet : vetorB) {
			System.out.print(", " + vet);
		}
		System.out.println();
		System.out.print("Vetor C= ");
		for(int vet : vetorC) {
			System.out.print(", " + vet);
		}

	}

}
