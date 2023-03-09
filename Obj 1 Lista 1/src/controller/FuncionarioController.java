package controller;

import model.Funcionario;

import javax.sound.midi.Soundbank;
import java.util.*;

public class FuncionarioController {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario(); //padrao
        Funcionario func2 = new Funcionario("Ana",100.00 ); //parametizado
        Funcionario func3 = new Funcionario("Tobias", 50.00);//parametizado
        Funcionario func4 = new Funcionario("Argel", 1000.00);//parametizado
        Funcionario func5 = new Funcionario("Amanda", 45.00);//parametizado

        System.out.println(func1); //padrao
        System.out.println(func2); //parametizado
        System.out.println(func3); //parametizado
        System.out.println(func4); //parametizado
        System.out.println(func5); //parametizado

        //mudando o funcionario 1
        System.out.println("\nAlterando funcionario 1");
        func1.setNome("Gui");
        func1.setSalario(2.00);
        System.out.println(func1.getNome());
        System.out.println(func1.getSalario());

        //lista
        List<Funcionario> totalFuncionarios = new ArrayList<>();
        totalFuncionarios.add(func1);
        totalFuncionarios.add(func2);
        totalFuncionarios.add(func3);
        totalFuncionarios.add(func4);
        totalFuncionarios.add(func5);
        System.out.println("Listagem: ");
        System.out.println(totalFuncionarios);

        //ordenando
        totalFuncionarios.sort(Comparator.comparing(Funcionario::getNome));
        System.out.println("\nImprimindo a ordenacao: ");
        System.out.println(totalFuncionarios);

        //pesquisando
        totalFuncionarios.forEach(funcionario -> {
            if(funcionario.getNome().equals("Argel")){
                System.out.println("\nImprimindo resultado: ");
                System.out.println("\nMelhor funcionario");
                System.out.println(funcionario);
            }
        });

        //pesquisando por filter
        Funcionario funcAchou = totalFuncionarios.stream().filter(funcionario -> funcionario.getNome().equals("Argel")).findAny().orElse(null);
        System.out.println("\nImprimindo resultado: ");
        System.out.println("\nMelhor funcionario");
        System.out.println(funcAchou);

        //map
        Map<String, Funcionario> funcMap = new HashMap<>();
        funcMap.put(func1.getNome(), func1);
        funcMap.put(func2.getNome(), func2);
        funcMap.put(func3.getNome(), func3);
        funcMap.put(func4.getNome(), func4);
        funcMap.put(func5.getNome(), func5);
        System.out.println("\nImprimindo Map");
        System.out.println(funcMap);

        //pesquisando Map
        System.out.println("\nPesquisando no map");
        System.out.println(funcMap.get("Argel"));
        System.out.println("\nMelhor funcionario <3");

    }
}
