package model;

import java.text.NumberFormat;

public class GerenteDesenvolvedor extends Gerente {

    public GerenteDesenvolvedor(String nome, Double salario) {
        super(nome, salario);
    }

    public GerenteDesenvolvedor() {
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.20;
    }

    @Override
    public String toString() {
        return "\nGerenteDesenvolvedor{" +
                "nome='" + getNome() + '\'' +
                ", salario=" + getSalario() + ", bonus=" + NumberFormat.getNumberInstance().format(getBonus()) +
                '}';
    }

}
