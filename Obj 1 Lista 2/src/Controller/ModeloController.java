package Controller;

import Model.Modelo;

import java.util.*;

public class ModeloController {
    public static void main(String[] args) {
        Modelo model1 = new Modelo();
        System.out.println(model1);
        Modelo model2 = new Modelo("aaaa");
        System.out.println(model2);

        Modelo model3 = new Modelo("bbbb");
        System.out.println(model3);
        Modelo model4 = new Modelo("vccc");
        System.out.println(model4);
        Modelo model5 = new Modelo("dddd");
        System.out.println(model5);

        model1.setModelo("gffgdgh");
        System.out.println(model1.getModelo());

        List<Modelo> totalmodelo = new ArrayList<>();
        totalmodelo.add(model1);
        totalmodelo.add(model2);
        totalmodelo.add(model3);
        totalmodelo.add(model4);
        totalmodelo.add(model5);
        System.out.println(totalmodelo);

        totalmodelo.sort(Comparator.comparing(Modelo::getModelo));
        System.out.println(totalmodelo);

        Modelo modelachou = totalmodelo.stream()
                .filter(modelo -> modelo.getModelo()
                        .equals("vccc")).findAny().orElse(null);
        System.out.println(modelachou);

        Map<String, Modelo> modelMap = new HashMap<>();
        modelMap.put(model1.getModelo(), model1);
        modelMap.put(model2.getModelo(), model2);
        modelMap.put(model3.getModelo(), model3);
        modelMap.put(model4.getModelo(), model4);
        modelMap.put(model5.getModelo(), model5);
        System.out.println(modelMap);

        System.out.println(modelMap.get("vccc"));
    }
}
