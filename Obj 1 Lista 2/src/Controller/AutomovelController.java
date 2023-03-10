package Controller;

import Model.Automovel;

import javax.sound.midi.Soundbank;
import java.util.*;

public class AutomovelController {
    public static void main(String[] args) {
        Automovel auto1 = new Automovel();
        System.out.println(auto1);
        Automovel auto2 = new Automovel("aaa", "aaa45", "azul", 5, "gas", 5, "aaa", 2000.00);
        System.out.println(auto2);

        Automovel auto3 = new Automovel("bbb", "bbb", "preto", 4, "gasolina", 8, "bbb", 400.00);
        Automovel auto4 = new Automovel("ccc", "ccc", "laranja", 5, "diesel", 8, "ccc", 8000.00);
        Automovel auto5 = new Automovel("ddd", "ddd", "azul", 6, "gas", 6, "ddd", 900.00);

        auto1.setRenavan("eee");
        auto1.setPlaca("eee");
        auto1.setCor("rosa");
        System.out.println(auto1);

        List<Automovel> totalAuto = new ArrayList<>();
        totalAuto.add(auto1);
        totalAuto.add(auto2);
        totalAuto.add(auto3);
        totalAuto.add(auto4);
        totalAuto.add(auto5);
        System.out.println(totalAuto);

        totalAuto.sort(Comparator.comparing(Automovel::getRenavan));
        System.out.println(totalAuto);

        Automovel autoAchou = totalAuto.stream()
                .filter(automovel -> automovel.getRenavan()
                        .equals("aaa")).findAny().orElse(null);
        System.out.println(autoAchou);

        Map<String, Automovel> autoMap = new HashMap<>();
        autoMap.put(auto1.getRenavan(), auto1);
        autoMap.put(auto2.getRenavan(), auto2);
        autoMap.put(auto3.getRenavan(), auto3);
        autoMap.put(auto4.getRenavan(), auto4);
        autoMap.put(auto5.getRenavan(), auto5);
        System.out.println(autoMap);

        System.out.println(autoMap.get("aaa"));
    }
}
