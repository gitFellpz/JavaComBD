package testes;

import java.sql.SQLException;
import br.com.fiap.model.Usuarios;
import br.com.fiap.repository.UsuarioDAO;

public class Teste {
	
	public static void main(String[] args) throws SQLException{
		
		UsuarioDAO dao = new UsuarioDAO();
		Usuarios felipe = new Usuarios(1, "Felipe", "felipe@gmail.com", "1234");
		
		dao.insert(felipe);
		
	}

}
