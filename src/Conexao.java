import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Conexao {

	public static void main(String[] args) {
		
		System.out.println("Inicio PostgreSQLMySQL");	
		try {
			Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5433/poo","postgres", "root");

			PreparedStatement pstm = conexao .prepareStatement("SELECT tablename FROM pg_tables order by tablename");
					
	 
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				System.out.println("Nome tabela: " + rs.getString("tablename"));				
			}
			rs.close();
			pstm.close();
			conexao.close();
	 
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Fim meu banco foi acessado");
				
					
	}
}