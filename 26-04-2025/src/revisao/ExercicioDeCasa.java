package revisao;

import java.util.Scanner;

public class ExercicioDeCasa {

	public static void main(String[] args) {
		/*
		 Faça um programa que peça ao usuário um número
		 e mostre a tabuada deste número. 
		 Repita até o usuário digitar 0.
		 Depois, mostre a soma dos números digitados pelo usuário.		 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int soma = 0;
		int numero = 1;
		while(numero != 0) {
			System.out.println("Digite um número ou ZERO para encerrar:");
			numero = scan.nextInt();

			System.out.println("=====TABUADA=====");
			for(int i = 1; i <= 10; i++) {
				System.out.println(i + " x " + numero + " = " + (i * numero));
			}
			
			soma += numero;
		}

		System.out.println("Soma dos numeros digitado: " + soma);
		
		
//		1 x numero = resultado
//		2 x numero = resultado
//		3 x numero = resultado
//		.
//		. 
//		.
//		10 x numero = resultado
		scan.close();
	}

}
