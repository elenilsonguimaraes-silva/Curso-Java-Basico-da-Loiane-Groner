package com.elenilson.cursojava.aula19;

import java.util.Scanner;

public class Aula19Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vetores:");
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int par = 0;
		
		
		for(int i = 0; i < vetorA.length ; i++) {
			System.out.println("Entre com o valor " + i +"  do vetor A[" + i +"]");
			vetorA[i] = scan.nextInt();	
			if(vetorA[i] % 2 == 0) {
				par++;
				vetorB[i] = vetorA[i];
			}
		}
		System.out.println("A quantida de números pares são: " + par);
		System.out.println("São eles: ");
		for(int vet : vetorB) {
			if(vet != 0) {
				System.out.print(vet + ", ");
			}
		}

	}

}
