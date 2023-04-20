package controller;

import model.Empresa;
import model.Funcionario;

import java.time.LocalDate;
import java.util.Comparator;

public class EmpresaController {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(1L, "Argel", "Heberle", "12345678", LocalDate.of(1995, 2, 21));
        Funcionario f2 = new Funcionario(2L, "Manu", "Nornberg", "56565665", LocalDate.of(1999, 12, 17));
        Funcionario f3 = new Funcionario(3L, "Johann", "Waltzer", "9899446", LocalDate.of(1993, 8, 14));
        Funcionario f4 = new Funcionario(4L, "Esther", "Souza", "23546312", LocalDate.of(2000, 8, 16));
        Funcionario f5 = new Funcionario(5L, "Vagner", "Pinto", "648713215", LocalDate.of(1980, 6, 3));
        Funcionario f6 = new Funcionario(6L, "Amanda", "Amaral", "11543515", LocalDate.of(2003, 4, 30));

        Empresa e1 = new Empresa("123456", "bebidas", "Bebidinhas");
        Empresa e2 = new Empresa("283473", "comida", "comidinhas");

        System.out.println("\nAdicionando funcionarios nas empresas: ");
        e1.getFuncionarios().add(f1);
        e1.getFuncionarios().add(f2);
        e1.getFuncionarios().add(f3);
        System.out.println(e1);

        e2.getFuncionarios().add(f4);
        e2.getFuncionarios().add(f5);
        e2.getFuncionarios().add(f6);
        System.out.println(e2);

        System.out.println("\nOrdenando os funcionarios por empresa por nome: ");
        e1.getFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
        e2.getFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
        System.out.println(e1);
        System.out.println(e2);

        System.out.println("\nOrdenando os funcionarios por empresa por idade: ");
        e1.getFuncionarios().sort(Comparator.comparing(Funcionario::getDataNasc).reversed());
        e2.getFuncionarios().sort(Comparator.comparing(Funcionario::getDataNasc).reversed());
        System.out.println(e1);
        System.out.println(e2);

    }
}
