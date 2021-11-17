package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	public static Connection getConexao()throws SQLException {
		final String url="jdbc:mysql://localhost/curso_java?verifyServerCertificate=false&&useTimezone=true&serverTimezone=UTC";
		final String usuario= "root";
		final String senha="Alucard@99";
		
		return DriverManager.getConnection(url,usuario,senha);
		
	}
}
