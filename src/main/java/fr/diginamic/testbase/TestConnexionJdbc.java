package fr.diginamic.testbase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class TestConnexionJdbc {
	
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver non trouvé !");
		}
		try {
			Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/compta", "root", "");
			System.out.println(conn);
			conn.close();
		} catch (SQLException e) {
			System.out.println("Connexion impossible à établir.");
		}
	}

}
