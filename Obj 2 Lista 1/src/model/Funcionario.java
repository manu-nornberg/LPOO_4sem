package model;

public abstract class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario() {
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public Double getSalario() {

        return salario;
    }

    public void setSalario(Double salario) {

        this.salario = salario;
    }

    public abstract double getBonus();

}
