package com.elenilson.cursojavaintermediario.aula65;

@interface InformacaoAula {
	
	String autor();
	
	int aulaNumero();
	
	String blog() default "https://loiane.com";
	
	String site() default "https://loiane.training";
	

}
