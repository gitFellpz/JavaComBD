package operacoes;

import java.sql.SQLException;
import java.util.Scanner;
import br.com.fiap.repository.UsuarioDAO;

public class Delet {

	public void deletarUsuario() throws SQLException {
		int id, escolha = 1;
		Scanner input = new Scanner(System.in);
		UsuarioDAO dao = new UsuarioDAO();

		System.out.print("\nInsira seu ID: ");
		id = input.nextInt();
		
		try {
			//ver se esse id existe - fazer
			dao.delete(id);
			System.out.println("Usuário com ID" + id + " excluido!");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		while(escolha == 1) {
			System.out.print(
					"\nDeseja continuar inserindo usuários?"
					+ "\n1 - Sim"
					+ "\n2 - Não"
					+ "\n: ");
			escolha = input.nextInt();
			
			if(escolha == 1) {
				System.out.print("\nInsira seu ID: ");
				id = input.nextInt();
				
				try {
					//ver se esse id existe - fazer
					dao.delete(id);
					System.out.println("Usuário com ID" + id + " excluido!");
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("\nEncerrando...");
		}

		input.close();
	}

}
