package model;

import java.text.NumberFormat;

public abstract class Desenvolvedor extends Funcionario{


    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome, Double salario) {
        super(nome, salario);
    }

    public abstract double getBonus();
}
