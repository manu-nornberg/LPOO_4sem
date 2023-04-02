package model;

public class Desenvolvedor extends Funcionario {
    //construtores
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    public Desenvolvedor() {
    }

    //tostring
    @Override
    public String toString() {
        return "\nDesenvolvedor= " + super.toString() + "}";
    }
}
