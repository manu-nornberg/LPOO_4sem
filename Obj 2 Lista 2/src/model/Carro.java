package model;

public class Carro extends Veiculo implements Automovel {

    private int capacidadePortaMalas;
    private String renavam;
    private String chassi;
    private String placa;


    public Carro(int numeroDeEixos, int anoFabricacao, String propulsao, String marca, String modelo, int capacidadePortaMalas, String renavam, String chassi, String placa) {
        super(numeroDeEixos, anoFabricacao, propulsao, marca, modelo);
        this.capacidadePortaMalas = capacidadePortaMalas;
        this.renavam = renavam;
        this.chassi = chassi;
        this.placa = placa;
    }

    public Carro(){

    }

    public int getCapacidadePortaMalas() {
        return capacidadePortaMalas;
    }

    public void setCapacidadePortaMalas(int capacidadePortaMalas) {
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    @Override
    public String getRedavam() {
        return renavam;
    }

    @Override
    public void setRenavam(String renavam) {
        this.renavam = renavam;

    }

    @Override
    public String getChassi() {
        return chassi;
    }

    @Override
    public void setChassi(String chassi) {
        this.chassi = chassi;

    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;

    }

    @Override
    public String toString() {
        return "\nCarro " + super.toString() +
                ", capacidadePortaMalas=" + getCapacidadePortaMalas() +
                ", placa=" + placa +
                ", chassi=" + chassi +
                ", renan=" + renavam +
                '}';
    }
}
