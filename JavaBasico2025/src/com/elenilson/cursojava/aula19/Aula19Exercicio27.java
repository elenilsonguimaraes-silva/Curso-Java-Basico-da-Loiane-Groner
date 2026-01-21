package com.elenilson.cursojava.aula19;

import java.util.Scanner;

public class Aula19Exercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um número para a posição " + i + " do vetorA");
			vetorA[i] = scan.nextInt();		
			if(vetorA[i] < 7) {
				vetorB[i] = 'a';
			}else if(vetorA[i] == 7) {
				vetorB[i] = 'b';
			}else if(vetorA[i] > 7 && vetorA[i] < 10) {
				vetorB[i] = 'c';
			}else if(vetorA[i] == 10) {
				vetorB[i] = 'd';
			}else if(vetorA[i] > 10) {
				vetorB[i] = 'e';
			}
		}
		System.out.print("Vetor A= ");
		for(int vet : vetorA) {
			System.out.print(", " + vet);
		}
		System.out.println();System.out.print("Vetor B= ");
		for(int vet : vetorB) {
			System.out.print(", " + vet);
		}
		System.out.println();System.out.print("Vetor B= ");
		for(int vet : vetorB) {
			System.out.print(", " + (char)vet);
		}

	}

}
