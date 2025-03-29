package operadores;

public class Logico {

	public static void main(String[] args) {
		
		int valor1 = 8;
		int valor2 = 5;
		boolean resultado;
		
		resultado = !(valor2 % 2 == 0);
		System.out.println(resultado);
		
		
		resultado = valor1 > valor2 || valor1 == valor2;
		System.out.println(resultado);
		
		resultado = valor1 > valor2 && !(valor1 == valor2);
		System.out.println(resultado);
	}

}
