package lacos_de_repeticao;

public class Exercicio {

	public static void main(String[] args) {
		/*
		 * Faça um programa que EXIBA uma sequência
		 * de 1 a 10.
		 * E depois uma contagem regressiva.
		 * */

		int contador = 1;
		
		while(contador <= 5) {
			System.out.println(contador);
			contador++; // incrementando + 1(contador = contador + 1;
		}
		System.out.println("------------");
		while(contador > 1) {
			contador--; 
			System.out.println(contador);
		}
		
		
		
	}

}
