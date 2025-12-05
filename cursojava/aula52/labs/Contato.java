package com.elenilson.cursojava.aula52.labs;

public class Contato {

	public Contato() {
		this.icrementarContador();
	}
	
	

	public Contato(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.icrementarContador();		
	}



	private String nome;
	private String telefone;
	public  int identificador;
	private static int CONTADOR = 0;

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

	public int getIdentificador() {
		return identificador;
	}

	private void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	private void icrementarContador() {		
		this.CONTADOR++;
		this.setIdentificador(this.CONTADOR);
	}
	
	public String obterInfo() {
		return "Nome = " + this.getNome()+ "\n" +
				"Telefone = " + this.getTelefone()+ "\n"+
				"Identificador= " + this.getIdentificador();		
	}
	public void obterInfo2() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("Identificador: " + this.getIdentificador());		
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", telefone=" + telefone + ", identificador=" + identificador + "]";
	}
	
	

}
