package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ContaController {
    public static void main(String[] args) {

        //criando instancias
        System.out.println("\nCriando as instancias");
        Conta cc1 = new ContaCorrente(2000,2,4);
        Conta cc2 = new ContaCorrente(5200,3,4);
        Conta cc3 = new ContaCorrente(3000,1,4);

        Conta cp1 = new ContaPoupanca(4000);
        Conta cp2 = new ContaPoupanca(3000);
        Conta cp3 = new ContaPoupanca(1000);

        Associado cli1 = new Cliente("Argel", 2, 3);
        Associado cli2 = new Cliente("Manu", 4, 3);
        Associado cli3 = new Cliente("Amanda", 3, 3);

        System.out.println("\nImprimindo as instancias");
        System.out.println("\nContas Poupanças: " + cp1 + "" + cp2 + "" + cp3);
        System.out.println("\nContas Correntes: " + cc1 + "" + cc2 + "" + cc3);
        System.out.println("\nAssociados clientes: " + cli1 + "" + cli2 + "" + cli3);

        //imprimindo as coleçoes
        List<Conta> contas = new ArrayList<>();
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);
        contas.add(cp1);
        contas.add(cp2);
        contas.add(cp3);
        System.out.println("\nImprimindo as contas" + contas);
        System.out.println("\n=========================");


        List<Associado> associados = new ArrayList<>();
        associados.add((Associado)cc1);
        associados.add((Associado)cc2);
        associados.add((Associado)cc3);
        associados.add(cli1);
        associados.add(cli2);
        associados.add(cli3);
        System.out.println("\nImprimindo as associados" + associados);
        System.out.println("\n=========================");

        System.out.println("\nMovimentando a conta poupança");
        cp1.deposita(1000);
        cp1.atualiza(5);
        cp1.saca(50);
        System.out.println(cp1);
        System.out.println("\n=========================");

        System.out.println("\nMovimentando a conta poupança");
        cp3.deposita(1000);
        cp3.saca(7000);
        System.out.println(cp3);
        System.out.println("\n=========================");

        System.out.println("\nMovimentando a conta corrente");
        cc1.deposita(500);
        cc1.saca(400);
        System.out.println(cc1);
        System.out.println("\n=========================");

        ((Associado) cc1).setQdeCotas(100);
        ((Associado) cc2).setQdeCotas(400);
        ((Associado) cc3).setQdeCotas(600);
        cli1.setQdeCotas(300);
        cli2.setQdeCotas(600);
        cli3.setQdeCotas(600);
        System.out.println("\nImprimindo a qnt de cotas atualizada" + associados);
        System.out.println("\n=========================");

        associados.sort(Comparator.comparing(Associado::getQdeCotas).reversed());
//        associados.forEach(a->{
//            if (a instanceof ContaCorrente || a instanceof Cliente)
//                System.out.println(a);
//        });
        System.out.println("\nImprimindo a qnt de cotas em ordem decrescente" + associados);
        System.out.println("\n=========================");


        System.out.println("\nImprimindo as pessoas q tem a maior cota");
        Associado maioresCotas = Collections.max(associados, Comparator.comparing(Associado::getQdeCotas));
        associados.forEach((a->{
            if(a.getQdeCotas()>=maioresCotas.getQdeCotas()){
                System.out.println(a);
            }
        }));
        System.out.println("\n=========================");

        contas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println("\nImprimindo todas as contas pela ordem decrescente de saldo" + contas);
        System.out.println("\n=========================");

        System.out.println("\nImprimindo todas as contas q tbm sao associadas");
        contas.forEach(c->{
            if(c instanceof Associado)
                System.out.println(c);
        });
        System.out.println("\n=========================");

        System.out.println("\nImprimindo as pessoas q tem o maior saldo");
        Conta maiorSaldo = Collections.max(contas, Comparator.comparing(Conta::getSaldo));
        contas.forEach(c->{
            if (c.getSaldo()>= maiorSaldo.getSaldo())
                System.out.println(c);
        });
        System.out.println("\n=========================");

    }
}
