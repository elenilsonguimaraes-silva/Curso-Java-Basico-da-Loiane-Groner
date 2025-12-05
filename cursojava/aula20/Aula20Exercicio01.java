package com.elenilson.cursojava.aula20;

import java.util.Random;
import java.util.Scanner;

public class Aula20Exercicio01 {
	public static void main(String[] args) {
		
		int[][] matrizBiDimensional = new int[4][4];
		
		Random numeroRandom = new Random();
		int maior = Integer.MIN_VALUE;
		int linha = 0;
		int coluna = 0;
		
		for(int i = 0; i < matrizBiDimensional.length; i++) {
			for(int j = 0; j < matrizBiDimensional[i].length; j++) {
				matrizBiDimensional[i][j] = numeroRandom.nextInt(100);
				 if(matrizBiDimensional[i][j] > maior) {
					 maior = matrizBiDimensional[i][j];
					 linha = i;
					 coluna = j;
				 }
			}
			
		}
		/*
		for(int i = 0; i < matrizBiDimensional.length; i++) {
			for(int j = 0; j < matrizBiDimensional[i].length; j++) {
				System.out.print(" " +  matrizBiDimensional[i][j]);
			}
			System.out.println();
		}
		System.out.println("O maior número da série é: "
		+ maior + " linha= " + linha + " coluna= " + coluna );
		*/
		for(int[] matriz2Dimensons : matrizBiDimensional) {
			for(int valor : matriz2Dimensons) {
				System.out.print(" " +  valor);
			}
			System.out.println();
		}
		System.out.println("O maior número da série é: "
				+ maior + " linha= " + linha + " coluna= " + coluna );
	}	
}
