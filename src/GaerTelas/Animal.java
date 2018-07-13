//
//* To change this license header, choose License Headers in Project Properties.
//* To change this template file, choose Tools | Templates
//* and open the template in the editor.
//
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
@Table(name = "Animal", catalog = "vacina_animal", schema = "")
@NamedQueries({
    @NamedQuery(name = "Animal.findAll", query = "SELECT a FROM Animal a")
    , @NamedQuery(name = "Animal.findByIdAnimal", query = "SELECT a FROM Animal a WHERE a.idAnimal = :idAnimal")
    , @NamedQuery(name = "Animal.findByNrBrinco", query = "SELECT a FROM Animal a WHERE a.nrBrinco = :nrBrinco")
    , @NamedQuery(name = "Animal.findByFzndOrigem", query = "SELECT a FROM Animal a WHERE a.fzndOrigem = :fzndOrigem")
    , @NamedQuery(name = "Animal.findByDtNascimento", query = "SELECT a FROM Animal a WHERE a.dtNascimento = :dtNascimento")
    , @NamedQuery(name = "Animal.findByObsAnimal", query = "SELECT a FROM Animal a WHERE a.obsAnimal = :obsAnimal")
    , @NamedQuery(name = "Animal.findBySexo", query = "SELECT a FROM Animal a WHERE a.sexo = :sexo")
    , @NamedQuery(name = "Animal.findByRaca", query = "SELECT a FROM Animal a WHERE a.raca = :raca")})
public class Animal implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ANIMAL")
    private Integer idAnimal;
    @Basic(optional = false)
    @Column(name = "NR_BRINCO")
    private int nrBrinco;
    @Column(name = "FZND_ORIGEM")
    private String fzndOrigem;
    @Column(name = "DT_NASCIMENTO")
    private String dtNascimento;
    @Column(name = "OBS_ANIMAL")
    private String obsAnimal;
    @Column(name = "SEXO")
    private String sexo;
    @Column(name = "RACA")
    private String raca;

    public Animal() {
    }

    public Animal(Integer idAnimal) {
        this.idAnimal = idAnimal;
    }

    public Animal(Integer idAnimal, int nrBrinco) {
        this.idAnimal = idAnimal;
        this.nrBrinco = nrBrinco;
    }

    public Integer getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Integer idAnimal) {
        Integer oldIdAnimal = this.idAnimal;
        this.idAnimal = idAnimal;
        changeSupport.firePropertyChange("idAnimal", oldIdAnimal, idAnimal);
    }

    public int getNrBrinco() {
        return nrBrinco;
    }

    public void setNrBrinco(int nrBrinco) {
        int oldNrBrinco = this.nrBrinco;
        this.nrBrinco = nrBrinco;
        changeSupport.firePropertyChange("nrBrinco", oldNrBrinco, nrBrinco);
    }

    public String getFzndOrigem() {
        return fzndOrigem;
    }

    public void setFzndOrigem(String fzndOrigem) {
        String oldFzndOrigem = this.fzndOrigem;
        this.fzndOrigem = fzndOrigem;
        changeSupport.firePropertyChange("fzndOrigem", oldFzndOrigem, fzndOrigem);
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        String oldDtNascimento = this.dtNascimento;
        this.dtNascimento = dtNascimento;
        changeSupport.firePropertyChange("dtNascimento", oldDtNascimento, dtNascimento);
    }

    public String getObsAnimal() {
        return obsAnimal;
    }

    public void setObsAnimal(String obsAnimal) {
        String oldObsAnimal = this.obsAnimal;
        this.obsAnimal = obsAnimal;
        changeSupport.firePropertyChange("obsAnimal", oldObsAnimal, obsAnimal);
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        String oldSexo = this.sexo;
        this.sexo = sexo;
        changeSupport.firePropertyChange("sexo", oldSexo, sexo);
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        String oldRaca = this.raca;
        this.raca = raca;
        changeSupport.firePropertyChange("raca", oldRaca, raca);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAnimal != null ? idAnimal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Animal)) {
            return false;
        }
        Animal other = (Animal) object;
        if ((this.idAnimal == null && other.idAnimal != null) || (this.idAnimal != null && !this.idAnimal.equals(other.idAnimal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GaerTelas.Animal[ idAnimal=" + idAnimal + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
