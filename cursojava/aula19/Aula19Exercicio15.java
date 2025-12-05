package com.elenilson.cursojava.aula19;

import java.util.Scanner;

public class Aula19Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vetores:");
		int[] vetorA = new int[10];
		int par = 0;
		int impar = 0;
		int porcPar = 0;
		int porcImpar = 0;
		
		
		for(int i = 0; i < vetorA.length ; i++) {
			System.out.println("Entre com o valor " + i +"  do vetor A[" + i +"]");
			vetorA[i] = scan.nextInt();	
			if(vetorA[i] % 2 == 0) {
				par++;
			}else {
				impar++;
			}
		}
		porcPar = (par * 100) / vetorA.length;
		System.out.println("O percentual dos números pares: ");
		for(int vet : vetorA) {
			if(vet % 2 == 0) {
				System.out.print(vet + ", ");
			}			
		}
		System.out.println(" é de " + porcPar +"%");
		System.out.println("O percentual dos números ímpares: ");
		porcImpar = (impar * 100) / vetorA.length;
		for(int vet : vetorA) {
			if(vet % 2 != 0) {
				System.out.print(vet + ", ");
			}			
		}
		System.out.println(" é de " + porcImpar +"%");


	}

}
