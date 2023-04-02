package controller;

import model.*;

import java.util.*;

public class FuncionarioController {
    public static void main(String[] args) {
        //criando as instancias
        Funcionario dev1 = new Desenvolvedor("Beatriz",1500.00);
        Funcionario dev2 = new Desenvolvedor("Luiz", 1500.00);
        Funcionario dev3 = new Desenvolvedor("Sonia", 1500.00);
        Funcionario dev4 = new Desenvolvedor("Amanda", 1500.00);
        Funcionario dev5 = new Desenvolvedor("Argel", 1500.00);
        Funcionario dev6 = new Desenvolvedor("Claudio", 1500.00);

        Funcionario ger1 = new Gerente("Maria", 3000.00,"456456",40);
        Funcionario ger2 = new Gerente("Mario", 3000.00, "9876540", 20);
        Funcionario ger3 = new Gerente("Sergio", 3000.00, "55555", 80);
        Funcionario ger4 = new Gerente("Daniel", 3000.00, "00000", 60);
        Funcionario ger5 = new Gerente("Linda", 3000.00, "66666", 90);
        Funcionario ger6 = new Gerente("Zé", 3100.00, "88888", 55);

        Investidor cli1 = new Cliente("Chris","Pereira", "456789", 45);
        Investidor cli2 = new Cliente("Gustavo", "Silva", "123123", 88);
        Investidor cli3 = new Cliente("Geremias", "Silveira", "77777", 50);
        Investidor cli4 = new Cliente("Maju", "Trindade", "99999", 22);
        Investidor cli5 = new Cliente("Gabi", "Souza", "654555", 10);
        Investidor cli6 = new Cliente("Vagner", "Pinto", "478478", 26);

        //imprimindo as instancias
        System.out.println("\nImprimindo as instancias");
        System.out.println(dev1);
        System.out.println(dev2);
        System.out.println(dev3);
        System.out.println(dev4);
        System.out.println(dev5);
        System.out.println(dev6);

        System.out.println(ger1);
        System.out.println(ger2);
        System.out.println(ger3);
        System.out.println(ger4);
        System.out.println(ger5);
        System.out.println(ger6);

        System.out.println(cli1);
        System.out.println(cli2);
        System.out.println(cli3);
        System.out.println(cli4);
        System.out.println(cli5);
        System.out.println(cli6);

        //Listar os funcionarios
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(dev1);
        funcionarios.add(dev2);
        funcionarios.add(dev3);
        funcionarios.add(dev4);
        funcionarios.add(dev5);
        funcionarios.add(dev6);
        funcionarios.add(ger1);
        funcionarios.add(ger2);
        funcionarios.add(ger3);
        funcionarios.add(ger4);
        funcionarios.add(ger5);
        funcionarios.add(ger6);
        System.out.println("\nImprimindo a lista de funcionarios");
        System.out.println(funcionarios);

        List<Investidor> investidores = new ArrayList<>();
        investidores.add((Investidor) ger1);
        investidores.add((Investidor) ger2);
        investidores.add((Investidor) ger3);
        investidores.add((Investidor) ger4);
        investidores.add((Investidor) ger5);
        investidores.add((Investidor) ger6);
        investidores.add(cli1);
        investidores.add(cli2);
        investidores.add(cli3);
        investidores.add(cli4);
        investidores.add(cli5);
        investidores.add(cli6);
        System.out.println("\nImprimindo a lista de investidores");
        System.out.println(investidores);

        //imprimindo as organizaçoes
        funcionarios.sort(Comparator.comparing(Funcionario::getSalario).reversed());
        System.out.println("\nFuncionarios ordenados pelo salario: " + funcionarios);

        System.out.println("\nInvestidores ordenados pelo ticker: ");
        investidores.sort(Comparator.comparing(Investidor::getQuantidade).reversed());
            investidores.forEach(i -> {
                    if(i instanceof Cliente || i instanceof Gerente){
                        System.out.println(i);
                    }});

        System.out.println("\nMaior salário: ");
        Funcionario maiorSalario = Collections.max(funcionarios, Comparator.comparing(Funcionario::getSalario));
        funcionarios.forEach(f -> {
            if(f.getSalario() >= maiorSalario.getSalario()){
                System.out.println(f);
            }
        });

        System.out.println("\nMaior quantidade: ");
        Investidor maiorQnt = Collections.max(investidores, Comparator.comparing(Investidor::getQuantidade));
        investidores.forEach(i -> {
            if(i.getQuantidade() >= maiorQnt.getQuantidade()){
                System.out.println(i);
            }
        });

    }
}
