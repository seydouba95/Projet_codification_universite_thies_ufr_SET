/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDonnees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author seydou
 */
public class BDD {

    //declaration des variables
    Connection cnx;
    Statement st;
    ResultSet rs;
    String url;
    String username;
    String password;
    String host;
    int port;
  String SQL;

   
    public BDD(String url, String username, String password, String host, int port) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.host = host;
        this.port = port;
    }

    //creation de la connectiion a la base de donnees
    public Connection connexionDatabase() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return cnx;
    }

    //fermeture de la connexion a la base de donnees
    public Connection closeConnexion() {
        try {
            cnx.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return cnx;
    }

    //fonction permettant l'execution de requete
    public ResultSet executeQuery(String sql) {
        connexionDatabase();
        ResultSet rs = null;
        try {

            st = cnx.createStatement();
            rs = st.executeQuery(sql);
            System.out.println(sql);
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return rs;
    }

    //fonction permettant l'execution de requete update
    public String executeUpdate(String sql) {
        connexionDatabase();
        String rs = "";

        try {

            st = cnx.createStatement();
            st.executeUpdate(sql);
            rs = sql;
        } catch (SQLException ex) {
            rs = ex.toString();
        }
        return rs;
    }

    //fonction de requete pour afficher tous 
    public ResultSet querySelectAll(String nomTable) {

        connexionDatabase();
        SQL = "SELECT * FROM " + nomTable;
        System.out.println(SQL);
        return this.executeQuery(SQL);

    }
    //fonction pour afficher tous avec de parametre {"etat"}

    public ResultSet querySelectAll(String nomTable, String etat) {
        connexionDatabase();
        SQL = "SELECT * FROM " + nomTable + " WHERE " + etat;
        System.out.println(SQL);
        return this.executeQuery(SQL);
    }

    //fonction selectionner  des donnees
    public ResultSet querySelect(String[] nomColonne, String nomTable) {
        connexionDatabase();

        SQL = "SELECT ";
        for (int i = 0; i <= nomColonne.length - 1; i++) {
            SQL += nomColonne[i];
            if (i < nomColonne.length - 1) {
                SQL += ",";

            }
        }
        SQL += " FROM " + nomTable;
        return this.executeQuery(SQL);
    }

    //fonction sectionner des donnees avec parametre {"etat"}
    public ResultSet selectCommande(String[] nomColonne, String nomTable, String etat) {
        connexionDatabase();
        SQL = "SELECT ";

        for (int i = 0; i <= nomColonne.length - 1; i++) {

            SQL += nomColonne[i];

            if (i < nomColonne.length - 1) {
                SQL += ",";
            }

        }
        SQL += " FROM " + nomTable + " WHERE " + etat;
        return this.executeQuery(SQL);

    }

    //fonction pour inserer des donnees
    public String queryInsert(String nomTable, String[] contenuTableau) {
        connexionDatabase();
        SQL = "INSERT INTO " + nomTable + " VALUES(";

        for (int i = 0; i <= contenuTableau.length - 1; i++) {
            SQL += "'" + contenuTableau[i] + "'";
            if (i < contenuTableau.length - 1) {
                SQL += ",";
            }
        }
        SQL += ")";
        return this.executeUpdate(SQL);

    }

    //fonction inserer des donnees avec choix de values
    public String queryInsert(String nomTable, String[] nomColonne, String[] contenuTableau) {
        connexionDatabase();
        SQL = "INSERT INTO " + nomTable + "(";

        for (int i = 0; i <= nomColonne.length - 1; i++) {
            SQL += nomColonne[i];

            if (i < nomColonne.length - 1) {

                SQL += ",";
            }
        }
        SQL += ") VALUES( ";
        for (int i = 0; i <= contenuTableau.length - 1; i++) {
               SQL += "'" + contenuTableau[i] + "'";

            if (i < contenuTableau.length - 1) {

                SQL += ",";
            }
        }
        SQL += ")";
        return this.executeUpdate(SQL);
    }

    //fonction pour modifier des donnees
    public String queryUpdate(String nomTable, String[] nomColonne, String[] contenuTableau, String etat) {

        connexionDatabase();
        SQL = "UPDATE " + nomTable + " SET ";
        for (int i = 0; i <=    nomColonne.length - 1; i++) {
            SQL += nomColonne[i] + "= '" + contenuTableau[i] + "'";
            if (i < nomColonne.length - 1) {
                SQL += ",";
            }
        }
        SQL += " WHERE " + etat;
        return this.executeUpdate(SQL);
    }

    //fonction supprimer sans parametre
    public String queryDelete(String nomTable) {
        connexionDatabase();

        SQL = "DELETE FROM " + nomTable;
        return this.executeUpdate(SQL);
    }

    //fonction supprimer avec parametre
    public String queryDelete(String nomTable, String etat) {
        connexionDatabase();

        SQL = "DELETE FROM " + nomTable + " WHERE " + etat;
        return this.executeUpdate(SQL);
    }
}

