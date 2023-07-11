package ljbd.repository;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	private static Connection conexao;
	private static final String URL = "jdbc:mysql://localhost:3306/loja";
	private static final String USUARIO = "root";
	private static final String SENHA = "";
	
	
	
	public static Connection obter() {
		try {
			if(conexao == null || conexao.isClosed()) {
				conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
			}
			
			return conexao;
		} catch (SQLException e) {
			System.out.println("Erro ao obter conexão: " + e.getMessage());
		}
		
		return null;
	}
	
	public static void fechar() {
		try {
			if(conexao != null && !conexao.isClosed()) {
				conexao.close();
				conexao = null;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao fechar conexão: " + e.getMessage());
		}
	}
}
