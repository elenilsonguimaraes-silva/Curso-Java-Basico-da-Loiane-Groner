package com.elenilson.cursojava.aula33labs;

public class Lampada {
	
	private String modelo;
	private String tensao;
	private int potencia;
	private String corLuz;
	private int garantiaMeses;
	private String[] tipoLampada;
	private boolean ligada = false;
	
	

	
	public Lampada() {}	
	
	
	
	public Lampada(String modelo, String tensao, int potencia, String corLuz, int garantiaMeses, String[] tipoLampada,
			boolean ligada) {
		this.modelo = modelo;
		this.tensao = tensao;
		this.potencia = potencia;
		this.corLuz = corLuz;
		this.garantiaMeses = garantiaMeses;
		this.tipoLampada = tipoLampada;
		this.ligada = ligada;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getTensao() {
		return tensao;
	}



	public void setTensao(String tensao) {
		this.tensao = tensao;
	}



	public int getPotencia() {
		return potencia;
	}



	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getCorLuz() {
		return this.corLuz;
	}



	public void setCorLuz(String corLuz) {
		this.corLuz = corLuz;
	}



	public int getGarantiaMeses() {
		return this.garantiaMeses;
	}



	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}



	public String[] getTipoLampada() {
		return this.tipoLampada;
	}



	public void setTipoLampada(String[] tipoLampada) {
		this.tipoLampada = tipoLampada;
	}



	private boolean isLigada() {
		return this.ligada;
	}



	private void setLigada(boolean ligada) {
		this.ligada = ligada;
	}



	public void ligarLampada() {
		if(!this.isLigada()) {
			this.setLigada(true);
		}
	}
	public void desligarLampada() {
		if(this.isLigada()) {
			this.setLigada(false);
		}
	}
	
	public void verificarEstadoLampada() {
		if(this.isLigada()) {
			System.out.println("A lâmpada está ligada");
		}else{
			System.out.println("A lâmpada está desligada");
		}
	}
	public void mudarEstadoLampada(){
		if(isLigada()) {
			this.desligarLampada();
		}else {
			this.ligarLampada();
		}
	}
	

	

}
