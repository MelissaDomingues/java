package aprendendo_java;
import java.util.Scanner;
public class Boolean2 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
		 */

		Scanner me = new Scanner(System.in);
		
		int A;
		
		System.out.println("Digite o número a ser calculado: ");	
		A = me.nextInt();
		
		if( A % 2 == 0) {
			System.out.println("Esse é um número par!");
		}
		else {
			System.out.println("Esse é um número ímpar");
		}
	
		
		me.close();
	}
	

}
