package CondicionalSwitch;

import java.util.Scanner;

public class SistemaBancoo {

	public static void main(String[] args) {
		
		/*
		 * O usuário começa com um saldo inicial e 
		 * pode escolher entre as opções: 
		 * 1 - Depositar 
		 * 2 - Transferir 
		 * 3 - Sacar 
		 * 4 - Sair 
		 * O programa deve validar que não é
		 * possível transferir ou sacar mais do que o saldo disponível. 
		 * Após cada operação, o saldo atualizado deve ser exibido. 
		 * O programa só deve encerrar quando 
		 * o usuário escolher a opção 4 - Sair.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		double saldo = 1000.0;
		
		String menu ="""
				O que você deseja:
				1 - Depositar 
				2 - Transferir 
				3 - Sacar 
				4 - Sair
				""";
		System.out.print(menu);
		int escolha = scan.nextInt();
		
		switch(escolha) {
		case 1 -> {
			System.out.println("Valor para depósto:");
			double deposito = scan.nextDouble();
			
			if(deposito > 0) {
//				saldo = saldo + deposito;
				saldo += deposito;
				System.out.println("Saldo atual: " + saldo);
			} else {
				System.out.println("Valor inválido!");
			}
		}
		}
	}

}
