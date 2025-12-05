package com.elenilson.cursojava.aula20;

import java.util.Random;
import java.util.Scanner;

public class Aula20Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[][] matrizBiDimensional = new int[10][10];
		
		Random numeroRandom = new Random();
		int maiorL5 = Integer.MIN_VALUE;
		int menorL5 = Integer.MAX_VALUE;
		int maiorCol7 = Integer.MIN_VALUE; 
		int menorCol7 = Integer.MAX_VALUE;
		int linha5 = 5;
		int coluna7= 7;
		
		for(int i = 0; i < matrizBiDimensional.length; i++) {
			for(int j = 0; j < matrizBiDimensional[i].length; j++) {
				matrizBiDimensional[i][j] = numeroRandom.nextInt(100);
			}
			
		}
		for(int i = 0; i < matrizBiDimensional.length; i++) {
			for(int j = 0; j < matrizBiDimensional[i].length; j++) {
				System.out.print(" " +  matrizBiDimensional[i][j]);
			}
			System.out.println();
		}
		for(int i = 0; i < matrizBiDimensional[linha5].length; i++) {
			if(matrizBiDimensional[linha5][i] > maiorL5) {
				maiorL5 = matrizBiDimensional[linha5][i];				
			}
			if(matrizBiDimensional[linha5][i] < menorL5) {
				menorL5 = matrizBiDimensional[linha5][i];				
			}
		}
		System.out.println();
		System.out.println("O maior número da linha 5 é: "
		+ maiorL5);
		System.out.println("O menor número da linha 5 é: "
				+ menorL5 );
		for(int i = 0; i < matrizBiDimensional.length; i++) {
			for(int j = 0; j < matrizBiDimensional[coluna7].length; j++) {
				if(matrizBiDimensional[i][coluna7] > maiorCol7) {
					maiorCol7 = matrizBiDimensional[i][coluna7];				
				}
				if(matrizBiDimensional[i][coluna7] < menorCol7) {
					menorCol7 = matrizBiDimensional[i][coluna7];				
				}
			}
		}
		System.out.println();
		System.out.println("O maior número da coluna 7 é: "
		+ maiorCol7);
		System.out.println("O menor número da coluna  7 é: "
				+ menorCol7 );
		
		

	}

}
