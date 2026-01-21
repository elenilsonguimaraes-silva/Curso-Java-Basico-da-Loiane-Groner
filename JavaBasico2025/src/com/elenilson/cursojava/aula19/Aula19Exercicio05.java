package com.elenilson.cursojava.aula19;

import java.util.Scanner;

public class Aula19Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vetores:");
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor " + i +"  do vetor A[" + i +"]");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i] * i;
		}
		System.out.println();
		System.out.print("Valore de Vetor A = " );
		for(int vet : vetorA) {
			System.out.print(vet + ", ");
		}
		System.out.println();
		System.out.print("Valore de Vetor B = " );
		for(int vet : vetorB) {
			System.out.print(vet + ", ");
		}

	}

}
