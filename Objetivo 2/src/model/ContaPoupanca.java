package model;

public class ContaPoupanca extends Conta{

    //construtor
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    //tostring
    @Override
    public String toString() {
        return "\nConta Poupança: " + super.toString();
    }
}
