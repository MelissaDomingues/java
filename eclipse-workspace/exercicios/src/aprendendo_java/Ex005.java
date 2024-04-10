package aprendendo_java;
import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		/* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
		de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D) 
	    */
		
		Scanner giu = new Scanner(System.in);
		
		int a, b, c, d, dif;
		
		System.out.println("Digite 4 valores...");
		a = giu.nextInt(); 
		b = giu.nextInt(); 
		c = giu.nextInt(); 
		d = giu.nextInt(); 
		
		dif = a*b - c*d;
		
		System.out.println("A diferença é de: " + dif );
		
		giu.close();
	}
	

}
