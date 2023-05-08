package operacoes;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.fiap.model.Usuarios;
import br.com.fiap.repository.UsuarioDAO;

public class Update {
	
	int id, escolha;
	String nome, email, senha;
	Scanner input = new Scanner(System.in);
	UsuarioDAO dao = new UsuarioDAO();

	public void atualizarUsuario() {

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
			dao.update(padrao);
			System.out.println("\nUsuário " + nome + " alterado!");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
