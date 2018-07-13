package GaerPrincipal;

public class VacinarAnimal {

    private int brincoAnimal;
    private int idVacina;
    private String dataVacinacao;
    private int dosesVacinacao;
    private String obsVacinacao;

    public VacinarAnimal(int brincoAnimal, int idVacina, String dataVacinacao, int dosesVacinacao, String obsVacinacao) {
        this.brincoAnimal = brincoAnimal;
        this.idVacina = idVacina;
        this.dataVacinacao = dataVacinacao;
        this.dosesVacinacao = dosesVacinacao;
        this.obsVacinacao = obsVacinacao;
    }

    public int getBrincoAnimal() {
        return brincoAnimal;
    }

    public void setBrincoAnimal(int brincoAnimal) {
        this.brincoAnimal = brincoAnimal;
    }

    public int getIdVacina() {
        return idVacina;
    }

    public void setIdVacina(int idVacina) {
        this.idVacina = idVacina;
    }

    public String getDataVacinacao() {
        return dataVacinacao;
    }

    public void setDataVacinacao(String dataVacinacao) {
        this.dataVacinacao = dataVacinacao;
    }

    public int getDosesVacinacao() {
        return dosesVacinacao;
    }

    public void setDosesVacinacao(int dosesVacinacao) {
        this.dosesVacinacao = dosesVacinacao;
    }

    public String getObsVacinacao() {
        return obsVacinacao;
    }

    public void setObsVacinacao(String obsVacinacao) {
        this.obsVacinacao = obsVacinacao;
    }

}
