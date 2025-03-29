package exercicio;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		
		/* Verificar se o número é par ou ímpar. */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = scan.nextInt();

		String resultado = (numero % 2 == 0) ? "É par!" : "É ímpar!";
		
		System.out.println(resultado);
		
//		if(numero % 2 == 0) {
//			System.out.println("É par");
//		} else {
//			System.out.println("É ímpar");
//		}
		
		
	}

}
