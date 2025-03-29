package condicional;

import java.util.Scanner;

public class ExercicioSwitchCase {

	public static void main(String[] args) {

		/* Solicitar ao usuario um mês e mostrar a ele
		 * ele em qual trimestre o mês se encontra
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o numero de 1 a 12: ");
		int numero = scan.nextInt();
		
		// solução 1
		switch(numero) {
		case 1, 2, 3 -> System.out.println("Primeiro Trimestre.");
		case 4, 5, 6 -> System.out.println("Segundo Trimestre.");
		case 7, 8, 9 -> System.out.println("Terceiro Trimestre.");
		case 10, 11, 12 -> System.out.println("Quarto Trimestre.");
		default -> System.out.println("Opção inválida!");
		}
		
		// solução 2
		String mensagem = switch(numero) {
		case 1, 2, 3 -> "Primeiro Trimestre.";
		case 4, 5, 6 -> "Segundo Trimestre.";
		case 7, 8, 9 -> "Terceiro Trimestre.";
		case 10, 11, 12 -> "Quarto Trimestre.";
		default -> "Opção inválida!";
		};
		
		System.out.println(mensagem);
		
//		String mes = "";
//		if (numero == 1) {
//			mes = "Janeiro";
//		} else if(numero == 2) {
//			mes = "Fevereiro";
//		}
		
		// solução 3
		switch(numero) {
		case 1:
		case 2:
		case 3:
			System.out.println("Primeiro Trimestre. ");
			break;
		case 4, 5, 6:
			System.out.println("Segundo Trimestre. ");
			break;
		case 7, 8, 9:
			System.out.println("Terceiro Trimestre.");
			break;
		case 10, 11, 12:
			System.out.println("Quarto Trimestre.");
			break;
		default:
			System.out.println("Opção inválida!");
		}
	}

}
