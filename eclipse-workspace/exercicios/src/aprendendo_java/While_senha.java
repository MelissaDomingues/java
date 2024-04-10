package aprendendo_java;
import java.util.Scanner;

public class While_senha {

	public static void main(String[] args) {
		
		/*
		 * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
		incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
		impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
		 */
		
		int senha = 2002;
		int x;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha:");
		x = sc.nextInt();
		
		while ( x != senha) {					
				
				x += senha;
				System.out.println("Senha incorreta, digite novamente:");
				x = sc.nextInt();
		}
		
		System.out.println("Acesso liberado");
		
		sc.close();
	}

}
