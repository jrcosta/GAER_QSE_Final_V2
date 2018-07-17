package GaerPrincipal;

public class Vacina {

    private String descricaoVacina;
    private int qtdAtual;
    private int qtdMinima;
    private String obsVacina;
    private String dtValidadeVacina;
    private String lote;
    private int custo;
    private String fabricante;

    public Vacina(String descricaoVacina, int qtdAtual, int qtdMinima, String obsVacina, String dtValidadeVacina, String lote, int custo, String fabricante) {
        this.descricaoVacina = descricaoVacina;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
        this.obsVacina = obsVacina;
        this.dtValidadeVacina = dtValidadeVacina;
        this.lote = lote;
        this.custo = custo;
        this.fabricante = fabricante;
    }

    public String getDescricaoVacina() {
        return descricaoVacina;
    }

    public void setDescricaoVacina(String descricaoVacina) {
        this.descricaoVacina = descricaoVacina;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public String getObsVacina() {
        return obsVacina;
    }

    public void setObsVacina(String obsVacina) {
        this.obsVacina = obsVacina;
    }

    public String getDtValidadeVacina() {
        return dtValidadeVacina;
    }

    public void setDtValidadeVacina(String dtValidadeVacina) {
        this.dtValidadeVacina = dtValidadeVacina;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    

}
