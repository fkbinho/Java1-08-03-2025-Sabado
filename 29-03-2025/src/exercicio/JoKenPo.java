package exercicio;

import java.util.Random;
import java.util.Scanner;

public class JoKenPo {
	public static void main(String[] args) {

//		int val = random.nextInt(3) + 1;
//		System.out.println("Digite um número");
//		int num = scan.nextInt();
//		System.out.println("Número da Máquina: " + val);
//		System.out.println(num >= val);

		// jokenpo é o pedra-papel-tesoura
		// pedra vence a tesoura
		// tesoura vence o papel
		// papel vence a pedra

		// pedra perde para o papel
		// papel perde para a tesoura
		// tesoura perde para a pedra

		// pedra == pedra -> empate
		// papel == papel -> empate
		// tesoura == tesoura -> empate

		Scanner scan = new Scanner(System.in);
		Random random = new Random();
					//              0, 1, 2
		int computador = random.nextInt(3) + 1;
		
		String jogadaComputador;
		
		if(computador == 1) {
			jogadaComputador = "Pedra";
		} else if (computador == 2) {
			jogadaComputador = "Papel";
		} else {
			jogadaComputador = "Tesoura";
		}
		
		String menu = """
				Escolha uma das opções:
				Pedra
				Papel
				Tesoura
				""";

		System.out.print(menu);
		String jogadaUsuario = scan.nextLine();
		
		System.out.println("Usuário: " + jogadaUsuario);
		System.out.println("Computador: " + jogadaComputador);
		
		if(jogadaComputador.equalsIgnoreCase(jogadaUsuario)) {
			System.out.println("EMPATE!");
		} else if(jogadaComputador.equalsIgnoreCase("Pedra") && 
				jogadaUsuario.equalsIgnoreCase("Tesoura")
				|| 
				jogadaComputador.equalsIgnoreCase("Papel") && 
				jogadaUsuario.equalsIgnoreCase("Pedra")
				||
				jogadaComputador.equalsIgnoreCase("Tesoura") && 
				jogadaUsuario.equalsIgnoreCase("Papel")) {
			
			System.out.println("COMPUTADOR GANHOU!");
		} else {
			System.out.println("VOCÊ GANHOU!");
		}
	

	}
}
