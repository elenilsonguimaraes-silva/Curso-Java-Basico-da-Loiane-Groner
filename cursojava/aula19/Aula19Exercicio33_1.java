package com.elenilson.cursojava.aula19;

import java.util.Scanner;

public class Aula19Exercicio33_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int soma = 0;
		System.out.println("Números Primos");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um número para a posição " + i + " do vetorA");
			vetorA[i] = scan.nextInt();	
		}
		boolean primo;
		String msg;
		
		System.out.println();
		for(int i =  0 ; i < vetorA.length ; i++) {
			primo = true;
			msg = "";
			for(int j = 2; j < vetorA[i]; j++) {
				if(vetorA[i] % j   == 0) {
					primo = false;
					break;
				}
			}
			if(primo) {
				msg = " é primo!";
			}else {
				msg = " não é primo!";
			}
			System.out.println("O número " + vetorA[i] + msg);
				
			
		}	

	}

}
