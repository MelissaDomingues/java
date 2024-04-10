package aprendendo_java;
import java.util.Scanner;

public class Ex006 {

	public static void main(String[] args) {
		
		/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		decimais.
	    */

		Scanner ra = new Scanner(System.in);
		
		int funcionario;
		double horas;
		double salarioHoras;
		
		
		
		System.out.println("Olá! para começar digite o seu número de funcionário");
		funcionario = ra.nextInt();
		
		System.out.println("Agora digite o numero de horas trabalhadas");
		horas = ra.nextDouble();
		
		System.out.println("Quanto você recebe por hora trabalhada?");
		salarioHoras = ra.nextDouble();
		
		double salario = horas * salarioHoras;
		System.out.printf("Obrigada pelas informações! Pelos calculos, o funcionário: " + funcionario + " deve receber o salário de: U$ %.2f%n", salario);
		
		ra.close();

	}

}
