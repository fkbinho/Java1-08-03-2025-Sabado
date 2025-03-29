package tipos_de_dados;

public class Exercicio {

	public static void main(String[] args) {
		/* 
		 * Crie variáveis com seus tipos de dados
		 * com as seguintes informações:
		 * nome, peso, altura, ano
		 * e exiba os dados no console
		 * 
		 * */
		
		// System.out.println()
		// System.out.print()
		// System.out.printf()
		
		String nome = "Kleber";
		double peso = 92.80;
		double altura = 1.78;
		int ano = 2025;

		String sobreNome = "Queiroz";
		
		System.out.printf("Meu nome é %s, e meu peso é %.2f "
				+ "e minha altura é %.2f. "
				+ "%nE estamos no ano de %d.", nome, peso, altura, ano);
	}

}
