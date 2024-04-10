package aprendendo_java;

import java.util.Scanner;

public class Boolean6 {

	public static void main(String[] args) {
		/*
		 * Você deve fazer um programa que leia um valor qualquer e apresente uma
		 * mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75],
		 * (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum
		 * destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		 */

		Scanner sc = new Scanner(System.in);

		double enter;
		double resultado;

		System.out.println("Digite um número a ser calculado");
		enter = sc.nextDouble();

		if (enter <= 25.0) {
			resultado = enter;
			System.out.println("Esse valor esta no intervalo de [0.25]");

		} else if (enter <= 50.0) {
			resultado = enter;
			System.out.println("Esse valor esta no intervalo de [25.50]");
		}

		else if (enter <= 75.0) {
			resultado = enter;
			System.out.println("Esse valor esta no intervalo de [50.75]");
		} else if (enter <= 100) {
			resultado = enter;
			System.out.println("Esse valor esta no intervalo de [75.100]");

		} else if (enter < 0.0 || enter > 100) {
			resultado = enter;
			System.out.println("Esse numero esta fora de intervalo");

		}

		sc.close();

	}

}
