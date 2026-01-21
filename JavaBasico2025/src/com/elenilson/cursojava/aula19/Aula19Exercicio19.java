package com.elenilson.cursojava.aula19;

import java.util.Scanner;

public class Aula19Exercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double[] vetorA = new double[10];
		double[] vetorB = new double[vetorA.length];
		double[] vetorResult = new double[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digita as notas do Aluno " + (i + 1 ));
			System.out.println("Digita a nota "+ (i + 1 )+" do Aluno " + (i + 1 ));
			vetorA[i] = scan.nextDouble();
			System.out.println("Digita a nota "+ (i + 2 )+" do Aluno " + (i + 1 ));
			vetorB[i] = scan.nextDouble();
			vetorResult[i] = ((vetorA[i] + vetorB[i]) / 2);
		}
		for(int i = 0; i < vetorResult.length; i++) {
			System.out.println("A média das notas,  nota1: "+ vetorA[i] +" + nota2: "+ 
		vetorB[i] + ", do Aluno " + (i +1) + " é igual a:  "+vetorResult[i]);
			if(vetorResult[i] >= 7) {
				System.out.println("Situação do Aluno: Aprovado!");
			}else {
				System.out.println("Situação do Aluno: Reprovado!");
			}
			System.out.println();
		}
		

	}

}
