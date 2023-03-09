package model;

public class Carro {
    private String marca;
    private String modelo;
    private Integer ano;

    public Carro(String marca, String modelo, Integer ano) { //constructor parametrizado
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro() { //constructor padrao
    }

    //Getters and Setters
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

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "\nCarro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
