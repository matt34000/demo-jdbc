package fr.diginamic.props;

import java.util.ResourceBundle;
import java.util.Set;

public class TestConfiguration {

	public static void main(String[] args) {
		
		ResourceBundle props = ResourceBundle.getBundle("monfichier");
		
		String valeur = props.getString("user.password");
		//System.out.println(valeur);
		
		Set<String> keys = props.keySet();
		
		for (String key: keys) {
			
			valeur = props.getString(key);
			System.out.println(valeur);
		}
		
		

	}

}
