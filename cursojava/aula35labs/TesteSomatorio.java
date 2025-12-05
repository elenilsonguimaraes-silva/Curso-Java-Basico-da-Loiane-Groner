package com.elenilson.cursojava.aula35labs;

import java.util.Scanner;

public class TesteSomatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número para fazer o somatório de 1 até o número em questão");
		int numero = scan.nextInt();
		System.out.println("O somatorio do numero 1 até o numero "+ numero + " é de: " + Somatorio.somarNumeros(numero));
		
	}

}
