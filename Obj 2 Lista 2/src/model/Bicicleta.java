package model;

public class Bicicleta extends Veiculo {

    private int tamanhoRoda;
    private String chassi;

    public int getTamanhoRoda() {
        return tamanhoRoda;
    }

    public void setTamanhoRoda(int tamanhoRoda) {
        this.tamanhoRoda = tamanhoRoda;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Bicicleta(int numeroDeEixos, int anoFabricacao, String propulsao, String marca, String modelo, int tamanhoRoda, String chassi) {
        super(numeroDeEixos, anoFabricacao, propulsao, marca, modelo);
        this.tamanhoRoda = tamanhoRoda;
        this.chassi = chassi;
    }

    public Bicicleta() {
    }

    @Override
    public String toString() {
        return "\nBicicleta " + super.toString() +
                ", tamanhoRoda=" + tamanhoRoda +
                ", chassi='" + chassi + '\'' +
                '}';
    }
}
