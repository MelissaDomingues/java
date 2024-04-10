package aprendendo_java;
import java.util.Scanner;

public class Boolean3 {

	public static void main(String[] args) {
		
		/*
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
		ordem crescente ou decrescente.
		 */
		
		Scanner lu = new Scanner(System.in);
		int A,B;
		
		System.out.println("Digite dois números");
		A = lu.nextInt();
		B = lu.nextInt();
		
		if (A % B == 00 || B % A ==0) {
			
			System.out.println("São multiplos");
		}
		else {
		
			System.out.println("Não são multiplos");
		}
		
		lu.close();
	}

}
