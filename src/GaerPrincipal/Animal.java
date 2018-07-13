package GaerPrincipal;

public class Animal {

    private int nrBrinco;
    private String dataNascimento;
    private String fazendaOrigem;
    private String obsAnimal;
    private String sexo;
    private String raca;

    public Animal(int nrBrinco, String fazendaOrigem, String dataNascimento,String obsAnimal , String sexo, String raca) {
        this.nrBrinco = nrBrinco;
        this.fazendaOrigem = fazendaOrigem;
        this.dataNascimento = dataNascimento;
        this.obsAnimal = obsAnimal;
        this.sexo = sexo;
        this.raca = raca;
    }

    public int getNrBrinco() {
        return nrBrinco;
    }

    public void setNrBrinco(int nrBrinco) {
        this.nrBrinco = nrBrinco;
    }

    public String getFazendaOrigem() {
        return fazendaOrigem;
    }

    public void setFazendaOrigem(String fazendaOrigem) {
        this.fazendaOrigem = fazendaOrigem;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getObsAnimal() {
        return obsAnimal;
    }

    public void setObsAnimal(String obsAnimal) {
        this.obsAnimal = obsAnimal;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}