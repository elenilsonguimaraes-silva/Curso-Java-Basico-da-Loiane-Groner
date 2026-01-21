package com.elenilson.cursojava.aula19;

import java.util.Scanner;

public class Aula19Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		
		System.out.println("Vetores:");
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor " + i +"  do vetor A[" + i +"]");
			vetorA[i] = scan.nextInt();			
		}
		for(int i = 0; i < vetorB.length; i++) {
			System.out.println("Entre com o valor " + i +"  do vetor B[" + i +"]");
			vetorB[i] = scan.nextInt();	
			vetorC[i] = vetorA[i] - vetorB[i];
		}
		System.out.println("Valores do vetor A");
		System.out.print("Valore de Vetor A = " );
		for(int vet : vetorA) {
			System.out.print(vet + ", ");
		}
		System.out.println();
		System.out.println("Valores do vetor B");
		System.out.print("Valore de Vetor B = " );
		for(int vet : vetorB) {
			System.out.print(vet + ", ");
		}
		System.out.println();
		System.out.println("As subtrações dos valores do vetor A e do vetor B são: ");
		for(int vet : vetorC) {
			System.out.print(vet + ", ");
		}

	}

}
