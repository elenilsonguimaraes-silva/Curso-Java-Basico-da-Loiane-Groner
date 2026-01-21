package com.elenilson.cursojava.aula20;

import java.util.Scanner;

public class Aula20Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int agendar = 0;
		int diaDoMes = 0;
		int horaDoDia = 0;
		String tarefa ="";
		boolean sair = false;
		System.out.println("Agenda Pessoal");
		
		String[][] compromisso = new String[30][23];
		do {
			System.out.println("Menu:");
			System.out.println("1 - AGendar Tarefa:");
			System.out.println("2 - Consultar Tarefa");
			System.out.println("3 - Sair");
			agendar = scan.nextInt();
			boolean diaValido;
			boolean horaValida;
			switch(agendar) {
			case 1: 
					diaValido = false;
					while(!diaValido) {
						System.out.println("Digite o dia do Mês:");
						diaDoMes = scan.nextInt();
						if(diaDoMes > 0 && diaDoMes <=31) {
							diaValido = true;
						}else {
							System.out.println("Dia inválido, digite novamente");
						}
					}
					horaValida = false;
					while(!horaValida) {
						System.out.println("Digite a hora do dia:");
						horaDoDia = scan.nextInt();
						if(horaDoDia >= 0 && horaDoDia <= 24) {
							horaValida = true;
						}else {
							System.out.println("Hora inválida, digite novamente!");
						}
					}
					diaDoMes--;
					horaDoDia--;
					
					System.out.println("Digite a tarefa desejada:");
					compromisso[diaDoMes][horaDoDia] = scan.next();
					break;
			case 2: diaValido = false;
					while(!diaValido) {
						System.out.println("Digite o dia do Mês:");
						diaDoMes = scan.nextInt();
						if(diaDoMes > 0 && diaDoMes <=31) {
							diaValido = true;
						}else {
							System.out.println("Dia inválido, digite novamente");
						}
					}
					horaValida = false;
					while(!horaValida) {
						System.out.println("Digite a hora do dia:");
						horaDoDia = scan.nextInt();
						if(horaDoDia >= 0 && horaDoDia < 24) {
							horaValida = true;
						}else {
							System.out.println("Hora inválida, digite novamente!");
						}
					}
					diaDoMes--;
					horaDoDia--;
					System.out.println("O compromisso agendado é: " + compromisso[diaDoMes][horaDoDia]);	
					System.out.println();
					break;
			case 3:
				sair = true;
				break;
			default: System.out.println("Escolha Ínvalida!");
			}
		}while(!sair);

	}

}
