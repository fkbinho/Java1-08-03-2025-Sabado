package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
//		int[] numeros = new int[3];
//		
//		numeros[0] = 10;
//		numeros[1] = 15;
//		numeros[2] = 5;
//		
//		System.out.println(numeros[3]);
//		System.out.println();
//		
//		System.out.println(Arrays.toString(numeros));
//		
//		for(int i = 0; i < numeros.length; i++) {
//			System.out.print (numeros[i] + " ");
//		}
		
		System.out.println("Quantas notas deseja digitar:");
		int quantidadeNotas = scan.nextInt();
		
		double[] notas = new double[quantidadeNotas];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota #" + (i + 1));
			double nota = scan.nextDouble();
			notas[i] = nota;
		}
		
		double soma = notas[0] + notas[1] + notas[2];
		
		double media = soma / quantidadeNotas;
		
		//System.out.printf("Média das notas digitas: %.2f" + media);
		System.out.println(
				String.format(
				"Média das notas digitas: %.2f" + media));

	}

}
