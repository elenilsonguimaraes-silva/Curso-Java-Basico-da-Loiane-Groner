package com.elenilson.cursojava.aula52labs;

import java.util.Arrays;

public class Agenda {
	
	public Agenda() {
		contatos = new Contato[5];
	}
	private String nomeAgenda;
	private Contato[] contatos;
	
	
	public String getNomeAgenda() {
		return nomeAgenda;
	}

	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}
	
	public Contato[] getContatos() {
		return contatos;
	}
	
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}

	public void adicionarContato(Contato c) throws AgendaCheiaException {
		boolean cheia = true;
		for(int i = 0; i < contatos.length; i++) {
			if(contatos[i] == null) {
				contatos[i] = c;
				cheia = false;
				break;				
			}
		}
		if(cheia) {
			throw new AgendaCheiaException();
		}
	}

	public boolean consultarContatos(int indice) throws Exception {
		if(indice > contatos.length) {
			return false;
		}else {
			if(indice < contatos.length) {
				if(this.contatos[--indice] != null) {
					this.contatos[indice].obterInfo2();
					return true;
				}
			}
		}
		return false;
	}
	public String consultaContatoPorNome(String nome) throws ContatoNaoExisteException {
		for(int i= 0; i < contatos.length; i++) {
			if(contatos[i] != null) {
				if(contatos[i].getNome().equalsIgnoreCase(nome)) {
					return contatos[i].obterInfo();
				}
			}
		}
		throw new ContatoNaoExisteException(nome);
		
		
	}
	
	public String obterInfo() throws ContatoNaoExisteException {
		String info = "Nome = " + nomeAgenda + "\n\n";
		if(contatos != null) {
			for(Contato c: contatos) {
				if(c != null) {					
					info += c.obterInfo() + "\n\n";					
				}else {
					String vazio = "vazio";
					throw new ContatoNaoExisteException(vazio);
				}
			}
			return info;
			
		}
		return "Contato vazio";
	}
	public void obterInfo2() {
		System.out.println("Nome da Agenda: " + this.nomeAgenda);
		System.out.println();
		if(this.contatos != null) {
			for(int i = 0; i < contatos.length; i++) {
				if(this.contatos[i] != null) {
					this.contatos[i].obterInfo2();
					System.out.println();
				}else {					
					System.out.println("Contato Vazio");
				}
			}
			
		}
	}

}
