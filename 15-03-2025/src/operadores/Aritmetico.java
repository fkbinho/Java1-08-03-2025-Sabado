package operadores;

public class Aritmetico {

	public static void main(String[] args) {

		int numero1 = 8;
		int numero2 = 3;
		
		int soma = numero1 + numero2;
		System.out.println("Soma: " + soma);
		
		int subtracao = numero1 - numero2;
		System.out.println("Subtração: " + subtracao);
		
		int multiplicacao = numero1 * numero2;
		System.out.println("Multiplicação: " + multiplicacao);
		
		double divisao = (double) numero1 / numero2; // casting
		System.out.printf("Divisão: %.2f%n", divisao);
		
		int resto = numero1 % numero2;
		System.out.println("Resto: " + resto);

		

	}

}
