package com.elenilson.cursojava.aula27.labs;

public class Aluno {
	String nome;
	String matricula;
	String nomeCurso;

	String[] disciplinas;
	double[][] notas;
	
	
	void mostarInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Nome do curso: " + nomeCurso);
		
		for(int i = 0; i < disciplinas.length; i++) {
			System.out.println("Notas da disciplina " + disciplinas[i]);
			for(int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + " ");
			} 
			System.out.println();
		}
	}
	
	boolean verificarAprovado(int indice) {
		double soma = 0;
		int i = 0;
		for( i = 0; i < notas[indice].length; i++) {
			soma+= notas[indice][i];
		}
		
		double media = soma / i;
		if (media >= 7) {
			return true;
		}
			return false;		
	}

}
