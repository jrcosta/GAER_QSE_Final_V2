/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GaerTelas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author jricm
 */
@Entity
@Table(name = "vacina", catalog = "vacina_animal", schema = "")
@NamedQueries({
    @NamedQuery(name = "Vacina.findAll", query = "SELECT v FROM Vacina v")
    , @NamedQuery(name = "Vacina.findByIdVacina", query = "SELECT v FROM Vacina v WHERE v.idVacina = :idVacina")
    , @NamedQuery(name = "Vacina.findByDescricaoVacina", query = "SELECT v FROM Vacina v WHERE v.descricaoVacina = :descricaoVacina")
    , @NamedQuery(name = "Vacina.findByQtdAtual", query = "SELECT v FROM Vacina v WHERE v.qtdAtual = :qtdAtual")
    , @NamedQuery(name = "Vacina.findByQtdMinima", query = "SELECT v FROM Vacina v WHERE v.qtdMinima = :qtdMinima")
    , @NamedQuery(name = "Vacina.findByObsVacina", query = "SELECT v FROM Vacina v WHERE v.obsVacina = :obsVacina")
    , @NamedQuery(name = "Vacina.findByDtValidade", query = "SELECT v FROM Vacina v WHERE v.dtValidade = :dtValidade")
    , @NamedQuery(name = "Vacina.findByLote", query = "SELECT v FROM Vacina v WHERE v.lote = :lote")
    , @NamedQuery(name = "Vacina.findByCusto", query = "SELECT v FROM Vacina v WHERE v.custo = :custo")
    , @NamedQuery(name = "Vacina.findByFabricante", query = "SELECT v FROM Vacina v WHERE v.fabricante = :fabricante")
    , @NamedQuery(name = "Vacina.findByStatusVacina", query = "SELECT v FROM Vacina v WHERE v.statusVacina = :statusVacina")})
public class Vacina implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_VACINA")
    private Integer idVacina;
    @Column(name = "DESCRICAO_VACINA")
    private String descricaoVacina;
    @Column(name = "QTD_ATUAL")
    private Integer qtdAtual;
    @Column(name = "QTD_MINIMA")
    private Integer qtdMinima;
    @Column(name = "OBS_VACINA")
    private String obsVacina;
    @Column(name = "DT_VALIDADE")
    private String dtValidade;
    @Column(name = "LOTE")
    private String lote;
    @Column(name = "CUSTO")
    private Integer custo;
    @Column(name = "FABRICANTE")
    private String fabricante;
    @Column(name = "STATUS_VACINA")
    private Boolean statusVacina;

    public Vacina() {
    }

    public Vacina(Integer idVacina) {
        this.idVacina = idVacina;
    }

    public Integer getIdVacina() {
        return idVacina;
    }

    public void setIdVacina(Integer idVacina) {
        Integer oldIdVacina = this.idVacina;
        this.idVacina = idVacina;
        changeSupport.firePropertyChange("idVacina", oldIdVacina, idVacina);
    }

    public String getDescricaoVacina() {
        return descricaoVacina;
    }

    public void setDescricaoVacina(String descricaoVacina) {
        String oldDescricaoVacina = this.descricaoVacina;
        this.descricaoVacina = descricaoVacina;
        changeSupport.firePropertyChange("descricaoVacina", oldDescricaoVacina, descricaoVacina);
    }

    public Integer getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(Integer qtdAtual) {
        Integer oldQtdAtual = this.qtdAtual;
        this.qtdAtual = qtdAtual;
        changeSupport.firePropertyChange("qtdAtual", oldQtdAtual, qtdAtual);
    }

    public Integer getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(Integer qtdMinima) {
        Integer oldQtdMinima = this.qtdMinima;
        this.qtdMinima = qtdMinima;
        changeSupport.firePropertyChange("qtdMinima", oldQtdMinima, qtdMinima);
    }

    public String getObsVacina() {
        return obsVacina;
    }

    public void setObsVacina(String obsVacina) {
        String oldObsVacina = this.obsVacina;
        this.obsVacina = obsVacina;
        changeSupport.firePropertyChange("obsVacina", oldObsVacina, obsVacina);
    }

    public String getDtValidade() {
        return dtValidade;
    }

    public void setDtValidade(String dtValidade) {
        String oldDtValidade = this.dtValidade;
        this.dtValidade = dtValidade;
        changeSupport.firePropertyChange("dtValidade", oldDtValidade, dtValidade);
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        String oldLote = this.lote;
        this.lote = lote;
        changeSupport.firePropertyChange("lote", oldLote, lote);
    }

    public Integer getCusto() {
        return custo;
    }

    public void setCusto(Integer custo) {
        Integer oldCusto = this.custo;
        this.custo = custo;
        changeSupport.firePropertyChange("custo", oldCusto, custo);
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        String oldFabricante = this.fabricante;
        this.fabricante = fabricante;
        changeSupport.firePropertyChange("fabricante", oldFabricante, fabricante);
    }

    public Boolean getStatusVacina() {
        return statusVacina;
    }

    public void setStatusVacina(Boolean statusVacina) {
        Boolean oldStatusVacina = this.statusVacina;
        this.statusVacina = statusVacina;
        changeSupport.firePropertyChange("statusVacina", oldStatusVacina, statusVacina);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVacina != null ? idVacina.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vacina)) {
            return false;
        }
        Vacina other = (Vacina) object;
        if ((this.idVacina == null && other.idVacina != null) || (this.idVacina != null && !this.idVacina.equals(other.idVacina))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GaerTelas.Vacina[ idVacina=" + idVacina + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
