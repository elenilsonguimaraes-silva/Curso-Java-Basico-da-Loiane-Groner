package com.elenilson.cursojava.aula35labs;

import java.util.Scanner;

public class TesteFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o termo do fibonacci:");
		int numero = scan.nextInt();
		
		for(int i = 0; i < numero; i++) {
			System.out.print(Fibonacci.fibonacci(i) + " ");
		}
		

	}

}
