package entities;


public class Triangle {

		 /*
		  * criando um programa que calcula a area de dois triangulos e diz qual deles é maior.
		  * Pra isso, utilizar o método de importação de classes com os parametros e métodos dos triangulos
		  */
		
		public double a;
		public double b;
		public double c;
		
		public double area() {
			double p = (a + b +c) / 2.0;
			return  Math.sqrt(p * (p - a) * (p -b) * (p -c));
		}

	}


