package CondicionalSwitch;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("Qual o semáforo:");
//		String sinal = scan.nextLine();
//		
//		switch(sinal) {
//		case "verde":
//			System.out.println("Siga em frente!");
//		break;
//		case "amarelo":
//			System.out.println("Atenção, o semáforo vai fechar!");
//		break;
//		case "vermelho":
//			System.out.println("PARE!");
//		break;
//		default:
//			System.out.println("Semáforo inválido");
//		}

		System.out.println("Informe o dia da semana:");
		String dia = scan.nextLine();
		
		String resultado = switch(dia) {
		case "segunda", "terça", "quarta", "quinta","sexta" 
		-> "Dia útil";
		case "sábado", "domingo" 
		-> "Fim de semana";
		default 
		-> "Dia inválido";
		};
		System.out.println(resultado);
	}

}
