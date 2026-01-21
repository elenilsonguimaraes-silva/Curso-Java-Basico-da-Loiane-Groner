package com.elenilson.cursojava.aula19;

import java.util.Scanner;

public class Aula19Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vetores:");
		int[] vetorA = new int[10];
		int soma = 0;
		
		
		for(int i = 0; i < vetorA.length ; i++) {
			System.out.println("Entre com o valor " + i +"  do vetor A[" + i +"]");
			vetorA[i] = scan.nextInt();	
			if(vetorA[i] % 5 == 0) {
				soma += vetorA[i];
			}
		}
		System.out.println("A soma dos valores que são multiplos de 5: ");
		for(int vet : vetorA) {
			if(vet % 5 == 0) {
			System.out.print(vet + " + ");
			}			
		}
		System.out.println(" = " + soma);

	}

}
