package model;

public class Caminhao extends Veiculo implements Automovel {

    private String redavam;
    private String chassi;
    private String placa;
    private int capacidadeCarga;

    public Caminhao(int numeroDeEixos, int anoFabricacao, String propulsao, String marca, String modelo, String redavam, String chassi, String placa, int capacidadeCarga) {
        super(numeroDeEixos, anoFabricacao, propulsao, marca, modelo);
        this.redavam = redavam;
        this.chassi = chassi;
        this.placa = placa;
        this.capacidadeCarga = capacidadeCarga;
    }

    public Caminhao(){
    }

    @Override
    public String getRedavam() {
        return redavam;
    }

    @Override
    public void setRenavam(String renavam) {
        this.redavam = renavam;
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
        return "\nCaminhao " + super.toString() +
                "redavam='" + redavam + '\'' +
                ", chassi='" + chassi + '\'' +
                ", placa='" + placa + '\'' +
                ", capacidadeCarga=" + capacidadeCarga +
                '}';
    }
}
