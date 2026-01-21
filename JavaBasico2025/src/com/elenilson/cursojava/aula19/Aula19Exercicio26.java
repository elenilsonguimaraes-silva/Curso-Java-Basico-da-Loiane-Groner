package com.elenilson.cursojava.aula19;

import java.util.Scanner;

public class Aula19Exercicio26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um número para a posição " + i + " do vetorA");
			vetorA[i] = scan.nextInt();		
		}
		for(int i = 0; i < vetorB.length; i++) {
			System.out.println("Entre com um número para a posição " + i + " do vetorB");
			vetorB[i] = scan.nextInt();	
			if(vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			}else if(vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;
			}else {
				vetorC[i] = -1;
			}
		}
		System.out.print("Vetor A= ");
		for(int vet : vetorA) {
			System.out.print(", " + vet);
		}
		System.out.println();System.out.print("Vetor B= ");
		for(int vet : vetorB) {
			System.out.print(", " + vet);
		}
		System.out.println();System.out.print("Vetor C= ");
		for(int vet : vetorC) {
			System.out.print(", " + vet);
		}

	}

}
