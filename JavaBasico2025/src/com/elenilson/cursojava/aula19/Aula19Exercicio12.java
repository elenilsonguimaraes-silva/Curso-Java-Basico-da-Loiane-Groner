package com.elenilson.cursojava.aula19;

import java.util.Scanner;

public class Aula19Exercicio12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vetores:");
		int[] vetorA = new int[10];
		int soma = 0;
		
		
		for(int i = 0; i < vetorA.length ; i++) {
			System.out.println("Entre com o valor " + i +"  do vetor A[" + i +"]");
			vetorA[i] = scan.nextInt();	
			soma += vetorA[i];
		}
		System.out.println("A soma dos valores são: ");
		for(int vet : vetorA) {
			System.out.print(vet + " + ");
		}
		System.out.println(" = " + soma);
	}

}
