package testes;

import java.sql.SQLException;
import java.util.Scanner;
import operacoes.Delet;
import operacoes.Insercao;
import operacoes.Update;
import operacoes.View;

public class Teste {
	
	public static void main(String[] args) throws SQLException{
		Insercao insert = new Insercao();
		Delet dell = new Delet();
		Update up = new Update();
		View view = new View();
		
		Scanner input = new Scanner(System.in);
		int escolha;
		
		do {
			System.out.print(
					"\nQual operação você deseja fazer?"
					+ "\n1 - Inserção de usuários"
					+ "\n2 - Atualizar inf de usuários"
					+ "\n3 - Deletar usuários"
					+ "\n4 - Ver usuários"
					+ "\n0 - Exit"
					+ "");
			escolha = input.nextInt();
		}while(escolha == 0);
		
		switch(escolha) {
		case 1:
			insert.inserirUsuarios();
			break;
		case 2:
			up.atualizarUsuario();
			break;
		case 3:
			dell.deletarUsuario();
			break;
		case 4:
			
			break;
		default:
			System.out.println("\nValor incorreto!");
		}
		
		input.close();
	}

}
