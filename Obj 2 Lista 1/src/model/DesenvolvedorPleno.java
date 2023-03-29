package model;

import java.text.NumberFormat;

public class DesenvolvedorPleno extends Desenvolvedor{

    public DesenvolvedorPleno() {
    }

    public DesenvolvedorPleno(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedorPleno{" +
                "nome='" + getNome() + '\'' +
                ", salario=" + getSalario() + ", bonus=" + NumberFormat.getNumberInstance().format(getBonus()) +
                '}';
    }
}
