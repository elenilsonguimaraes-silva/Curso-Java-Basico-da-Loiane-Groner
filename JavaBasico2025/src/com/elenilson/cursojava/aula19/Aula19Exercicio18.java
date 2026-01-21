package com.elenilson.cursojava.aula19;

import java.util.Arrays;
import java.util.Scanner;

public class Aula19Exercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vetores:");
		int[] vetIdades = new int[10];
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		int indexMaior = 0;
		int indexMenor = 0;
		
		System.out.println("Vetor de Idades");
		for(int i = 0; i < vetIdades.length ; i++){
			System.out.println("Digite a idade do vetIdades na posição vetIdades[" + i +"]:");
			vetIdades[i] = scan.nextInt();
			if(maior < vetIdades[i]) {
				maior = vetIdades[i];
				indexMaior = i;
			}
			if(menor > vetIdades[i]) {
				menor = vetIdades[i];
				indexMenor = i;
			}
		}
		for(int vet : vetIdades) {
			System.out.print(", " + vet);
		}
		System.out.println();
		System.out.println();
		System.out.println("A maior idade é: " + maior);
		System.out.println("Que se encontra na posição: " + Arrays.binarySearch(vetIdades, maior));
		System.out.println("Posição encontrada na mão é : " + indexMaior);
		System.out.println();
		System.out.println();
		System.out.println("A menor idade é: " + menor);
		System.out.println("Que se encontra na posição: " + Arrays.binarySearch(vetIdades, menor));
		System.out.println("Posição encontrada na mão é : " + indexMenor);


	}

}
