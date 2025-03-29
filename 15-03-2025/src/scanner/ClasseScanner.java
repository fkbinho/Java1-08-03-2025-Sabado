package scanner;

import java.util.Scanner;

public class ClasseScanner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		String nome = scan.nextLine();
		
		System.out.println("Informe a sua idade:");
		int idade = scan.nextInt();
		scan.nextLine(); // limpando o buffer
		
		System.out.println("Qual o sexo: ");
		char sexo = scan.nextLine().charAt(0);
		
		System.out.println("Informe o peso: ");
		double peso = scan.nextDouble();
		
		System.out.println("Meu nome é " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Peso: " + peso);
		
		
		scan.close();
	}

}
