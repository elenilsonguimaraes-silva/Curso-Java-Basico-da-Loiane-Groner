package com.elenilson.cursojava.aula36labs;

import java.util.Scanner;

public class Exer01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Agenda agenda = new Agenda();		
		
		
		Contato[] contatos = new Contato[3];
		System.out.println("Digite o nome da Agenda:");
		String nome = scan.nextLine();
		agenda.setNomeAgenda(nome);
		
		for(int i=0; i < contatos.length; i++) {
			Contato contato = new Contato();
			System.out.println("Digite o nome do "+ (i + 1) + "º contato.");
			contato.setNome(scan.nextLine());
			System.out.println("Digite o telefone do " + (i + 1) + "º contato.");
			contato.setTelefone(scan.nextLine());
			System.out.println("Digite o email do "+ (i + 1) +"º contato.");
			contato.setEmail(scan.nextLine());
			contatos[i] = contato;
		}
		agenda.setContatos(contatos);
		//System.out.println(agenda.obterInfo());
		agenda.obterInfo2();		
	}
	
}
