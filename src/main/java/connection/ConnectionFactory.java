package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection recuperarConexao() throws SQLException {
		//retorna a conex�o toda vez que � chamado
		//comando que permite a conexao existir
		return DriverManager.getConnection("jdbc:mysql://localhost/bancocsv?useTimezone=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true","root","1234");
		
	}
}