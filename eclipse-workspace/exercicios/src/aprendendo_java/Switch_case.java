package aprendendo_java;
import java.util.Scanner;
public class Switch_case {

	public static void main(String[] args) {
		
		Scanner fe = new Scanner(System.in);
		
		int x;
		String dia;
		
		System.out.println("Digite o numero do dia da semana:");
		x = fe.nextInt();
		
		switch (x) {
		case 1: 
			dia = "Domingo";
			break;
			
		case 2:
			dia = "Segunda - feira";
			break;
			
		case 3:
			dia = "Terça - feira";
			break;
			
		case 4:
			dia = "Quarta - feira";
			break;
			
		case 5:
			dia = "Quinta - feira";
			break;
			
		case 6:
			dia = "Sexta - feira";
			break;
			
		case 7:
			dia = "Sábado";
			break;
			
		default:
			dia = "Valor inválido";
			break;
		}
	 
		System.out.println("Dia da semana: " + dia);
		
		fe.close();
		
	
	}

}
