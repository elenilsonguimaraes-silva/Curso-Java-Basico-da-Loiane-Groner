package com.elenilson.cursojava.aula52.labs.Loiane;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		int opcao = 1;
		while (opcao != 4) {
			opcao = obterOpcaoMenu(scan);

			if (opcao == 1) {// Consultar contato
				consultarContato(scan, agenda);

			} else if (opcao == 2) {// Adicionar Contato
				
				adicionarContato(scan, agenda);
				
			} else if (opcao == 3) { 
				
				System.out.println( agenda);
				
			}else if(opcao == 4) {// sair
				
				System.exit(0);
				
			}
		}
	}

	public static void adicionarContato(Scanner scan, Agenda agenda) {
		System.out.println("Criando  um contato, entre com as informações");
		String nome = lerInformacaoString(scan, "Entre com o nome do contato");
		String telefone = lerInformacaoString(scan, "Entre com o telefone do contato");
		String email = lerInformacaoString(scan, "Entre com o email do contato");
		Contato contato = new Contato(nome, telefone, email);
		System.out.println("Contato a ser criado:");
		System.out.println(contato);

		try {
			agenda.adicionarContato(contato);
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());
			System.out.println("Contatos da Agenda:");
			System.out.println(agenda.toString());
			
		}
	}

	public static void consultarContato(Scanner scan, Agenda agenda) {
		String nomeContato = lerInformacaoString(scan, "Entre com o nome do contato a ser pesquisado:");
		try {
			if (agenda.consultaContatoPorNome(nomeContato) >= 0) {
				System.out.println("Contato existe");
			}
		} catch (ContatoNaoExisteException e) {
			System.out.println(e.getMessage());
		}

	}

	public static String lerInformacaoString(Scanner scan, String msg) {
		System.out.println(msg);
		String entrada = scan.nextLine();
		return entrada;
	}

	public static int obterOpcaoMenu(Scanner scan) {
		boolean entradaValida = false;
		int opcao = 4;
		while (!entradaValida) {
			System.out.println("Digite a opção desejada:");
			System.out.println("1: Consultar contato");
			System.out.println("2: Adicionar contato");
			System.out.println("3: Consultar Agenda:");
			System.out.println("4: Sair");

			try {
				String entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);
				if (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4) {
					entradaValida = true;
				} else {
					throw new Exception("Entrada inválida");
				}
			} catch (Exception e) {
				System.out.println("Entrada inválida, digite novamente\n");
			}

		}

		return opcao;
	}

}
