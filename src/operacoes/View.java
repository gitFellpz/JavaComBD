package operacoes;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import br.com.fiap.model.Usuarios;
import br.com.fiap.repository.UsuarioDAO;
import testes.Teste;

public class View {

	public void visualizarUsuarios() throws SQLException {
		Scanner input = new Scanner(System.in);
		UsuarioDAO dao = new UsuarioDAO();
		
		List<Usuarios> listaUsuarios = dao.selectAll();
		
		for(Usuarios usuario : listaUsuarios){
			System.out.println("\n"
					+ "-----------");
			System.out.println("ID: "+usuario.getId());
			System.out.println("Nome: "+usuario.getNome());
			System.out.println("Email: "+usuario.getEmail());
			System.out.println("Senha: "+usuario.getSenha());
			System.out.println("-----------");
		}
		
		Teste.main(null);
		
		input.close();
	}

	
}
