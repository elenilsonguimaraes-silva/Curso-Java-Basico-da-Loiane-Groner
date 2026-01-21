package com.elenilson.cursojava.aula36labs;

public class Contato {
	private String nome;
	private String telefone;
	private String email;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String obterInfo() {
		return "Nome = " + this.getNome()+ "\n" +
				"Telefone = " + this.getTelefone()+ "\n"+
				"Email = " + this.getEmail()+ "\n";
		
	}
	public void obterInfo2() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("Email: " + this.getEmail());		
	}

}
