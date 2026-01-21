package com.elenilson.cursojava.aula34labs;

public class Calculadora {
	
	public static double somar(double num, double num2) {
		return num + num2;
	}
	
	public static double subtrair(double num, double num2) {
		return num - num2;
	}
	
	public static double multiplicar(double num, double num2) {
		return num * num2;
	}
	
	public static double dividir(double num, double num2) {
		return num / num2;
	}
	
	public static double elevarAPotencia(double num, double num2) {
		return Math.pow(num, num2);
	}
	
	public static int fatorial(int num) {
		int fat = 1;
		for(int i = 1; i <= num; i++) {
			fat*= i;
		}
		return fat;		
	}	


}
