package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	public static void main(String[] args) throws SQLException {
		final String url="jdbc:mysql://localhost?verifyServerCertificate=false&&useTimezone=true&serverTimezone=UTC";
		final String usuario= "root";
		final String senha="Alucard@99";
		
		Connection conexao= DriverManager
				.getConnection(url,usuario,senha);
		
		System.out.println("CONEXÃO EFETUADA COM SUCESSO");
		conexao.close();
	}
}
