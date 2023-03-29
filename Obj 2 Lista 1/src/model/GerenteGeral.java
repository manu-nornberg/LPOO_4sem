package model;

import java.text.NumberFormat;

public class GerenteGeral extends Gerente{

    public GerenteGeral(String nome, Double salario) {
        super(nome, salario);
    }

    public GerenteGeral() {
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.40;
    }

    @Override
    public String toString() {
        return "\nGerenteGeral{" +
                "nome='" + getNome() + '\'' +
                ", salario=" + getSalario() + ", bonus=" + NumberFormat.getNumberInstance().format(getBonus()) +
                '}';
    }


}