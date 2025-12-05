package com.elenilson.cursojava.aula35;

import java.util.Scanner;

public class TesteFatorialRecursivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite um número para o fatorial:");
		int numero = scan.nextInt();
		System.out.println("O fatorial do número: " + numero + " é: " + FatorialRecursivo.fatorial(numero));

	}

}
