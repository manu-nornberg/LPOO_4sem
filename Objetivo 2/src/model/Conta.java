package model;

public abstract class Conta {
    protected double saldo;

    //construtores
    public Conta(double saldo) {

        this.saldo = saldo;
    }

    public Conta() {
    }

    //get and set
    public double getSaldo() {

        return saldo;
    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }

    //metodos deposita, saca e atualiza
    public void deposita (double valor){
        this.saldo += valor;
        System.out.println("Valor depositado!");
    }

    public void saca (double valor){
            if(valor > this.saldo){
                System.out.println("Você não tem saldo suficiente para essa operação");
            }else {
                this.saldo -= valor;
                System.out.println("Saque efetuado!");
            }

    }

    public void atualiza (double taxa){
        System.out.println("Valor de taxa acressentado " + (taxa/100));
        this.saldo = saldo * (1+(taxa/100));
    }

    //tostring
    @Override
    public String toString() {
        return "Saldo=" + saldo;
    }
}

