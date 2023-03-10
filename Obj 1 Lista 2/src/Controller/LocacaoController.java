package Controller;

import Model.Locacao;
import Model.Modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;


public class LocacaoController {
    public static void main(String[] args) {
        Locacao loca1 = new Locacao();
        System.out.println(loca1);
        Locacao loca2 = new Locacao(
                LocalDate.of(2022,5,2),
                LocalDate.of(2021,5,8),
                LocalTime.of(8,50),
                LocalTime.of(8,40),
                8, 300.00, 200.00, true);
        System.out.println(loca2);

        Locacao loca3 = new Locacao(
                LocalDate.of(2024,5,2),
                LocalDate.of(2026,5,8),
                LocalTime.of(5,52),
                LocalTime.of(9,36),
                8, 500.00, 100.00, true);
        Locacao loca4 = new Locacao(
                LocalDate.of(2022,8,9),
                LocalDate.of(2021,10,25),
                LocalTime.of(9,50),
                LocalTime.of(7,40),
                8, 600.00, 100.00, true);
        Locacao loca5 = new Locacao(
                LocalDate.of(2022,12,22),
                LocalDate.of(2021,5,18),
                LocalTime.of(9,50),
                LocalTime.of(4,40),
                8, 300.00, 200.00, true);

        loca1.getDataDevolucao(LocalDate.of(2015,5,9));
        loca1.getHoraLocacao(LocalTime.of(6,20));
        loca1.getHoraLocacao(LocalTime.of(9,60));
        loca1.getDataLocacao(LocalDate.of(2013,9,12));
        System.out.println(loca1);

        List<Locacao> totalLocal = new ArrayList<>();
        totalLocal.add(loca1);
        totalLocal.add(loca2);
        totalLocal.add(loca3);
        totalLocal.add(loca4);
        totalLocal.add(loca5);
        System.out.println(totalLocal);

        totalLocal.sort(Comparator.comparing(Locacao::getKm));
        System.out.println(totalLocal);

        Locacao localAchou = totalLocal.stream()
                .filter(locacao -> locacao.getValorCalcao()
                        .equals(100.00)).findAny().orElse(null);
        System.out.println(localAchou);

        //Map<String, Locacao> localMap = new HashMap<>();
        //localMap.put(loca1.getKm(), loca1);

    }
}
