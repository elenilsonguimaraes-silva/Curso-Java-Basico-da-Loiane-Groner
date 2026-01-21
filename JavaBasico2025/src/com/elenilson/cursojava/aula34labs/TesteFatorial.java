package com.elenilson.cursojava.aula34labs;

import java.util.Scanner;

public class TesteFatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número para o fatorial:");
		int num = scan.nextInt();
		
		System.out.println("O fatorial de: " + num + " é: " + Fatorial.fatorial(num));
		
		Fatorial fat = new Fatorial();
		
		System.out.println("O fatorial do objeto criado é de: " + fat.retornarFatorial(6));
	}

}
