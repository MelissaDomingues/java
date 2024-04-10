package aprendendo_java;
import java.util.Scanner;

public class Boolean7 {

	public static void main(String[] args) {
		
		/*
		 * Exemplo de calculo de imposto de renda
		 */

		Scanner sc = new Scanner (System.in);
		
		double salario;
		double imposto;
		
		System.out.println("informe o seu salário: ");
		salario = sc.nextDouble();
		
		if (salario <= 2000.0) {
				imposto = 0.0;
		}
		else if ( salario <= 3000.0) {
				imposto = (salario - 2000.0) * 0.08;
		}
		
		else if (salario <= 4500.0) {
				imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08; 			
		}
		else {
				imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		sc.close();
	}
}
