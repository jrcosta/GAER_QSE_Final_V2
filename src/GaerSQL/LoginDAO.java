package GaerSQL;

import GaerPrincipal.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginDAO {

    private Connection login;
    private boolean autenticado = false;

    public LoginDAO() {
        try {
            this.login = ConectorBD.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void conectarUsuario(Usuario u) throws SQLException {
        String sql = "select id_usuario, login, senha from usuarios where login=? and senha=?";
        PreparedStatement efetuarLogin = login.prepareStatement(sql);
        efetuarLogin.setString(1, u.getLogin());
        efetuarLogin.setString(2, u.getSenha());
        ResultSet rs = efetuarLogin.executeQuery();

        if (rs.next()) {
            String login = rs.getString("login");
            String senha = rs.getString("senha");
            autenticado = true;
        } else {
            JOptionPane.showMessageDialog(null, "Dados Incorretos");
        }
    }
    
    public boolean autenticado() {
        return autenticado;
        
    }
    
    
}
