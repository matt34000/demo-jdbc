package fr.diginamic.testbase;

import java.util.ResourceBundle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnexionJdbc {
	
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
			System.out.println(conn);
			conn.close();
		} catch (SQLException e) {
			System.out.println("Connexion impossible à établir.");
		}
		
	}

}
