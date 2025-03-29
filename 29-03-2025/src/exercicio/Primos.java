package exercicio;

import java.util.Scanner;

public class Primos {

	public static void main(String[] args) {
		
		/* Verificar se um número é primo ou não */
		
		// numero primo é um número natural > 1 e 
		// divisível por 1 e por ele mesmo 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = scan.nextInt();
		
		if (numero <= 1) {
			System.out.println("Não é primo!");
		} else if (numero == 2 || numero == 3 || numero == 5
				|| numero == 7) {
			System.out.println("É primo!");
		} else if (numero % 2 == 0 || numero % 3 == 0
				|| numero % 5 == 0 || numero % 7 ==0 ) {
			System.out.println("Não é primo!");
		} else if (numero % Math.sqrt(numero) == 0){
			System.out.println("Não é primo!");
		} else {
			System.out.println("É primo");
		}

		// primo = numero % 1 == 0;
		// primo = numero % numero == 0;
		
//		10 { 1, 2, 5, 10}
//		16 { 1, 2, 4, 8, 16}
//		20 { 1, 2, 4, 5, 10, 20}
//		21 { 1, 3, 7, 21}
		
	}

}
