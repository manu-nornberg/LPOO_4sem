package model;

import javax.sound.midi.Soundbank;

public class Conta {
    private Integer id;
    private Double saldo;

    //construtor padrao
    public Conta() {
    }

    //construtor parametizado
    public Conta(Integer id, Double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    //Getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSaldo() {
        return saldo;
    }

    //public void setSaldo(Double saldo) {
      //  this.saldo = saldo;
    //}

    //deposita é o set saldo
    public void deposita(double saldo){
        this.saldo = saldo;
    }

    //pega o valor e diminui do saldo, se o valor da conta ficar menos de zero ele n faz o saque
    public void saca(double valor){
        double valorConta = this.saldo - valor;
        if(valorConta < 0){
            System.out.println("\nSem dinheiro para saque");
            return;
        }
        this.saldo -= valor;
        System.out.println("\nSaque efetuado. Saldo: " + this.saldo);
    }

    //atualiza a taxa do banco
    public void atualiza(double taxa){
        this.saldo += this.saldo * (taxa/100);
        System.out.println("\nSaldo atualizado. Saldo: " + this.saldo);
    }

    //toString
    @Override
    public String toString() {
        return "\nConta{" +
                "id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}
