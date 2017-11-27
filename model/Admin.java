package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Admin extends Personne {
	private int adminID;
	
	
	public Admin(String pseudo, String motDePasse, String nom, String prenom, int privilege) {
		super(pseudo, motDePasse, nom, prenom, privilege);

	}


	@Override
	public int connect(String pseudo, String motDePasse) {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://DESKTOP-GMCCSDC:3306/db_test", "gimkil", "cisco");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM personne WHERE pseudo='" +pseudo+"'" + "AND motDePasse='"+motDePasse+"'");
            rs.next();
            System.out.println("personneID" + rs.getString("personneID") + "pseudo" + rs.getString("pseudo") + "mdp" + rs.getString("motDePasse"));
            if (rs.getString("pseudo").equals(pseudo) && rs.getString("motDePasse").equals(motDePasse)) {
            	System.out.println("vous etes connecté");
            	return 0; //connection OK 
            }
            else {
            	System.out.println("vous etes poas connecté");
            	return -1; //connection pas OK
            }
            
        } catch (Exception ex) {
            // handle the error
        	System.out.println("SQLException: " + ex.getMessage());
        	return -1; //connection pas OK
        }
    	finally {
    		 if (rs != null) {
    		        try {
    		            rs.close();
    		        } catch (SQLException sqlEx) { } // ignore

    		        rs = null;
    		    }

    		    if (stmt != null) {
    		        try {
    		            stmt.close();
    		        } catch (SQLException sqlEx) { } // ignore

    		        stmt = null;
    		    }
    	}
	}
}
