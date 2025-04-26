package revisao;

import java.util.Scanner;

public class ValidadorDeSenha {

	public static void main(String[] args) {
		/*
		 1. A senha deve ter entre 6 e 12 caracteres.
		 2. A senha deve conter pelo menos uma letra maiúscula.
		 3. A senha deve conter pelo menos um número.
		 4. A senha não pode conter espaços em branco.
		 5. A senha não pode conter caracteres especiais, 
		 apenas letras e números.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		// Regex completo:
        // ^           --> início da linha
        // (?=.*[A-Z]) --> pelo menos uma letra maiúscula
        // (?=.*\\d)  --> pelo menos um dígito
        // [A-Za-z\\d]{6,12} --> apenas letras e números, com tamanho entre 6 e 12
        // $           --> fim da linha
//        String regex = "^(?=.[A-Z])(?=.\\d)[A-Za-z\\d]{6,12}$";
//
//        while (true) {
//            System.out.print("Digite a senha: ");
//            String senha = scan.nextLine();
//
//            if (senha.matches(regex)) {
//                System.out.println("Senha válida");
//                break;
//            } else {
//                System.out.println("Senha inválida! Certifique-se que sua senha:\n" +
//                        "- Tem entre 6 e 12 caracteres\n" +
//                        "- Contém pelo menos uma letra maiúscula\n" +
//                        "- Contém pelo menos um número\n" +
//                        "- Não contém espaços ou caracteres especiais\n");
//            }
//        }
		
//		while(true) {
//            System.out.println("Digite a senha:");
//            String senha = scan.nextLine();
//
//            boolean senhaValida = true;
//
//            // Verificar comprimento da senha
//            if (senha.length() < 6 || senha.length() > 12) {
//                System.out.println("A senha deve ter entre 6 e 12 caracteres.");
//                senhaValida = false;
//            }
//
//            // Verificar se contém pelo menos uma letra maiúscula
//            boolean temMaiuscula = false;
//            for (int i = 0; i < senha.length(); i++) {
//                char c = senha.charAt(i);
//                if (c >= 'A' && c <= 'Z') {
//                    temMaiuscula = true;
//                    break;
//                }
//            }
//
//            if (!temMaiuscula) {
//                System.out.println("A senha deve conter pelo menos uma letra maiúscula.");
//                senhaValida = false;
//            }
//
//            // Verificar se contém pelo menos um número
//            boolean temNumero = false;
//            for (int i = 0; i < senha.length(); i++) {
//                char c = senha.charAt(i);
//                if (c >= '0' && c <= '9') {
//                    temNumero = true;
//                    break;
//                }
//            }
//
//            if (!temNumero) {
//                System.out.println("A senha deve conter pelo menos um número.");
//                senhaValida = false;
//            }
//
//            // Verificar se contém espaços em branco
//            if (senha.contains(" ")) {
//                System.out.println("A senha não pode conter espaços em branco.");
//                senhaValida = false;
//            }
//
//            // Verificar se contém caracteres especiais
//            for (int i = 0; i < senha.length(); i++) {
//                char c = senha.charAt(i);
//                if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'))) {
//                    System.out.println("A senha não pode conter caracteres especiais.");
//                    senhaValida = false;
//                    break;
//                }
//            }
//            if (senhaValida) {
//                System.out.println("Senha válida.");
//                break;
//            } else {
//                System.out.println("Senha inválida.\n");
//            }
//        }
        
//        System.out.println("----------------------------------------------------------");
//		
		while(true) {
			System.out.println("Digite a senha:");
			String senha = scan.nextLine();
			
			// verificar tamanho da senha
			if(senha.length() < 6 || senha.length() > 12) {
				System.out.println("Sua senha precisa conter entre 6 e 12 caracteres.");
				continue;
			}
			
			boolean eMaiuscula = false;
			boolean temNumero = false;
			boolean temEspaco = false;
			boolean temEspecial = false;
			
			for(int i = 0; i < senha.length(); i++) {
				char c = senha.charAt(i);
				
				// Verfica é letra maiúscula
				if(Character.isUpperCase(c)) {  // c >= 'A' && c <= 'Z'
					eMaiuscula = true;
				}
				
				// Verifica é números
				if(Character.isDigit(c)) {
					temNumero = true;
				}
				
				// Verifica é espaço em branco
				if(Character.isWhitespace(c)) {
					temEspaco = true;
				}
				
				// Verifica se é um caractere especial
				if(!Character.isLetterOrDigit(c)) {
					temEspecial = true;
				}
			}
			
			if(!eMaiuscula) {
				System.out.println("Sua senha deve conter pelo menos uma letra maiúscula.");
				continue;
			}
			
			if(!temNumero) { 
				System.out.println("Sua senha deve conter pelo menos um numero.");
				continue;
			}
			
			if(temEspaco) {
				System.out.println("Não pode conter espaços em branco.");
				continue;
			}
			
			if(temEspecial) {
				System.out.println("A senha não pode conter caracteres especiais.");
				continue;
			}
			break;
		}
		
		System.out.println("Senha válida.");
		
		scan.close();
	}

}
