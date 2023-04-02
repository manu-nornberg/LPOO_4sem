package model;

public abstract class Funcionario {
    private String nome;
    private double salario;

    //contrutores
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario() {
    }

    //get and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonus(){
        return getSalario();
    }

    //tostring
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario;
    }
}
