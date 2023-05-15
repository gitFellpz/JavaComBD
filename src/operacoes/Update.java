package operacoes;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import br.com.fiap.model.Usuarios;
import br.com.fiap.repository.UsuarioDAO;
import testes.Teste;

public class Update {
	
	int id, escolha;
	String nome, email, senha;
	Scanner input = new Scanner(System.in);

	public void atualizarUsuario() throws SQLException {
		UsuarioDAO dao = new UsuarioDAO();
		
		System.out.print("\nInsira o nome: ");
		nome = input.nextLine();
		
		System.out.print("\nInsira o Email: ");
		email = input.nextLine();
		
		System.out.print("\nInsira o Senha: ");
		senha = input.nextLine();
		
		System.out.print("\nInsira o ID: ");
		id = input.nextInt();
		
		Usuarios padrao = new Usuarios(nome, email, senha);
		
		dao.update(padrao, id);
		
		Teste.main(null);
	}

}
