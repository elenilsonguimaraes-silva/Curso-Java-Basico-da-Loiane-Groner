package com.elenilson.cursojava.aula33labs;

public class TesteLampada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lampada lampada = new Lampada("A60", "Bivolt", 36, "Amarela", 7, new String[] {"Abajur","Lampeões"}, false);
		
		
		/*lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garantiaMeses = 36;
		lampada.potencia = 7;
		lampada.corLuz = "amarela";
		lampada.tipoLampada = new String[5];
		lampada.tipoLampada[0] = "Abajur";
		lampada.tipoLampada[1] = "Lampeões";
		*/
		
		
		lampada.verificarEstadoLampada();
		
		lampada.mudarEstadoLampada();
		
		lampada.verificarEstadoLampada();
		
		lampada.mudarEstadoLampada();
		
		lampada.verificarEstadoLampada();
		
		lampada.mudarEstadoLampada();
		
	    lampada.verificarEstadoLampada();

	}

}
