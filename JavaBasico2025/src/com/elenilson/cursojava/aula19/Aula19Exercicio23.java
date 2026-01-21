package com.elenilson.cursojava.aula19;

import java.util.Scanner;

public class Aula19Exercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um número para a posição " + i);
			vetorA[i] = scan.nextInt();
			if(vetorA[i] % 2 != 0) {
				System.out.println("Saiu do programa!");
				break;
			}
		}

	}

}
