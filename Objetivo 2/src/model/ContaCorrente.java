package model;

public class ContaCorrente extends Conta implements Associado{
    protected int qdeCotas;
    protected double valorCota;

    //construtor
    public ContaCorrente(double saldo, int qdeCotas, double valorCota) {
        super(saldo);
        this.qdeCotas = qdeCotas;
        this.valorCota = valorCota;
    }

    public ContaCorrente() {
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
        return "\nConta Corrente: " + super.toString() + " Cotas: " + qdeCotas + " Valor das cotas: " + valorCota;
    }


}
