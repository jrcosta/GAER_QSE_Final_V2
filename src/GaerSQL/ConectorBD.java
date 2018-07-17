package GaerSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConectorBD {

    private static Connection conexao;

    public static Connection getConexao() throws SQLException {
        conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/vacina_animal", "gaersys", "gaerpass");

        //System.out.println("Conexão: " + conexao);
        return conexao;
    }
    
    public static String desconectar(){
        try {
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConectorBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
   
}
