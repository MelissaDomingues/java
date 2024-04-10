package aprendendo_java;
import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		
		/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		casas decimais conforme exemplos.
		Fórmula da área: area = π . raio2
		Considere o valor de π = 3.14159		
		 */
		
		Scanner sf = new Scanner(System.in);
		
		double pi = 3.14159;
		double area;
		double raio;
		
		System.out.println("Digite o valor do raio do circulo a ser calculado");
		raio = sf.nextDouble();
		
		area = pi*raio*raio;
		System.out.printf("O valor da área desse circulo é: %.4f%n", area);
		
		sf.close();
	}

}
