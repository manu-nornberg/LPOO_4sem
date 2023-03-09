package controller;

import model.Conta;

import java.util.*;

public class ContaController {
    public static void main(String[] args) {
        Conta conta1 = new Conta(); //construtor padrao
        Conta conta2 = new Conta(2, 5000.00); //construtor parametizado
        System.out.println("Conta 1 e conta 2");
        System.out.println(conta1);
        System.out.println(conta2);

        System.out.println("\nAlterando conta 1");
        conta1.setId(1);
        conta1.deposita(7000.00);
        System.out.println(conta1);

        //movimentos nas contas
        System.out.println("\nMovimentação de conta:");
        conta1.deposita(1000.00);
        System.out.println("\nDepositou 1000 na conta 1");
        System.out.println(conta1);
        conta2.saca(500.00);
        System.out.println("\nSacou 500 na conta 2");
        System.out.println(conta2);
        conta2.atualiza(80);
        System.out.println("\nAtualizou taxa conta 2");
        System.out.println(conta2);
        conta1.saca(10.000);
        System.out.println("\nDepositou 10000 na conta 1");
        System.out.println(conta1);
        conta1.saca(100.00);
        System.out.println("\nSacou 100 na conta 1");
        System.out.println(conta1);
        conta2.deposita(6000.00);
        System.out.println(conta2);
        System.out.println("\nDepositou 6000 na conta 2");

        //mais contas
        Conta conta3 = new Conta(3, 8000.00);
        Conta conta4 = new Conta(4,10.000);
        Conta conta5 = new Conta(5, 5.00);
        System.out.println(conta3);
        System.out.println(conta4);
        System.out.println(conta5);

        //lista
        List<Conta> totalContas = new ArrayList<>();
        totalContas.add(conta1);
        totalContas.add(conta2);
        totalContas.add(conta3);
        totalContas.add(conta4);
        totalContas.add(conta5);
        System.out.println("\nImprimindo lista de contas");
        System.out.println(totalContas);

        //ordenando lista
        totalContas.sort(Comparator.comparing(Conta::getId).reversed());
        System.out.println("\nImprimindo ordem:");
        System.out.println(totalContas);

        //pesquisando id conta
        totalContas.forEach(conta -> {
            if(conta.getId().equals(3)){
                System.out.println("\nImprimindo pesquisa");
                System.out.println(conta);
            }
        });

        //pesquisando id conta filter
        Conta contaAchou = totalContas.stream().filter(conta -> conta.getId().equals(3)).findAny().orElse(null);
        System.out.println("\nImprimindo pesquisa com filter");
        System.out.println(contaAchou);

        //map
        Map<Integer, Conta> contaMap = new HashMap<>();
        contaMap.put(conta1.getId(), conta1);
        contaMap.put(conta2.getId(), conta2);
        contaMap.put(conta3.getId(), conta3);
        contaMap.put(conta4.getId(), conta4);
        contaMap.put(conta5.getId(), conta5);
        System.out.println("\nImprimindo o map");
        System.out.println(contaMap);

        //pesquisando pelo map
        System.out.println("Pesquisando pelo map");
        System.out.println(contaMap.get(3));

    }
}
