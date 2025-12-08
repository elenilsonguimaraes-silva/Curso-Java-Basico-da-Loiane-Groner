package com.elenilson.cursojava.aula52.labs;

import java.util.Scanner;

public class TesteAgenda {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			Agenda agenda = new Agenda();			
			agenda.setNomeAgenda("Agenda de Contatos");
			
			boolean sair = false;
				
			while(!sair) {
				int escolha = 0;
				System.out.println("Digite uma das opções:");
				System.out.println("1- Consultar Contato por nome, 2 -Consultar Contato por número, 3 -Adicionar Contato, 4 -Sair");
				escolha = scan.nextInt();
				switch(escolha) {
				case 1:
					System.out.println("Digite o nome que deseja pesquisar");
					String nome = scan.next();
					try {
					 System.out.println(agenda.consultaContatoPorNome(nome));
					}catch(Exception e) {
						System.out.println(e.getMessage());
												
					}
					break;
				case 2:
					int pesquisar = 0;
					System.out.println("Digite o numero do contato que deseja pesquisar:");
					pesquisar = scan.nextInt();
					try {
						 if(!agenda.consultarContatos(pesquisar)){
							 System.err.println("Número de Contato inválido!");
						 }
						 
					}catch(Exception e) {
						System.out.println("Entrada inválida");
						System.out.println(e.getMessage());
						e.printStackTrace();
					}
					break;
				
				case 3:
					adicionarContato(agenda);
					break;
				case 4:
					sair = true;
					break;
				default:
					System.out.println("Número ínvalido!");
					
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	static void  adicionarContato(Agenda agenda) throws Exception{
		Scanner scan = new Scanner(System.in);
		Contato contato = new Contato();
		System.out.println("Digite o nome do contato");
		contato.setNome(scan.nextLine());
		System.out.println("Digite o telefone do Contato");
		contato.setTelefone(scan.nextLine());
			try {
				agenda.adicionarContato(contato);
			} catch (AgendaCheiaException e) {
				System.out.println(e.getMessage());
				System.out.println("Contatos da Agenda:");
				//System.out.println(agenda.obterInfo());
				agenda.obterInfo2();
			}
		
	}

}
