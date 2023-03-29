package model;

import java.text.NumberFormat;

public class DesenvolvedorSenior extends Desenvolvedor {

    public DesenvolvedorSenior() {
    }

    public DesenvolvedorSenior(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.10;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedorSenior{" +
                "nome='" + getNome() + '\'' +
                ", salario=" + getSalario() + ", bonus=" + NumberFormat.getNumberInstance().format(getBonus()) +
                '}';
    }
}