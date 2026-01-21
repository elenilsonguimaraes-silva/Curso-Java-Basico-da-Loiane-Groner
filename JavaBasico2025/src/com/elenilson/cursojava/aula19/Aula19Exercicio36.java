package com.elenilson.cursojava.aula19;

import java.util.Scanner;

public class Aula19Exercicio36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int[11];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] =(int) Math.pow(2, i);	
		}
		System.out.print("Vetor A= ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(" " + vetorA[i]);
		}

	}

}
