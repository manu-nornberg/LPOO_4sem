package controller;

import model.Carro;

import java.util.*;

public class CarroController {
    public static void main(String[] args) {
        Carro carro1 = new Carro(); //constructor padrao
        System.out.println("Construtor padrao");
        System.out.println(carro1.getMarca());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getAno());

        Carro carro2 = new Carro("Ford", "Fusion", 2007); //constructor parametrizado
        System.out.println("\nConstrutor parametrizado");
        System.out.println(carro2.getMarca());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getAno());

        Carro carro3 = new Carro("Fiat", "unno", 2010); //constructor parametrizado
        System.out.println("\nConstrutor parametrizado");
        System.out.println(carro3.getMarca());
        System.out.println(carro3.getModelo());
        System.out.println(carro3.getAno());

        //alterando algum dado
        carro3.setModelo("Uno");
        System.out.println("\nAlterando algum dado: carro3");
        System.out.println(carro3.getModelo());

        //alterando algum dado
        carro1.setMarca("aaaaa");
        carro1.setModelo("AAAAAA");
        carro1.setAno(2000);
        System.out.println("\nAlterando algum dado: carro1");
        System.out.println(carro1);

        //adicionando mais carros
        Carro carro4 = new Carro("Eu não", "entendo de carros", 1999);
        Carro carro5 = new Carro("Imagina um", "carro legal aq",1960);
        System.out.println("\nAdicionando mais carros");
        System.out.println(carro4);
        System.out.println(carro5);

        //lista
        List<Carro> totalCarros = new ArrayList<>();
        totalCarros.add(carro1);
        totalCarros.add(carro2);
        totalCarros.add(carro3);
        totalCarros.add(carro4);
        totalCarros.add(carro5);
        System.out.println("\nImprimindo lista de carros");
        System.out.println(totalCarros);

        //ordenando pelo ano
        totalCarros.sort(Comparator.comparing(Carro::getAno));
        System.out.println("\nImprimindo carros pelo ano");
        System.out.println(totalCarros);

        //pesquisando
        totalCarros.forEach(carro -> {
            if(carro.getMarca().equals("Fiat")){
                System.out.println("\nImprimindo o resultado");
                System.out.println(carro);
            }
        });

        //pesquisando com o filter
        Carro carroAchou = totalCarros.stream().filter(carro -> carro.getMarca().equals("Brasilia")).findAny().orElse(null);
        System.out.println("\nImprimindo resultado com filter");
        System.out.println(carroAchou);

        //map
        Map<String, Carro> carroMap = new HashMap<>();
        carroMap.put(carro1.getMarca(), carro1);
        carroMap.put(carro2.getMarca(), carro2);
        carroMap.put(carro3.getMarca(), carro3);
        carroMap.put(carro4.getMarca(), carro4);
        carroMap.put(carro5.getMarca(), carro5);
        System.out.println("\nImprimindo map");
        System.out.println(carroMap);

        //pesquisando em map
        System.out.println("\nPesquisando em map");
        System.out.println(carroMap.get("Fiat"));


    }
}


