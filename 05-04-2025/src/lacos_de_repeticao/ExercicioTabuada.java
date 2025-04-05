package lacos_de_repeticao;

import java.util.Scanner;

public class ExercicioTabuada {

	public static void main(String[] args) {
		/*
		 * TABUADA 1 x i = 3 2 x i = 6 3 x i = 9 . . . 10 x i = valor
		 */
		Scanner scan = new Scanner(System.in);

		
		while (true) {
			System.out.println("Digite um numero para" + " você ver a tabuada "
					+ "ou digite 0 para encerrar: ");
			
			int numero = scan.nextInt();
			
			if(numero == 0) {
				System.out.println("Encerrando...");
				break;
			}
			
			System.out.println("Tabuada de " + numero);
			for (int i = 1; i <= 10; i++) {
				System.out.println(i + " x " + numero + " = " + (i * numero));
			}
			System.out.println("-------------------");
		}
		
		/*
		 * //System.out.println(1 + " x " + numero + " = " + (1 * numero));
		//System.out.printf("%d x %d = %d%n", i, numero, (i * numero));
		 * System.out.printf("%d x %d = %d%n", 1, numero, (1 * numero));
		 * System.out.println(2 + " x " + numero + " = " + (2 * numero));
		 * System.out.println(3 + " x " + numero + " = " + (3 * numero));
		 * System.out.println(4 + " x " + numero + " = " + (4 * numero));
		 * System.out.println(5 + " x " + numero + " = " + (5 * numero));
		 * System.out.println(6 + " x " + numero + " = " + (6 * numero));
		 * System.out.println(7 + " x " + numero + " = " + (7 * numero));
		 * System.out.println(8 + " x " + numero + " = " + (8 * numero));
		 * System.out.println(9 + " x " + numero + " = " + (9 * numero));
		 * System.out.println(10 + " x " + numero + " = " + (10 * numero));
		 */

		/*
		 * comeco = numero x 1 continuacao = numero x 2, numero x 3... fim = numero x 10
		 * multiplicador X numero = resultado
		 * 
		 */

	}

}
