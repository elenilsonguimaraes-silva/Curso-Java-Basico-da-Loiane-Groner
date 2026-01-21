package com.elenilson.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciência da Computação");
		double[] notas = {10, 9, 8, 7};
		aluno.setNotas(notas);
		
		
		System.out.println(aluno.toString());
		
		String s1 = "afdsfsdf";
		String s2 = "afdsfsdf";
		
		System.out.println(s1.equals(s2));
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setCurso("Ciência da Computação");
		double[] notas2 = {9, 5, 8, 7};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno2));
		
		

	}

}
