package condicional;

import java.util.Scanner;

public class ExercicioIf {

	public static void main(String[] args) {
		
		/* Solicite ao usúario 3 notas e o nome 
		 * faça a média
		 * e diga a situação dele:
		 * media >= 7 - ele tá aprovado
		 * media >= 4 e media < 7 - ele ta em recuperação
		 * media < 4 - ele ta reprovado
		 * */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeiro nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		double nota3 = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("Digite o nome do aluno: ");
		String aluno = scan.nextLine();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
//		if (media >= 7) {
//			if(media == 10) {
//				System.out.println("Aprovador com louvor");
//			} else {
//				System.out.println("O aluno " + aluno + " está aprovado.");
//			}
//		} else if (media >= 4) {
//			System.out.println("O aluno " + aluno + " está em recuperação.");
//		} else {
//			System.out.println("O aluno " + aluno + " está reprovado.");
//
//		}
		
		String resultado;
		resultado = (media >= 7) ? 
					(media == 10) ? "Aprovado com louvor": "Aprovado"
						: (media >= 4) ? "Recuperação" 
						: "Reprovado";
		
		System.out.println(resultado);
	}

}
