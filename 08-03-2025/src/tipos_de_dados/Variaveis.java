package tipos_de_dados;

public class Variaveis {

	public static void main(String[] args) {
		// -> para comentários em uma única linha
		
		/* -> para um bloco de comentário
		 */
		
		//Tipos de dados
		/* inteiros
		 * reais
		 * caracteres
		 * booleanos
		 * texto
		 */
		
		// inteiros
		int idade; // declarando variável
		idade = 33; // atribuindo valor a variável
		System.out.println("Tenho " + idade + " anos.");
		System.out.println("---------------");
		long ano;
		ano = 2025;
		System.out.println("Nós estamos no ano de " + ano);
		
		// reais
		float peso;
		peso = 92.5f;
		System.out.println("Meu peso é " + peso);
		
		double altura;
		altura = 1.78;
		System.out.println("Minha altura é " + altura);
		
		// caracteres
		char sexo = 'M';
		System.out.println("Meu sexo é " + sexo);

		// texto
		String nome = "Kleber";
		System.out.println("Meu nome é " + nome);
		
		// booleano
		boolean tenhoDinheiro = false;
		System.out.println("Eu tenho dinheiro " + tenhoDinheiro);
		

	
	}

}
