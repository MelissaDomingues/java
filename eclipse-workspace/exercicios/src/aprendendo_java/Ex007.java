package aprendendo_java;
import java.util.Locale;
import java.util.Scanner;

public class Ex007 {

	public static void main(String[] args) {
		
	/*
	 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
		mostre:
		a) a área do triângulo retângulo que tem A por base e C por altura.
		b) a área do círculo de raio C. (pi = 3.14159)
		c) a área do trapézio que tem A e B por bases e C por altura.
		d) a área do quadrado que tem lado B.
		e) a área do retângulo que tem lados A e B.	
	 */
		
		Scanner sa = new Scanner(System.in);
		
		
		double A, B, C;
		double pi = 3.14159;
		
		double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		System.out.println("Digite 3 números a ser calculo as areas");
		A = sa.nextDouble();		
		B = sa.nextDouble();		
		C = sa.nextDouble();	
		
		areaTriangulo = A * C / 2.0;
		areaCirculo = pi* C * C;
		areaTrapezio = (A+B) / 2.0 *C;
		areaQuadrado = B * B;
		areaRetangulo = A * B;
		
		Locale.setDefault(Locale.US);
		System.out.printf("O valor da área do Triangulo Retangulo é: %.3f%n", areaTriangulo);
		System.out.printf("O valor da área do Circulo é: %.3f%n", areaCirculo);
		System.out.printf("O valor da área do Trapezio é: %.3f%n", areaTrapezio);
		System.out.printf("O valor da área do Quadrado é: %.3f%n", areaQuadrado);
		System.out.printf("O valor da área do Retangulo é: %.3f%n", areaRetangulo);
		
		sa.close();

	}

}
