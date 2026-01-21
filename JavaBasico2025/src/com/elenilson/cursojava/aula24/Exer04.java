package com.elenilson.cursojava.aula24;

import java.util.Date;

public class Exer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LivroDeBiblioteca livro = new LivroDeBiblioteca();
		
		livro.titulo = "Mastering ExtJS";
		livro.autor = "Loiane Gronner";
		livro.anoLancamento = 2015;
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.leitor="Loiane";
		
		System.out.println("Nome do Livro = " + livro.titulo);
	}

}
