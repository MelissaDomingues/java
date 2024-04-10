package aprendendo_java;
import java.util.Scanner;

public class Boolean5 {

	public static void main(String[] args) {
		/*
		 * Fazer um exemplo de cardápio 
		 */
		
		Scanner ki = new Scanner(System.in);
		
		System.out.println("O que você deseja comprar?");
		int codigo = ki.nextInt();
		
		System.out.println("Qual quantidade?");
		int quantidade = ki.nextInt();
		
		
		double total;
		
		if ( codigo == 1) {
				total = quantidade * 4.0;
		}
		else if (codigo == 2) {
				total = quantidade * 4.5;
		}
		else if (codigo == 3) {
				total = quantidade * 5.0;
		}
		else if (codigo == 4) {
				total = quantidade * 2.0;
		}
		else {
				total = quantidade * 1.5;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		ki.close();
	}  

}
