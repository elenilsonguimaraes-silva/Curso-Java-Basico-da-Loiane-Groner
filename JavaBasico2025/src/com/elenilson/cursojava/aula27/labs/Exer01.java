package com.elenilson.cursojava.aula27.labs;


public class Exer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lampada lampada = new Lampada();
		
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garantiaMeses = 36;
		lampada.potencia = 7;
		lampada.corLuz = "amarela";
		lampada.tipoLampada = new String[5];
		lampada.tipoLampada[0] = "Abajur";
		lampada.tipoLampada[1] = "Lampeões";
		
		
		lampada.verificarEstadoLampada();
		
		lampada.mudarEstadoLampada();
		
		lampada.verificarEstadoLampada();
		
		lampada.mudarEstadoLampada();
		
		lampada.verificarEstadoLampada();
		
		lampada.mudarEstadoLampada();
		
	    lampada.verificarEstadoLampada();
	}

}
