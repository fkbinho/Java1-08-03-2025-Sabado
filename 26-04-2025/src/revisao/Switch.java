package revisao;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero entre 1 e 7");
		int num = scan.nextInt();
		
		switch(num) {
		case 1 -> {
			System.out.println("Domingo");
			System.out.println("Bom domingo!");
		}
		case 2 -> System.out.println("Segunda");
		case 3 -> System.out.println("Terça");
		case 4 -> System.out.println("Quarta");
		case 5 -> System.out.println("Quinta");
		case 6 -> System.out.println("Sexta");
		case 7 -> System.out.println("Sabado");
		}
	}

}
