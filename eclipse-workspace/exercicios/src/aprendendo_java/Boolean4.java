package aprendendo_java;
import java.util.Scanner;
public class Boolean4 {

	public static void main(String[] args) {
		
		/*
		 *  Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
		começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */
		
		Scanner sc = new Scanner(System.in);
		int horaInicio;
		int horaFim;
		int duracao;
		
		System.out.println("Que horas o jogo começou?");
		horaInicio = sc.nextInt();
		
		System.out.println("Que horas o  jogo terminou?");
		horaFim = sc.nextInt();
		
		if(horaInicio < horaFim) {
			
				duracao = horaFim - horaInicio;
		}
		else {
				duracao = 24 - horaInicio + horaFim;
		}
		
		System.out.println("O jogo durou " + duracao + " hora(s)");
		
		sc.close();
	}

}
