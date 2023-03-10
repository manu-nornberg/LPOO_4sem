package Controller;

import Model.Cliente;

import java.util.*;


public class ClienteController {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente();
        System.out.println(cli1);
        Cliente cli2 = new Cliente("9999", "aaa", "aaaa", "888", "877", "8787");
        System.out.println(cli2);

        Cliente cli3 = new Cliente("111", "aaa", "aaa", "999", "999", "aaa");
        System.out.println(cli3);
        Cliente cli4 = new Cliente("111", "aaa", "qqq", "000", "999", "qqq");
        System.out.println(cli4);
        Cliente cli5 = new Cliente("888", "jjj", "ooo", "5555", "444", "666");
        System.out.println(cli5);

        cli1.setCpf("555");
        System.out.println(cli1.getCpf());

        List<Cliente> totalCli = new ArrayList<>();
        totalCli.add(cli1);
        totalCli.add(cli2);
        totalCli.add(cli3);
        totalCli.add(cli4);
        totalCli.add(cli5);
        System.out.println(totalCli);

        totalCli.sort(Comparator.comparing(Cliente::getCpf));
        System.out.println(totalCli);

        Cliente cliAchou = totalCli.stream()
                .filter(cliente -> cliente.getCpf()
                        .equals("111")).findAny().orElse(null);
        System.out.println(cliAchou);

        Map<String, Cliente> climap = new HashMap<>();
        climap.put(cli1.getCpf(), cli1);
        climap.put(cli2.getCpf(), cli2);
        climap.put(cli3.getCpf(), cli3);
        climap.put(cli4.getCpf(), cli4);
        climap.put(cli5.getCpf(), cli5);
        System.out.println(climap);

        System.out.println(climap.get("111"));
    }
}
