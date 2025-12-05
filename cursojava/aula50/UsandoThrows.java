package com.elenilson.cursojava.aula50;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {

		System.out.println("Entre com um número decimal");

		try {
			double num = lerNumero();
			System.out.println("Você digitou " + num);
		} catch (Exception e) {
			System.out.println("Entrada inválida");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	public static double lerNumero() throws Exception {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}

}
