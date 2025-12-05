package com.elenilson.cursojava.aula43labs.exer02;

public class Teste {
	public static void main(String[] args) {
		
		PessoaFisica p1 = new PessoaFisica();
		p1.setNome("Contribuinte 01");
		p1.setRenda(1000);	
		p1.setCpf("42159585556");
		
		PessoaJuridica p2 = new PessoaJuridica();
		p2.setNome("Cintribuinte 02");
		p2.setRenda(5000);
		p2.setCnpj("33.476.179/0001-07");
		

		PessoaFisica p3 = new PessoaFisica();
		p3.setNome("Contribuinte 03");
		p3.setRenda(2000);	
		p3.setCpf("42538568455");
		
		PessoaJuridica p4 = new PessoaJuridica();
		p4.setNome("Cintribuinte 04");
		p4.setRenda(3000);
		p4.setCnpj("46.609.241/0001-33");
		
		PessoaFisica p5 = new PessoaFisica();
		p5.setNome("Contribuinte 03");
		p5.setRenda(3700);
		p5.setCpf("92056150050");
		
		PessoaJuridica p6 = new PessoaJuridica();
		p6.setNome("Cintribuinte 06");
		p6.setRenda(4000);
		p6.setCnpj("42.229.371/0001-90");
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		contribuintes[2] = p3;
		contribuintes[3] = p4;
		contribuintes[4] = p5;
		contribuintes[5] = p6;
	
		for(Contribuinte c : contribuintes) {			
			System.out.println(c);
			System.out.println();
		}
		
		
		
		
	}	
}
