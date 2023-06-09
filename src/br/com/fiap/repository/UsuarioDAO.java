package br.com.fiap.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.fiap.connection.ConnectionFactory;
import br.com.fiap.model.Usuarios;
import java.sql.ResultSet;

public class UsuarioDAO {
	
	private Connection conexao;
	
	public UsuarioDAO() throws SQLException {
		this.conexao = ConnectionFactory.conectar();
	}
	
	//inserir um usuario
	public void insert(Usuarios usuario) throws SQLException {
								//nome da tabela
		String sql = "insert into USUARIOS (nome, email, senha, data)values(?,?,?,?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(1, usuario.getNome());
		stmt.setString(2, usuario.getEmail());
		stmt.setString(3, usuario.getSenha());
		stmt.setDate(4, usuario.getData());
		
		stmt.execute();		
		stmt.close();
	}
	
	public void update(Usuarios usuario) throws SQLException {
		//nome da tabela
		String sql = "update USUARIOS set nome=?, email=?  where id=?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(1, usuario.getNome());
		stmt.setString(2, usuario.getEmail());
		stmt.setInt(3, usuario.getId());
		
		stmt.execute();		
		stmt.close();
	}
	
	public void delete(int id) throws SQLException {
		//nome da tabela
		String sql = "delete from USUARIOS where id=?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setInt(1, id);
		
		stmt.execute();		
		stmt.close();
	}
	
	public List<Usuarios> selectAll() throws SQLException {
			
		List<Usuarios> usuarios = new ArrayList<Usuarios>();
		String sql = "select * from usuarios";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
			Usuarios usuario = new Usuarios();
			usuario.setId(rs.getInt("id"));
			usuario.setNome(rs.getString("nome"));
			usuario.setEmail(rs.getString("email"));
			usuario.setSenha(rs.getString("senha"));
			usuario.setData(rs.getDate("data"));
			
			usuarios.add(usuario);
		}
				
		stmt.close();
		rs.close();
		return usuarios;
	}
}
