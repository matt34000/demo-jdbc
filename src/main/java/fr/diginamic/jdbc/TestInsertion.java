package fr.diginamic.jdbc;

import java.util.ResourceBundle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsertion {

	public static void main(String[] args) {
		

		ResourceBundle props = ResourceBundle.getBundle("database");
		
		String baseDriver = props.getString("base.driver");
		String baseUrl = props.getString("base.url");
		String baseLogin = props.getString("base.login");
		String basePassword = props.getString("base.password");
		
		
		try {
			Class.forName(baseDriver);
		} catch (ClassNotFoundException e) {
			System.out.println("Driver non trouvé !");
		}
		
		
		
		try {
			Connection conn = DriverManager.getConnection(baseUrl, baseLogin, basePassword);
			//System.out.println(conn);
			
			
					Statement monStatement = conn.createStatement();
					
					int nb = monStatement.executeUpdate("INSERT INTO FOURNISSEUR (ID,NOM) VALUES (4,'La Maison de la Peinture')");
					
					
					
					monStatement.close();
			
					
					conn.close();
			
		} catch (SQLException e) {
			System.out.println("Connexion impossible à établir.");
		}
		//finally { 
			//conn.close();
		//}
		
		
		
	}

}
