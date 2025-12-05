package com.elenilson.cursojava.aula19;

import java.util.Scanner;

public class Aula19Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vetores:");
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posição " + i +" do vetor A:");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i];
		}
		System.out.println();
		System.out.print("Valores do Vetor A = " );
		for(int vet : vetorA) {
			System.out.print(vet + ", ");
		}
		System.out.println();
		System.out.print("Valores do Vetor B = " );
		for(int vet : vetorB) {
			System.out.print(vet + ", ");
		}
		scan.close();
	}

}
