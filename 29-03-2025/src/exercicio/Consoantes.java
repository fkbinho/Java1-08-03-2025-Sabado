package exercicio;

import java.util.Scanner;

public class Consoantes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma letra: ");
		String letra = scan.nextLine().toLowerCase();
//b, c, d, f, g, h, j, k, l, m, n, p, q, r, s, t, w, x, y, z

		
		
		if (letra.charAt(0) == 'a' || letra.equals("e") || 
				letra.equals("i") || letra.equals("o") || 
				letra.equals("u")) {
			System.out.printf("%s é uma vogal%n", letra);
		} else if(letra.matches("^[0-9]+$")){
			System.out.printf("%s não é uma letra%n", letra);
		} else {
			System.out.printf("%s é uma consoante%n", letra);
		}

	}

}
