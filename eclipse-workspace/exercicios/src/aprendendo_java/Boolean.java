package aprendendo_java;
import java.util.Scanner;

public class Boolean {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
		 */

		Scanner fe = new Scanner(System.in);
		int A;
		
		System.out.println("Digite um número");
		A = fe.nextInt();
		
		if (A < 0) {
			System.out.println("O número: " + A + " é negativo");
		}
		else {
			System.out.println("O número: " + A + " é positivo");
		}
		
		fe.close();
		
	}

}
