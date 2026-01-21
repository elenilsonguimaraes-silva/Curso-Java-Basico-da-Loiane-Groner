package com.elenilson.cursojava.aula19;

import java.util.Scanner;

public class Aula19Exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vetores:");
		int[] vetorA = new int[10];
		int soma = 0;
		int quant = 0;
		double media = 0;
		
		
		for(int i = 0; i < vetorA.length ; i++) {
			System.out.println("Entre com o valor " + i +"  do vetor A[" + i +"]");
			vetorA[i] = scan.nextInt();	
			if(vetorA[i] % 2 != 0) {
				soma += vetorA[i];
				quant++;
			}
		}
		media = soma / quant;
		System.out.println("A média aritmética simples dos elementos ímpares ");
		for(int vet : vetorA) {
			if(vet % 2 != 0) {
				System.out.print(vet + ", ");
			}			
		}
		System.out.println("é: " + media);


	}

}
