package com.elenilson.cursojava.aula36labs;

public class Agenda {
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
	
	
	public String obterInfo() {
		String info = "Nome = " + nomeAgenda + "\n";
		if(contatos != null) {
			for(Contato c: contatos) {
				info += c.obterInfo() + "\n";
			}
		}
		return info;
	}
	public void obterInfo2() {
		System.out.println("Nome da Agenda: " + this.nomeAgenda);
		if(this.contatos != null) {
			for(int i = 0; i < contatos.length; i++) {
				this.contatos[i].obterInfo2();
				System.out.println();
			}
			
		}
	}
}
