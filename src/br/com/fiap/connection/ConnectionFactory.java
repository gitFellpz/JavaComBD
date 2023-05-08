package br.com.fiap.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory{
	
	private String schema = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";

	public Connection conectar() {
		try {
			return DriverManager.getConnection(schema, "RM93015", "010104");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	};
	
}
