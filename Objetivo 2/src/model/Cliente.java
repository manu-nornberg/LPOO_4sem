package model;

public class Cliente implements Associado{
    private String nome;
    protected int qdeCotas;
    protected double valorCota;

    //construtor
    public Cliente(String nome, int qdeCotas, double valorCota) {
        this.nome = nome;
        this.qdeCotas = qdeCotas;
        this.valorCota = valorCota;
    }

    //get and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //metodo da interface
    @Override
    public double lucros(int qdeCotas, double valorCota) {
        return this.qdeCotas * this.valorCota;
    }

    @Override
    public int getQdeCotas() {
        return qdeCotas;
    }

    @Override
    public void setQdeCotas(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }

    @Override
    public double getValorCota() {
        return valorCota;
    }

    @Override
    public void setValorCota(double valorCota) {
        this.valorCota = valorCota;
    }

    //tostring
    @Override
    public String toString() {
        return "\nCliente: " +
                "Nome='" + nome + '\'' +
                " Cotas=" + qdeCotas +
                " Valor das Cota=" + valorCota +
                ' ';
    }
}
