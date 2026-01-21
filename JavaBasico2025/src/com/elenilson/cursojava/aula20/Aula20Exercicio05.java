package com.elenilson.cursojava.aula20;

import java.util.Scanner;

public class Aula20Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String[][][] compromissos = new String[12][31][8];
		
		boolean sair = false;
		byte opcao;
		int dia = 0;;
		boolean diaValido;
		int hora = 0;;
		boolean horaValida;
		boolean mesValido;
		int mes = 0;
		
		while(!sair) {
			System.out.println("Agenda de Compromissos:");
			System.out.println("Digite 1 - Adicionar Compromissos.");
			System.out.println("Digite 2 - Consultar Compromissos.");
			System.out.println("Digite 0 - Sair.");
			opcao = scan.nextByte();
			
			if(opcao == 1) {// Adicionar Compromisso
				mesValido = false;
				while(!mesValido) {
					System.out.println("Entre com o mês do ano de 1 a 12"); 
					mes = scan.nextInt();
					if(mes > 0 && mes <= 12) {
						mesValido = true;
					}else {
						System.out.println("Mês inválido, digite novamente!");
					}
				}
				diaValido = false;
				while(!diaValido) {
					System.out.println("Entre com o dia do mês");
					dia = scan.nextInt();
					if(dia > 0 && dia <= 31) {
						diaValido = true;
					}else {
						System.out.println("Dia inválido, digite novamente!");
					}
				}
				horaValida = false;
				while(!horaValida) {
					System.out.println("Entre com a hora do dia");
					hora = scan.nextInt();
					if(hora >=0 && hora < 9) {
						horaValida = true;
					}else {
						System.out.println("Hora inválida, digite novamente!, "
								+ "Somente 8 hora por Dia!");
					}
				}
				mes--;
				dia--;
				hora--;
				
				System.out.println("O mes é " + mes);
				System.out.println("A hora é " + hora);
				System.out.println("Entre com o compromisso");
				compromissos[mes][dia][hora] = scan.next(); 
				
			}else if(opcao == 2) {//verificar compromisso
				mesValido = false;
				while(!mesValido) {
					System.out.println("Entre com o mês do ano de 1 a 12"); 
					mes = scan.nextInt();
					if(mes > 0 && mes <= 12) {
						mesValido = true;
					}else {
						System.out.println("Mês inválido, digite novamente!");
					}
				}
				diaValido = false;
				while(!diaValido) {
					System.out.println("Entre com o dia do mês");
					dia = scan.nextInt();
					if(dia > 0 && dia <= 31) {
						diaValido = true;
					}else {
						System.out.println("Dia inválido, digite novamente!");
					}
				}
				horaValida = false;
				while(!horaValida) {
					System.out.println("Entre com a hora do dia");
					hora = scan.nextInt();
					if(hora >=0 && hora < 9) {
						horaValida = true;
					}else {
						System.out.println("Hora inválida, digite novamente!, "
								+ "Somente 8 hora por Dia!");
					}
				}
				mes--;
				dia--;
				hora--;
				System.out.println("O compromisso agendado no mês: " + (mes + 1) 
						+", no dia: " + (dia + 1) + " e na hora: " + (hora + 1)+ " é: ");
				System.out.println(compromissos[mes][dia][hora]);
				System.out.println();
			
			}else if(opcao == 0) {
				sair = true;
			}else {
				System.out.println("Opção inválida, digite novamente!");
			}
		} 

	}

}
