package exercicio;

import java.util.Scanner;

public class Potenciacao {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
//	System.out.println("Digite a base: ");
//	int base = scan.nextInt();
//	System.out.println("Digite o expoente: ");
//	int expoente = scan.nextInt();
//
//	System.out.println((int) Math.pow(base, expoente));

System.out.println("Digite um turno (manhã/tarde/noite):");
	String turno = scan.nextLine();
	
	
	//turno é manhã? sim (matutino) : não | 
		//então turno é tarde? sim (vespertino) : não | 
		//então é noite
	turno = turno.equalsIgnoreCase("manhã") ? "matutino" :
		turno.equalsIgnoreCase("tarde") ? "vespertino" : "noturno";
	
	System.out.println("Turno: " + turno);
	
//	if(turno.equalsIgnoreCase("manhã")) {
//		turno = "matutino";
//	} else if(turno.equalsIgnoreCase("tarde")) {
//		turno = "vespertino";
//	} else {
//		turno = "noturno";
//	}
	
	
	
	
	
	
}
}
