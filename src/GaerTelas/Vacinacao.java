/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GaerTelas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author jricm
 */
@Entity
@Table(name = "Vacinacao", catalog = "vacina_animal", schema = "")
@NamedQueries({
    @NamedQuery(name = "Vacinacao.findAll", query = "SELECT v FROM Vacinacao v")
    , @NamedQuery(name = "Vacinacao.findByIdVacinacao", query = "SELECT v FROM Vacinacao v WHERE v.idVacinacao = :idVacinacao")
    , @NamedQuery(name = "Vacinacao.findByBrincoAnimal", query = "SELECT v FROM Vacinacao v WHERE v.brincoAnimal = :brincoAnimal")
    , @NamedQuery(name = "Vacinacao.findByIdVacina", query = "SELECT v FROM Vacinacao v WHERE v.idVacina = :idVacina")
    , @NamedQuery(name = "Vacinacao.findByDataVacinacao", query = "SELECT v FROM Vacinacao v WHERE v.dataVacinacao = :dataVacinacao")
    , @NamedQuery(name = "Vacinacao.findByDosesVacinacao", query = "SELECT v FROM Vacinacao v WHERE v.dosesVacinacao = :dosesVacinacao")
    , @NamedQuery(name = "Vacinacao.findByObsVacinacao", query = "SELECT v FROM Vacinacao v WHERE v.obsVacinacao = :obsVacinacao")})
public class Vacinacao implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_VACINACAO")
    private Integer idVacinacao;
    @Basic(optional = false)
    @Column(name = "BRINCO_ANIMAL")
    private int brincoAnimal;
    @Basic(optional = false)
    @Column(name = "ID_VACINA")
    private int idVacina;
    @Column(name = "DATA_VACINACAO")
    @Temporal(TemporalType.DATE)
    private Date dataVacinacao;
    @Column(name = "DOSES_VACINACAO")
    private Integer dosesVacinacao;
    @Column(name = "OBS_VACINACAO")
    private String obsVacinacao;

    public Vacinacao() {
    }

    public Vacinacao(Integer idVacinacao) {
        this.idVacinacao = idVacinacao;
    }

    public Vacinacao(Integer idVacinacao, int brincoAnimal, int idVacina) {
        this.idVacinacao = idVacinacao;
        this.brincoAnimal = brincoAnimal;
        this.idVacina = idVacina;
    }

    public Integer getIdVacinacao() {
        return idVacinacao;
    }

    public void setIdVacinacao(Integer idVacinacao) {
        Integer oldIdVacinacao = this.idVacinacao;
        this.idVacinacao = idVacinacao;
        changeSupport.firePropertyChange("idVacinacao", oldIdVacinacao, idVacinacao);
    }

    public int getBrincoAnimal() {
        return brincoAnimal;
    }

    public void setBrincoAnimal(int brincoAnimal) {
        int oldBrincoAnimal = this.brincoAnimal;
        this.brincoAnimal = brincoAnimal;
        changeSupport.firePropertyChange("brincoAnimal", oldBrincoAnimal, brincoAnimal);
    }

    public int getIdVacina() {
        return idVacina;
    }

    public void setIdVacina(int idVacina) {
        int oldIdVacina = this.idVacina;
        this.idVacina = idVacina;
        changeSupport.firePropertyChange("idVacina", oldIdVacina, idVacina);
    }

    public Date getDataVacinacao() {
        return dataVacinacao;
    }

    public void setDataVacinacao(Date dataVacinacao) {
        Date oldDataVacinacao = this.dataVacinacao;
        this.dataVacinacao = dataVacinacao;
        changeSupport.firePropertyChange("dataVacinacao", oldDataVacinacao, dataVacinacao);
    }

    public Integer getDosesVacinacao() {
        return dosesVacinacao;
    }

    public void setDosesVacinacao(Integer dosesVacinacao) {
        Integer oldDosesVacinacao = this.dosesVacinacao;
        this.dosesVacinacao = dosesVacinacao;
        changeSupport.firePropertyChange("dosesVacinacao", oldDosesVacinacao, dosesVacinacao);
    }

    public String getObsVacinacao() {
        return obsVacinacao;
    }

    public void setObsVacinacao(String obsVacinacao) {
        String oldObsVacinacao = this.obsVacinacao;
        this.obsVacinacao = obsVacinacao;
        changeSupport.firePropertyChange("obsVacinacao", oldObsVacinacao, obsVacinacao);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVacinacao != null ? idVacinacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vacinacao)) {
            return false;
        }
        Vacinacao other = (Vacinacao) object;
        if ((this.idVacinacao == null && other.idVacinacao != null) || (this.idVacinacao != null && !this.idVacinacao.equals(other.idVacinacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GaerTelas.Vacinacao[ idVacinacao=" + idVacinacao + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
