package testes;

import java.sql.SQLException;
import java.util.Scanner;
import br.com.fiap.model.Usuarios;
import br.com.fiap.repository.UsuarioDAO;

public class Teste {
	
	public static void main(String[] args) throws SQLException{
		UsuarioDAO dao = new UsuarioDAO();
		Scanner input = new Scanner(System.in);
		int id, escolha2;
		String nome, email, senha;
		
		do {
			System.out.print(
					"\nQual operação você deseja fazer?"
					+ "\n1 - Inserção de usuários");
		}
		
		do {
			System.out.print("\ninsera seu ID: ");
			id = input.nextInt();
			
			input.nextLine();
			System.out.print("\ninsera seu Nome: ");
			nome = input.nextLine();
			
			System.out.print("\ninsera seu Email: ");
			email = input.nextLine();
			
			System.out.print("\ninsera seu Senha: ");
			senha = input.nextLine();
			
			System.out.print(
					"\nDeseja continuar inserindo usuários?"
					+ "\n1 - Sim"
					+ "\n2 - Não"
					+ "\n: ");
			escolha2 = input.nextInt();
		} while(escolha2 == 1);
		
		Usuarios padrao = new Usuarios(id, nome, email, senha);
		dao.insert(padrao);
		System.out.println("Usuário " + nome + " criado!");
		
		input.close();
	}

}
