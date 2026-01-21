package com.elenilson.cursojava.aula36;

public class Teste {
	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Tyrion");
		
		//relacionamento tem um telefone
		Telefone tel = new Telefone();
		tel.setDdd("11");
		tel.setNumero("99999-9999");
		tel.setTipo("celular");
		
		//relacionamento tem um telefone
		Telefone tel2 = new Telefone();
		tel2.setDdd("11");
		tel2.setNumero("88888-8888");
		tel2.setTipo("Casa");
		
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		telefones[1] = tel2;
		
		contato.setTelefones(telefones);
		
		
		
 		//relacionamento tem-um endereço
		Endereco endereco = new Endereco();
		endereco.setNomeRua("Rua Game of Thrones");
		endereco.setNumero("n/a");
		endereco.setComplemento("-");
		endereco.setCidade("Kiungs Landing");
		endereco.setEstado("Westeros");
		endereco.setCep("9999999");
		contato.setEndereco(endereco);
		
		System.out.println(contato.getNome());		
		
		
		//Teste saída console
		if(contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
			System.out.println(contato.getEndereco().getNomeRua());
			System.out.println(contato.getEndereco().getNumero());			
		}
		/*if(contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getTipo());
			System.out.println(contato.getTelefone().getDdd()+" "+ contato.getTelefone().getNumero());
		}*/
		System.out.println();		
		if(contato != null && contato.getTelefones() != null) {
			for(Telefone telefone : contato.getTelefones()) {
				System.out.println(telefone.getTipo());
				System.out.println(telefone.getDdd()+" "+ telefone.getNumero());	
				System.out.println();
			}
			
		}		
		
	}

}
