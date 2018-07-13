package GaerSQL;

import GaerPrincipal.Animal;
import GaerPrincipal.Vacina;
import GaerTelas.Painel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.Exception;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AnimalDAO {

    private Connection conexao;
    private boolean sucesso;

    public AnimalDAO() {
        try {
            this.conexao = ConectorBD.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void consultarAnimal() throws SQLException {
        String sql = "SELECT * FROM animal";
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            ResultSet rs = comando.executeQuery();

            while (rs.next()) {
                String animais = rs.getString("id_animal");
                System.out.println("Animais: " + animais);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Vacina.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean inserirAnimal(Animal a) {
        String sql = "INSERT INTO animal (NR_BRINCO, FZND_ORIGEM, DT_NASCIMENTO, OBS_ANIMAL, SEXO, RACA) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement inserir = conexao.prepareStatement(sql);
            inserir.setInt(1, a.getNrBrinco());
            inserir.setString(2, a.getFazendaOrigem());
            inserir.setString(3, a.getDataNascimento());
            inserir.setString(4, a.getObsAnimal());
            inserir.setString(5, a.getSexo());
            inserir.setString(6, a.getRaca());
            int qtd = inserir.executeUpdate();
            System.out.println("Qtd inserido: " + qtd);
            this.sucesso = true;
        } catch (SQLException ex) {
            Logger.getLogger(Vacina.class.getName()).log(Level.SEVERE, null, ex);
            if (ex instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException) {
                JOptionPane.showMessageDialog(null, "Número do Brinco Duplicado");
            }
            this.sucesso = false;
        }
        return sucesso;
    }

}
