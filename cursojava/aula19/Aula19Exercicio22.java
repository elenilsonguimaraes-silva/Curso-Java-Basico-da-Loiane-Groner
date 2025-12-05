package com.elenilson.cursojava.aula19;

import java.util.Scanner;

public class Aula19Exercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int qtde0 = 0 ;
		int qtde1 = 0;
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int) Math.round(Math.random() * 1);
			if(vetorA[i] == 0) {
				qtde0++;
			}else{
				qtde1++;
			}
		}
		double porc0 = (qtde0 * 100) / vetorA.length;
		double porc1 = (qtde1 * 100) / vetorA.length;
		System.out.print("Valores do vetor A:");
		for(int vet : vetorA) {
			System.out.print(", " + vet);
		}
		System.out.println();
		System.out.println();
		System.out.println("A porcentagem de 0 é igual a: " + porc0 + "%");
		System.out.println("A porcentagem de 1 é igual a: " + porc1 + "%");

	}

}
