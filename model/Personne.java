package model;

//import java.sql.Connection;
//import java.sql.Statement;
import java.util.Observable;

public abstract class Personne extends Observable {
	private String pseudo;
	private String motDePasse;
	private String nom;
	private String prenom;
	private int privilege;
	

	public Personne(String pseudo, String motDePasse) {
		this.pseudo = pseudo;
		this.motDePasse = pseudo;
	}
	
	public Personne(String pseudo, String motDePasse, String nom, String prenom, int privilege) {
		this.pseudo = pseudo;
		this.motDePasse = motDePasse;
		this.nom = nom;
		this.prenom = prenom;
		this.privilege = privilege;
		/*Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        int resultUpdate;
    	try {
            conn = DriverManager.getConnection("jdbc:mysql://DESKTOP-GMCCSDC:3306/db_test", "gimkil", "cisco");
            stmt = conn.createStatement();
<<<<<<< HEAD
            resultUpdate = stmt.executeUpdate("CREATE USER '" + pseudo +"'@'localhost' IDENTIFIED BY '" + motDePasse +"';");
            System.out.println(rs);
            resultUpdate = stmt.executeUpdate("INSERT INTO personne (pseudo, motDePasse, nom, prenom, privilege, adresse, adresseMail) VALUES (");
            System.out.println(rs);
=======
            resultUpdate = stmt.executeUpdate("CREATE USER '" + pseudo +"'@'DESKTOP-GMCCSDC' IDENTIFIED BY '" + motDePasse +"';");
            System.out.println(resultUpdate);
            resultUpdate = stmt.executeUpdate("INSERT INTO personne (pseudo, motDePasse, nom, prenom, privilege, adresse, adresseMail) VALUES (");
            System.out.println(resultUpdate);
>>>>>>> c2162f4ab7667fbe8e3847eee59cf940f2ad6119
            
        } catch (Exception ex) {
            // handle the error
        	System.out.println("SQLException: " + ex.getMessage());
        }
    	finally {
    		    if (stmt != null) {
    		        try {
    		            stmt.close();
    		        } catch (SQLException sqlEx) { } // ignore
<<<<<<< HEAD
=======

>>>>>>> c2162f4ab7667fbe8e3847eee59cf940f2ad6119
    		        stmt = null;
    		    }
    	}*/
	}
	
	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getPrivilege() {
		return privilege;
	}

	public void setPrivilege(int privilege) {
		this.privilege = privilege;
	}

	
	@Override
	public String toString() {
		return "pseudo=" + pseudo + ", motDePasse=" + motDePasse + ", nom=" + nom + ", prenom=" + prenom
				+ ", privilege=" + privilege;
	}

	public abstract int connect(String pseudo, String motDePasse);
	
	
}