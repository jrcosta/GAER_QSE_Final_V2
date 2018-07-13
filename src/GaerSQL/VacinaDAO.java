package GaerSQL;

import GaerPrincipal.Vacina;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VacinaDAO {

    private Connection conexao;
    private boolean sucesso;

    public VacinaDAO() {
        try {
            this.conexao = ConectorBD.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(VacinaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void consutarVacina() throws SQLException {
        String sql = "SELECT * FROM vacina";
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            ResultSet rs = comando.executeQuery();

            while (rs.next()) {
                String vacinas = rs.getString("id_vacina");
                System.out.println("Vacinas: " + vacinas);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Vacina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean inserirVacina(Vacina v) {
        String sql = "INSERT INTO vacina (DESCRICAO_VACINA, QTD_ATUAL, QTD_MINIMA, OBS_VACINA, DT_VALIDADE, LOTE, CUSTO, FABRICANTE) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement inserir = conexao.prepareStatement(sql);
            inserir.setString(1, v.getDescricaoVacina());
            inserir.setInt(2, v.getQtdAtual());
            inserir.setInt(3, v.getQtdMinima());
            inserir.setString(4, v.getObsVacina());
            inserir.setString(5, v.getDtValidadeVacina());
            inserir.setString(6, v.getLote());
            inserir.setInt(7, v.getCusto());
            inserir.setString(8, v.getFabricante());
            int qtd = inserir.executeUpdate();
            System.out.println("Qtd inserido: " + qtd);
            this.sucesso = true;
        } catch (SQLException ex) {
            Logger.getLogger(Vacina.class.getName()).log(Level.SEVERE, null, ex);
            this.sucesso = false;
        }
        return sucesso;
    }

}
