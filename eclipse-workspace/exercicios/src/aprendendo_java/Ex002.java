package aprendendo_java;
import java.util.Locale;
import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		
		/* Fazer um programa para ler as medidas da largura e comprimento de um terreno
		 * retangular com uma casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais.
		 * Em seguida, o programa deve mostrar o valor da area do terreno, bem como o valor do preço do terreno
		 * ambos com duas casas decimais. 
		 */
		
		Scanner ok = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		double largura = ok.nextDouble();
		double comprimento = ok.nextDouble();
		double metroQuadrado =  ok.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("Área = %.2f%n", area);
		System.out.printf("Preço = %.2f%n", preco);
		
		
		ok.close();
	}
	

}
