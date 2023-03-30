package model;

public abstract class Veiculo {

    private int numeroDeEixos, anoFabricacao;
    private String propulsao, marca, modelo;

    public Veiculo(int numeroDeEixos, int anoFabricacao, String propulsao, String marca, String modelo) {
        this.numeroDeEixos = numeroDeEixos;
        this.anoFabricacao = anoFabricacao;
        this.propulsao = propulsao;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Veiculo() {
    }

    public int getNumeroDeEixos() {
        return numeroDeEixos;
    }

    public void setNumeroDeEixos(int numeroDeEixos) {
        this.numeroDeEixos = numeroDeEixos;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getPropulsao() {
        return propulsao;
    }

    public void setPropulsao(String propulsao) {
        this.propulsao = propulsao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "{" +
                "numeroDeEixos=" + numeroDeEixos +
                ", anoFabricacao=" + anoFabricacao +
                ", propulsao='" + propulsao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'';
    }
}
