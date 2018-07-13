package GaerSQL;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import GaerPrincipal.VacinarAnimal;
import java.sql.PreparedStatement;

public class VacinarAnimalDAO {

    private Connection conexao;
    private boolean sucesso;

    public VacinarAnimalDAO() {
        try {
            this.conexao = ConectorBD.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param vc
     * @return
     */
    public boolean inserirVacinacao(VacinarAnimal vc) {
        String sql = "INSERT INTO vacinacao (BRINCO_ANIMAL, ID_VACINA, DATA_VACINACAO, DOSES_VACINACAO, OBS_VACINACAO) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement inserir = conexao.prepareStatement(sql);
            inserir.setInt(1, vc.getBrincoAnimal());
            inserir.setInt(2, vc.getIdVacina());
            inserir.setString(3, vc.getDataVacinacao());
            inserir.setInt(4, vc.getDosesVacinacao());
            inserir.setString(5, vc.getObsVacinacao());
            int qtd = inserir.executeUpdate();
            System.out.println("Qtd inserido: " + qtd);
            this.sucesso = true;
        } catch (SQLException ex) {
            Logger.getLogger(VacinarAnimal.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Vacinação não inserida");
            this.sucesso = false;
        }
        return sucesso;
    }
    
}
