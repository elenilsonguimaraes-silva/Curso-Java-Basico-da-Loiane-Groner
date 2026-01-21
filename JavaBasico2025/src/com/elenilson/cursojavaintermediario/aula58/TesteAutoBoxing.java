package com.elenilson.cursojavaintermediario.aula58;

public class TesteAutoBoxing {

	public static void main(String[] args) {
		
		//Autoboxing
		Short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 100;
		Long num10 = 100l;
		Float num11 = 3.5f;
		Double num12 = 2.55555;
		Boolean flag2 = true;
		Character bb = 'b';
		
		//auto- un-boxing
		int num13 = num9; // num9.intValue();
		
		
		num9++;
		
		System.out.println(num9);
		
		Integer num14 = num13 / num9;
		
		
		//auto unboxing num9 -> autoboxing num13/num9 -> num14
		
		
		//mau uso 
		Double a, b, c;
		a = 10.0;
		b = 12.2;
		c = 4.7;
		
		Double media = (a +b +c) /3;
		System.out.println(media);
		
		
		

	}

}
