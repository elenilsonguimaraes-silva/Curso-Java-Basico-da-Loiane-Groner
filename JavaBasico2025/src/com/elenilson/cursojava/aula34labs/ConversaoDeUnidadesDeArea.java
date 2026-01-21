package com.elenilson.cursojava.aula34labs;

public class ConversaoDeUnidadesDeArea {
	
	private static double metroQuadraro = 10.76;
	private static int peQuadrado = 929;
	private static int milhaQudrada = 640;
	private static double acre = 43.560;
	
	
	public static double conveterMetroQuadrado(double num) {
		return num * metroQuadraro;		
	}
	
	public static double conveterPeQuadrado(double num) {
		return num * peQuadrado;		
	}
	
	public static double conveterMilhaQuadrado(double num) {
		return num * milhaQudrada;		
	}
	
	public static double conveterAcre(double num) {
		return num * acre;		
	}
	
	
	
	

}
