package Model;

public class Automovel {
    private String renavan;
    private String placa;
    private String cor;
    private Integer num_rodas;
    private String combustivel;
    private Integer km;
    private String chassi;
    private Double valor_locacao;

    public Automovel() {
    }

    public Automovel(String renavan, String placa, String cor, Integer num_rodas, String combustivel, Integer km, String chassi, Double valor_locacao) {
        this.renavan = renavan;
        this.placa = placa;
        this.cor = cor;
        this.num_rodas = num_rodas;
        this.combustivel = combustivel;
        this.km = km;
        this.chassi = chassi;
        this.valor_locacao = valor_locacao;
    }

    public String getRenavan() {
        return renavan;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getNum_rodas() {
        return num_rodas;
    }

    public void setNum_rodas(Integer num_rodas) {
        this.num_rodas = num_rodas;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Double getValor_locacao() {
        return valor_locacao;
    }

    public void setValor_locacao(Double valor_locacao) {
        this.valor_locacao = valor_locacao;
    }

    @Override
    public String toString() {
        return "\nAutomovel{" +
                "renavan='" + renavan + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", num_rodas=" + num_rodas +
                ", combustivel='" + combustivel + '\'' +
                ", km=" + km +
                ", chassi='" + chassi + '\'' +
                ", valor_locacao=" + valor_locacao +
                '}';
    }
}
