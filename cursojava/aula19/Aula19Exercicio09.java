package com.elenilson.cursojava.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula19Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vetores:");
		double[] vetorA = new double[10];
		double[] vetorB = new double[vetorA.length];
		double[] vetorC = new double[vetorA.length];
		
		
		for(int i = 0; i < vetorA.length ; i++) {
			System.out.println("Entre com o valor " + i +"  do vetor A[" + i +"]");
			vetorA[i] = scan.nextInt();			
		}
		for(int i = 0; i < vetorB.length ; i++) {
			System.out.println("Entre com o valor " + i +"  do vetor B[" + i +"]");
			vetorB[i] = scan.nextInt();	
			vetorC[i] = vetorA[i] / vetorB[i];
		}
		System.out.println("Valores do vetor A");
		System.out.print("Valore de Vetor A = " );
		for(double vet : vetorA) {
			System.out.print(vet + ", ");
		}
		System.out.println();
		System.out.println("Valores do vetor B");
		System.out.print("Valore de Vetor B = " );
		for(double vet : vetorB) {
			System.out.print(vet + ", ");
		}
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		System.out.println("Os valores das divisões do vetor A e do vetor B são: ");
		for(double vet : vetorC) {
			System.out.print(df.format(vet) + ", ");
		}

	}

}
