
package model;

import java.text.NumberFormat;

public class DesenvolvedorJunior extends Desenvolvedor{

    public DesenvolvedorJunior() {
    }

    public DesenvolvedorJunior(String nome, Double salario) {
        super(nome, salario);
    }


    @Override
    public double getBonus() {
        return getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedorJunior{" +
                "nome='" + getNome() + '\'' +
                ", salario=" + getSalario() + ", bonus=" + NumberFormat.getNumberInstance().format(getBonus()) +
                '}';
    }

}
