package model;

import java.text.NumberFormat;

public abstract class Gerente extends Funcionario {
    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }

    public Gerente() {
    }

    public abstract double getBonus();

}
