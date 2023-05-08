package operacoes;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.fiap.model.Usuarios;
import br.com.fiap.repository.UsuarioDAO;

public class Insercao {
	int id, escolha;
	String nome, email, senha;
	Scanner input = new Scanner(System.in);
	UsuarioDAO dao = new UsuarioDAO();
	
	public void inserirUsuarios() throws SQLException {
		
		System.out.print("\ninsera seu ID: ");
		id = input.nextInt();
		
		input.nextLine();
		System.out.print("insera seu Nome: ");
		nome = input.nextLine();
		
		System.out.print("insera seu Email: ");
		email = input.nextLine();
		
		System.out.print("insera seu Senha: ");
		senha = input.nextLine();
		
		try {
			Usuarios padrao = new Usuarios(id, nome, email, senha);
			dao.insert(padrao);
			System.out.println("\nUsuário " + nome + " criado!");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		do {
			System.out.print(
					"\nDeseja continuar inserindo usuários?"
					+ "\n1 - Sim"
					+ "\n2 - Não"
					+ "\n: ");
			escolha = input.nextInt();
			if(escolha != 1 && escolha != 2) {
				System.out.println("\nValor incorreto!");
				return;
			}
			
			if(escolha == 1) {
				System.out.print("\ninsera seu ID: ");
				id = input.nextInt();
				
				input.nextLine();
				System.out.print("insera seu Nome: ");
				nome = input.nextLine();
				
				System.out.print("insera seu Email: ");
				email = input.nextLine();
				
				System.out.print("insera seu Senha: ");
				senha = input.nextLine();
				
				try {
					Usuarios padrao = new Usuarios(id, nome, email, senha);
					dao.insert(padrao);
					System.out.println("Usuário " + nome + " criado!");
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		} while(escolha == 1);
		
		

	}
		
	

}
