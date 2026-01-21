package com.elenilson.cursojava.aula34labs;

import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int op = 0;
		System.out.println("Calculadora ");
		
		System.out.println("Digite um número para a operação: ");
		double num = scan.nextDouble();
		
		System.out.println("Digite um segundo número para a operação: ");
		double num2 = scan.nextDouble();
	
		System.out.println("Ecolha 1-Somar, 2-Subtrair, 3-Multiplicar, 4-Dividir, 5 Elevar a potencia, 6-Fatorial");
		op = scan.nextInt();
		switch(op) {
		case 1:
			System.out.println("A soma é: " + Calculadora.somar(num, num2));
			break;
		case 2:
			System.out.println("A subtração é: " + Calculadora.subtrair(num, num2));
			break;
		case 3:
			System.out.println("O rsultador da multiplicação é: " + Calculadora.multiplicar(num, num2));
			break;
		case 4:
			System.out.println("O reultado da divisão é: " + Calculadora.dividir(num, num2));
			break;
		
		case 5:
			System.out.println("O número " + num + " elevador a potência de: " + num2 + " é igual a: " +
		Calculadora.elevarAPotencia(num, num2));
			break;
		case 6:
			int numero;
			do {
				System.out.println("Digite um número para o fatorial");
				numero = scan.nextInt();
				if(numero < 0) {
					System.out.println("Número inválido, não pode ser negativo!");
				}
			}while(numero < 0);
			System.out.println("O fatorial do número: " + numero + " é: " + Calculadora.fatorial(numero));
			break;
		default: 
			System.out.println("Opção Inválida:");
		}

	}

}
