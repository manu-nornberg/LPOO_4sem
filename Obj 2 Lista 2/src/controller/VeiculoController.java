package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VeiculoController {
    public static void main(String[] args) {
        //EXERCICIO 1
        //Instanciando objetos
        Veiculo bike1 = new Bicicleta(25,2005,"nsei","nseitbm","mds",24,"aaa");
        System.out.println(bike1);
        Veiculo bike2 = new Bicicleta(62,2012,"uhu","uhu","aaa",36,"aaaa0");
        System.out.println(bike2);
        Veiculo bike3 = new Bicicleta(20,3,"oko","ok","oko",30,"oko");
        System.out.println(bike3);
        Veiculo bike4 = new Bicicleta(9,6,"bbb","bbb","nnn",30,"lll");
        System.out.println(bike4);
        Veiculo bike5 = new Bicicleta(1,30,"as","as","as",6,"eeee");
        System.out.println(bike5);

        Veiculo carro1 = new Carro(8,2015,"aaa","aaa","aaa",8,"aushaus", "asasas", "iiiiiaaaaa");
        System.out.println(carro1);
        Veiculo carro2 = new Carro(8,2016,"eee","eee","eee",60,"aaa","eee","aaa");
        System.out.println(carro2);
        Veiculo carro3 = new Carro(9,2015,"asas","asas","asas",60,"asas","asas","asas");
        System.out.println(carro3);
        Veiculo carro4 = new Carro(2,1,"pppp","pppp","ppp",3,"pppp","ppp","iiiippp");
        System.out.println(carro4);
        Veiculo carro5 = new Carro(7,8,"sss","sss","sss",5,"aaa","aaa","IIIasas");
        System.out.println(carro5);

        Veiculo caminhao1 = new Caminhao(8,2013,"fff","asas","qwqw","kaskas","aksjas","sdkjsdkjs",40);
        System.out.println(caminhao1);
        Veiculo caminhao2 = new Caminhao(4,6,"mmm","mmm","mmm","mmm","mmm","mm",5);
        System.out.println(caminhao2);
        Veiculo caminhao3 = new Caminhao(5,2006,"bbb","bbb","nbbb","aaa","uahsua","iiiahusa",6);
        System.out.println(caminhao3);
        Veiculo caminhao4 = new Caminhao(8,2009,"qqq","qqq","aushau","aaa","qqq","uuu",9);
        System.out.println(caminhao4);
        Veiculo caminhao5 = new Caminhao(9,2021,"ppp","ppp","ppp","ppp","ppp","iiippp",6);
        System.out.println(caminhao5);

        //EXERCICIO 2
        //listando os veiculos
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(bike1);
        veiculos.add(bike2);
        veiculos.add(bike3);
        veiculos.add(bike4);
        veiculos.add(bike5);
        veiculos.add(carro1);
        veiculos.add(carro2);
        veiculos.add(carro3);
        veiculos.add(carro4);
        veiculos.add(carro5);
        veiculos.add(caminhao1);
        veiculos.add(caminhao2);
        veiculos.add(caminhao3);
        veiculos.add(caminhao4);
        veiculos.add(caminhao5);
        System.out.println("\nListando");
        System.out.println(veiculos);

        //imprimindo a ordenacao pelo ano de fabricacao pela super classe
        veiculos.sort(Comparator.comparing(Veiculo::getAnoFabricacao));
        System.out.println("\nOrdenando");
        System.out.println(veiculos);

        //imprimindo a ordenacao pelo ano de fabricacao pela interface
        System.out.println("\nOrdenando");
        veiculos.forEach(veiculo -> {
            if (veiculo instanceof Automovel){
                System.out.println(veiculo);
            }
        });

        //imprimindo a ordenacao pelo ano de fabricacao pelas bicicletas
        System.out.println("\nOrdenando");
        veiculos.forEach(veiculo -> {
            if (veiculo instanceof Bicicleta){
                System.out.println(veiculo);
            }
        });

        //imprimindo a ordenacao pelo ano de fabricacao e placas com I, i
        System.out.println("\nOrdenando");
        veiculos.forEach(veiculo -> {
            if (veiculo instanceof Automovel) {
                if ( ((Automovel)veiculo).getPlaca().startsWith("i") || ((Automovel)veiculo).getPlaca().startsWith("I")){
                    System.out.println(veiculo);
                }
            }
        });

    }
}
