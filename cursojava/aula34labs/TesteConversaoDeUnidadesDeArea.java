package com.elenilson.cursojava.aula34labs;

import java.util.Scanner;

public class TesteConversaoDeUnidadesDeArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int op = 0;

		System.out.println("Conversões de Areas.");

		System.out.println("Digite um número para a conversão:");
		double numero = scan.nextDouble();

		System.out.println("Escolha para qual unidade deseja conveter:");
		System.out.println("1-Metro Quadradro, 2-Pé quadrado, 3-Milha Quadrada, 4-Acre");
		op = scan.nextInt();

		switch (op) {
			case 1:
				System.out.println("O número: " + numero + " convertido é: " +
			ConversaoDeUnidadesDeArea.conveterMetroQuadrado(numero)+ " metros quadrados.");
				break;
			case 2:
				System.out.println("O número: " + numero + " convertido é: " + ConversaoDeUnidadesDeArea.conveterPeQuadrado(numero)+
						" pés quadrados.");
				break;
			case 3:
				System.out.println("O número: " + numero + " convertido é: " + ConversaoDeUnidadesDeArea.conveterMilhaQuadrado(numero)+
						" milhas qudradas.");
				break;
			case 4:
				System.out.println("O número: " + numero + " convertido é: " + ConversaoDeUnidadesDeArea.conveterAcre(numero)+
						" acres.");
				break;
				default:
					System.out.println("Opção Inválida");
 
		}
	}

}
