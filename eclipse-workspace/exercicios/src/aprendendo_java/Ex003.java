package aprendendo_java;
import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
	
		/*Faça um programa para ler dois valores inteiros, e depois mostrar
		 * na tela a soma desses números com uma mensagem explicativa.		 * 
		 */
		
		Scanner ml = new Scanner(System.in);
		
		
		System.out.println("Digite dois números");
		
		int x = ml.nextInt();
		int y = ml.nextInt();
		int z = x + y;
		
		System.out.println("O resultado dessa soma é: " + z);
		
		ml.close();
		

	}

}
