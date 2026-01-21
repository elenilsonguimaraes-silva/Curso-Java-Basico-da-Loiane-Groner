package com.elenilson.cursojava.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula19Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vetores:");
		double[] vetorA = new double[15];
		double[] vetorB = new double[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor " + i +" do vetor A[" + i +"]");
			vetorA[i] = scan.nextInt();
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		System.out.println();
		System.out.print("Valore de Vetor A = " );
		for(double vet : vetorA) {
			System.out.print(vet + " ");
		}
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		System.out.print("Valore de Vetor B = " );
		for(double vet : vetorB) {
			System.out.print(df.format(vet) + " ");
		}

	}

}
