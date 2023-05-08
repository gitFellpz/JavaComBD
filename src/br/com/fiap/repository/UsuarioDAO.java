package br.com.fiap.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.connection.ConnectionFactory;
import br.com.fiap.model.Usuarios;

public class UsuarioDAO {
	
	private Connection conexao;
	
	public UsuarioDAO() {
		this.conexao = new ConnectionFactory().conectar();
	}
	
	//inserir um usuario
	public void insert(Usuarios usuario) throws SQLException {
								//nome da tabela
		String sql = "insert into usuarios(id, nome, email, senha, data)values(?,?,?,?,?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setInt(1, usuario.getId());
		stmt.setString(2, usuario.getNome());
		stmt.setString(3, usuario.getEmail());
		stmt.setString(4, usuario.getSenha());
		stmt.setDate(5, usuario.getData());
		
		stmt.execute();		
		stmt.close();
	}
}
