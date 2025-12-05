package com.elenilson.cursojava.aula52.labs;

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

	public void setContatos(Contato[] contatos, Contato contato, int i) {
			if(i < contatos.length) {
				this.contatos[i] = contato;
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
				}else {
					return false;
				}
			}else {
				return false;
			}
		}

	}
	
	public String obterInfo() {
		String info = "Nome = " + nomeAgenda + "\n\n";
		if(contatos != null) {
			for(Contato c: contatos) {
				if(c != null) {
					info += c.obterInfo() + "\n\n";
				}else {
					return "Contato inexistente!";
				}
				
			}
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
