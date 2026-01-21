package com.elenilson.cursojava.aula19;

import java.util.Scanner;

public class Aula19Exercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um número para a posição " + i + " do vetorA");
			vetorA[i] = scan.nextInt();				
		}
		System.out.println();
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Tabuada de " + vetorA[i]);
			for(int j = 1; j <=  10; j++) {
				System.out.println(j +" X "+ vetorA[i] + " = " + (j * vetorA[i]) );
			}	
			System.out.println();
		}	
	}
}
