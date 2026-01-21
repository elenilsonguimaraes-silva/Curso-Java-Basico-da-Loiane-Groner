package com.elenilson.cursojava.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula19Exercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double[] vetorA = new double[20];
		double[] vetorResult = new double[vetorA.length];
		double cotacaoDolar = 5.39;
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorResult[i] = cotacaoDolar * i;
		}
		DecimalFormat df = new DecimalFormat("###,###.##");
		for(int i = 0; i < vetorResult.length; i++) {
			System.out.println("O valor do R$: " + i + " convertido em dolar na cotação: " + cotacaoDolar +
					" é R$: " +df.format(vetorResult[i]));
		}

	}

}
