package operacoes;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.fiap.model.Usuarios;
import br.com.fiap.repository.UsuarioDAO;

public class View {

	public void visualizarUsuarios() throws SQLException {
		Scanner input = new Scanner(System.in);
		UsuarioDAO dao = new UsuarioDAO();
		
		List<Usuarios> listaUsuarios = dao.selectAll();
		
		for(int i=0; ) listaUsuarios.size(); i++{
			System.out.println("ola");
		}
		
		input.close();
	}

	
}
