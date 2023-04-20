package controller;

import model.Corrida;
import model.Motorista;
import model.Usuario;
import model.Veiculo;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UberController {
    public static void main(String[] args) {
        Usuario passageiro = new Usuario(1L, "Argel", "argel@gmail", "999666333");
        Veiculo carro1 = new Veiculo(1L, "carro", "ADF5678", 1995);
        Motorista motora1 = new Motorista(1L, "Manu", "manu@gmail.com", "789456123", carro1);

        Corrida corrida1 = new Corrida(1L, "pix", "--", LocalDateTime.of(2023,04,12,9,45), 25.00, 5, passageiro, motora1);
        Corrida corrida2 = new Corrida(2L, "pix", "--", LocalDateTime.of(2023,04,13,9,35), 60.00, 6, passageiro, motora1);

        List<Corrida> corridas = new ArrayList<>();
        corridas.add(corrida1);
        corridas.add(corrida2);
        System.out.println("\nCorridas realizadas: ");
        System.out.println(corridas);

        System.out.println("\nCorridas do mesmo usuario por ordem de data reversa: ");
        passageiro.getCorridas().add(corrida1);
        passageiro.getCorridas().add(corrida2);
        passageiro.getCorridas().sort(Comparator.comparing(Corrida::getDataInicio).reversed());
        System.out.println(passageiro.getCorridas());

        System.out.println("\nCorridas por motorista por ordem de data reversa: ");
        motora1.getCorridas().add(corrida1);
        motora1.getCorridas().add(corrida2);
        motora1.getCorridas().sort(Comparator.comparing(Corrida::getDataInicio).reversed());
        System.out.println(motora1.getCorridas());

        System.out.println("\nValor total de todas as corridas por motorista: ");
        System.out.println(NumberFormat.getCurrencyInstance().format(motora1.getCorridas().stream().mapToDouble(c -> c.getPreco()).sum()));



    }
}
