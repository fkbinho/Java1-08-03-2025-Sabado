package condicional;

import java.util.Scanner;

public class EstruturaSwitchCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		/* pedir ao usuario um valor de 1 a 7 e mostrar o dia da semana
		 * onde 1 é domingo 2 é segunda...
		 * */
		
		System.out.println("Digite um numero entre 1 e 7: ");
		int numero = scan.nextInt();
		
//		switch(numero) {
//		case 1:
//			System.out.println("Domingo");
//			break;
//		case 2:
//			System.out.println("Segunda");
//			break;
//		case 3:
//			System.out.println("Terça");
//			break;
//		case 4:
//			System.out.println("Quarta");
//			break;
//		case 5:
//			System.out.println("Quinta");
//			break;
//		case 6:
//			System.out.println("Sexta");
//			break;
//		case 7:
//			System.out.println("Sábado");
//			break;
//		default:
//			System.out.println("Opção inválida");
//		}
		
		String mensagem = switch (numero) {
		case 1 -> "Domingo";
		case 2 -> "Segunda";
		case 3 -> "Terça";
		case 4 -> "Quarta";
		case 5 -> "Quinta";
		case 6 -> "Sexta";
		case 7 -> "Sábado";
		default -> "Valor inválido";
		};
		
		System.out.println(mensagem);
		
//		int opcao = 4;
//		
//		switch (opcao) {
//		case 1:
//			System.out.println("Opção 1");
//			break;
//		case 2:
//			System.out.println("Opção 2");
//			break;
//		case 3:
//			System.out.println("Opção 3");
//			break;
//		default:
//			System.out.println("Opcão inválida.");
//		}
//		
		
		
//		if (opcao == 1) {
//			System.out.println("Opcao 1");
//		} else if (opcao == 2) {
//			System.out.println("Opcao 2");
//		}

	}

}