package Controller;

import Model.Cliente;
import Model.Marca;

import java.util.*;

public class MarcaController {
    public static void main(String[] args) {
        Marca m1 = new Marca();
        Marca m2 = new Marca("aaa");
        Marca m3 = new Marca("kkk");
        Marca m4 = new Marca("lll");
        Marca m5 = new Marca("iiii");

        m1.setDescricao("kkkk");
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);

        List<Marca> totalDes = new ArrayList<>();
        totalDes.add(m1);
        totalDes.add(m2);
        totalDes.add(m3);
        totalDes.add(m4);
        totalDes.add(m5);
        System.out.println(totalDes);

        totalDes.sort(Comparator.comparing(Marca::getDescricao).reversed());
        System.out.println(totalDes);

        Marca marcaAchou = totalDes.stream()
                .filter(marca -> marca.getDescricao()
                        .equals("aaa")).findAny().orElse(null);
        System.out.println(marcaAchou);

        Map<String, Marca> marcamap = new HashMap<>();
        marcamap.put(m1.getDescricao(), m1);
        marcamap.put(m2.getDescricao(), m2);
        marcamap.put(m3.getDescricao(), m3);
        marcamap.put(m4.getDescricao(), m4);
        marcamap.put(m5.getDescricao(), m5);
        System.out.println(marcamap);

        System.out.println(marcamap.get("aaaa"));

    }
}
