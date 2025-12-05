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
				System.out.println("1 -Consultar Contato, 2 -Adicionar Contato, 3 -Sair");
				escolha = scan.nextInt();
				switch(escolha) {
				case 1:
					int pesquisar = 0;
					System.out.println("Digite o numero do contato que deseja pesquisar:");
					pesquisar = scan.nextInt();
					try {
						 if(!agenda.consultarContatos(pesquisar)){
							 System.err.println("Contato inválido!");
						 }						
					}catch(Exception e) {
						System.out.println("Entrada inválida");
						System.out.println(e.getMessage());
						e.printStackTrace();
					}
					break;
				case 2:
					System.out.println(adicionarContato(agenda.getContatos(), agenda));
					break;
				case 3:
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
	static boolean  adicionarContato(Contato[] contatos, Agenda agenda) throws Exception{
		Scanner scan = new Scanner(System.in);
		Contato contato = new Contato();
		System.out.println("Digite o nome do contato");
		contato.setNome(scan.nextLine());
		System.out.println("Digite o telefone do Contato");
		contato.setTelefone(scan.nextLine());
		int indice = (contato.getIdentificador());
		--indice;
		int contador = 0;
			for(int i = 0; i < contatos.length; i++) {
				if(contatos[i] == null && i < contatos.length) {
					agenda.setContatos(contatos, contato, indice);				
					return true;
				}
			}
		return false;
	}

}
