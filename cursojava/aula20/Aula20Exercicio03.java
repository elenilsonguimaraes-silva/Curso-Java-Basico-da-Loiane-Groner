package com.elenilson.cursojava.aula20;

import java.util.Scanner;

public class Aula20Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[][] matrizBiDimensional = new int[3][3];
		int qtdePares = 0;
		int qtdeImpares = 0;
		int linha = 0;
		int coluna = 0;
		 System.out.println("Pares ou Ímpares:");
		for(int i = 0; i < matrizBiDimensional.length; i++) {
			for(int j = 0; j < matrizBiDimensional[i].length; j++) {
				System.out.println("Entre com o valor da linha " + i + ", coluna " + j);
				matrizBiDimensional[i][j] = scan.nextInt(); 
				 if(matrizBiDimensional[i][j] % 2 == 0) {
					 qtdePares++;
				 }else {
					 qtdeImpares++;
				 }
			}
			
		}
		for(int i = 0; i < matrizBiDimensional.length; i++) {
			for(int j = 0; j < matrizBiDimensional[i].length; j++) {
				System.out.print(" " +  matrizBiDimensional[i][j]);
			}
			System.out.println();
		}
		System.out.println("A quantidade de números pares da série é: " + qtdePares);
		System.out.println("A quantidade de números ímpares da série é: "	+ qtdeImpares);
	}
}
