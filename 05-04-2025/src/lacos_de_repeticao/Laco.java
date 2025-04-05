package lacos_de_repeticao;

import java.util.Scanner;

public class Laco {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	
//	System.out.println("Insira sua senha:");
//	int senha = scan.nextInt();
	//enquanto condicao for true
//	while(senha != 1234) {
//		System.out.println("Senha incorreta");
//	//permitir que o usuario tente novamente
//		System.out.println("Insira sua senha novamente:");
//		senha = scan.nextInt();
//	}
	
	int senhaCorreta = 1234;
	int tentativas = 1;
	int limiteTentativas = 3;
	while(tentativas <= limiteTentativas) {	
		System.out.println("Tentativa #" + tentativas);
		System.out.println("Insira sua senha");
		int senha = scan.nextInt();
		
		if(senha == senhaCorreta) {
			System.out.println("Acesso permitido!");
			break;
		} else {
			System.out.println("Senha incorreta.");
			System.out.println("Restam " + (limiteTentativas - tentativas) + " tentativas");

		}
		
		tentativas++;
	}
	
	if(tentativas > 3) {
		System.out.println("Senha bloqueada!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	System.out.println("Digite seu nome: ");
//	String nome = scan.nextLine();
//	double carteira = 0;
//	
//	double carteiraDoCliente = 1000;
//	
//	//while
//	//do-while
//	//for
//	
//	while(carteiraDoCliente > 0) {
//		System.out.println(nome);
//		System.out.println(nome);
//		System.out.println("---------");
//		carteira += 0.33;
//		carteiraDoCliente -= 0.33;
//		System.out.println("Pix recebido: 0.25");
//	}
//
//	System.out.println("Seu saldo: " + carteira);
//	System.out.println("saldo do cliente: " + carteiraDoCliente);
//	
//	
	
	
	
	
}
}
