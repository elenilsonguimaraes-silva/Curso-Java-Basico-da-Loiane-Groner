package com.elenilson.cursojava.aula46labs;

public class Teste {

	public static void main(String[] args) {

		Quadrado quadrado = new Quadrado();
		quadrado.setNome("Quadrado");
		quadrado.setCor("Verde");
		quadrado.setLado(2);

		Circulo circulo = new Circulo();
		circulo.setNome("Circulo");
		circulo.setCor("Vermelho");
		circulo.setRaio(2);

		Triangulo triangulo = new Triangulo();
		triangulo.setNome("Triângulo");
		triangulo.setCor("Azul");
		triangulo.setBase(2);
		triangulo.setAltura(3);
		
		Cubo cubo = new Cubo();
		cubo.setNome("Cubo");
		cubo.setCor("Roxo");
		cubo.setLado(3);

		Cilindro cilindro = new Cilindro();
		cilindro.setNome("Cilindro");
		cilindro.setCor("Cinza");
		cilindro.setRaio(2);
		cilindro.setAltura(3);
		

		Piramide piramide = new Piramide();
		piramide.setNome("Pirâmide");
		piramide.setCor("Amarela");
		piramide.setAltura(3);
		piramide.setApotema(4);
		piramide.setArestaBase(2);
		piramide.setNumPoliBase(4);
		piramide.setBase(quadrado );

		FiguraGeometrica[] figuras = new FiguraGeometrica[6];
		figuras[0] = quadrado;
		figuras[1] = circulo;
		figuras[2] = triangulo;
		figuras[3] = cubo; 
		figuras[4] = cilindro;
		figuras[5] = piramide;

		System.out.println("Figuras Geométricas 2D e suas respectivas Áreas");

		for (FiguraGeometrica fig : figuras) {
			if (fig instanceof Figura2D) {
				System.out.println("---------------------------------------");
				System.out.println(fig.getNome());
				Figura2D f2d = (Figura2D)fig;
				System.out.println(f2d.calcularArea());
			}
			if (fig instanceof Figura3D) {
				System.out.println("---------------------------------------");
				System.out.println("Figuras Geométricas 3D e suas respectivas Áreas e Volumes");
				
				System.out.println(fig.getNome());
				System.out.println(fig);
				Figura3D f3d = (Figura3D)fig;
				System.out.println(f3d.calcularArea());
				System.out.println(f3d.calcularVolume());
			}
		}

	}

}
