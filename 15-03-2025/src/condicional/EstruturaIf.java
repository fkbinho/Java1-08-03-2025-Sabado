package condicional;

import java.util.Scanner;

public class EstruturaIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Informe o primeiro valor");
//		int valor1 = scan.nextInt();
//		
//		System.out.println("Informe o segundo valor");
//		int valor2 = scan.nextInt();
//		
//		if (valor1 < valor2) {
//			System.out.println("Valor 1 é menor do que o valor 2");
//		} else if (valor1 == valor2) {
//			System.out.println("Valor 1 é igual ao valor 2");	
//		} else {
//			System.out.println("Valor 1 é maior do que o valor 2");
//		}

		System.out.println("Digite um número: ");
		int valor = scan.nextInt();
		
//		if (valor % 2 == 0) {
//			System.out.println("É par");
//		} else {
//			System.out.println("É ímpar");
//		}
		
		// operador ternário
		
		String resultado;
		resultado = (valor % 2 == 0) ? "É par":"É impar";
		
		System.out.println(resultado);
	}

}
