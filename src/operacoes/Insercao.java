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
		do {
			System.out.print("\ninsera seu ID: ");
			id = input.nextInt();
			
			input.nextLine();
			System.out.print("insera seu Nome: ");
			nome = input.nextLine();
			
			System.out.print("insera seu Email: ");
			email = input.nextLine();
			
			System.out.print("insera seu Senha: ");
			senha = input.nextLine();
			
			System.out.print(
					"\nDeseja continuar inserindo usuários?"
					+ "\n1 - Sim"
					+ "\n2 - Não"
					+ "\n: ");
			escolha = input.nextInt();
			if(escolha != 1 && escolha != 2) {
				System.out.println("\nValor incorreto!");
				escolha = 1;
			}
			
		} while(escolha == 1);
		
		try {
			Usuarios padrao = new Usuarios(id, nome, email, senha);
			dao.insert(padrao);
			System.out.println("Usuário " + nome + " criado!");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}

	}
		
	

}
