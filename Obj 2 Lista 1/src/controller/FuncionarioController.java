package controller;

import model.*;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {

    private static double reajuste = 0.0;
    public static void main(String[] args) {

        //criando instancias padrao e parametrizadas
        Funcionario devJ1 = new DesenvolvedorJunior();
        Funcionario gerG = new GerenteGeral();
        Funcionario devP1 = new DesenvolvedorPleno("Ana", 2500.00);
        Funcionario gerD = new GerenteDesenvolvedor("Joana", 4500.00);

        //imprimindo as instancias
        System.out.println(devJ1);
        System.out.println(devP1);
        System.out.println(gerG);
        System.out.println(gerD);

        //modificando as instancias
        devJ1.setNome("Beatriz");
        devJ1.setSalario(1800.00);
        System.out.println(devJ1.getNome());
        System.out.println(devJ1.getSalario());

        gerG.setNome("Lucia");
        gerG.setSalario(6500.00);
        System.out.println(gerG.getNome());
        System.out.println(gerG.getSalario());

        //imprimindo as novas instancias
        System.out.println(devJ1);
        System.out.println(devP1);
        System.out.println(gerG);
        System.out.println(gerD);

        //1--Não, pois funcionario é uma classe abstrata
        //2-- Nas subclasses, pois são as partes mais especificas de cada caso

        //criando as outras instancias
        Desenvolvedor devS1 = new DesenvolvedorSenior("Gabriel",3500.00);
        Desenvolvedor devS2 = new DesenvolvedorSenior("Argel", 3500.00);
        Desenvolvedor devS3 = new DesenvolvedorSenior("Johann", 3500.00);
        Desenvolvedor devS4 = new DesenvolvedorSenior("Esther", 3500.00);
        Desenvolvedor devS5 = new DesenvolvedorSenior("Rodrigo", 3500.00);
        Desenvolvedor devS6 = new DesenvolvedorSenior("Marcia", 3500.00);

        Desenvolvedor devP2 = new DesenvolvedorPleno("Iam", 2500.00);
        Desenvolvedor devP3 = new DesenvolvedorPleno("Lindomar", 2500.00);
        Desenvolvedor devP4 = new DesenvolvedorPleno("Fernando", 2500.00);
        Desenvolvedor devP5 = new DesenvolvedorPleno("Marcos", 2500.00);
        Desenvolvedor devP6 = new DesenvolvedorPleno("Matheus", 2500.00);

        Desenvolvedor devJ2 = new DesenvolvedorJunior("Maria", 1800.00);
        Desenvolvedor devJ3 = new DesenvolvedorJunior("Aline", 1800.00);
        Desenvolvedor devJ4 = new DesenvolvedorJunior("Amanda", 1800.00);
        Desenvolvedor devJ5 = new DesenvolvedorJunior("Guilherme", 1800.00);
        Desenvolvedor devJ6 = new DesenvolvedorJunior("Ariane", 1800.00);

        //listando todas os funcionarios
        List<Funcionario> totalFuncionarios = new ArrayList<>();
        totalFuncionarios.add(gerG);
        totalFuncionarios.add(gerD);
        totalFuncionarios.add(devJ1);
        totalFuncionarios.add(devJ2);
        totalFuncionarios.add(devJ3);
        totalFuncionarios.add(devJ4);
        totalFuncionarios.add(devJ5);
        totalFuncionarios.add(devJ6);
        totalFuncionarios.add(devP1);
        totalFuncionarios.add(devP2);
        totalFuncionarios.add(devP3);
        totalFuncionarios.add(devP4);
        totalFuncionarios.add(devP5);
        totalFuncionarios.add(devP6);
        totalFuncionarios.add(devS1);
        totalFuncionarios.add(devS2);
        totalFuncionarios.add(devS3);
        totalFuncionarios.add(devS4);
        totalFuncionarios.add(devS5);
        totalFuncionarios.add(devS5);

        //imprimindo a lista
        System.out.println(totalFuncionarios);

        //imprimindo a folha salarial com o bonus
        System.out.println(
                NumberFormat.getCurrencyInstance().format(
                        totalFuncionarios.stream().mapToDouble(
                                f -> f.getSalario() + f.getBonus()).sum()));

        //imprimindo a folha salarial sem o bonus
        System.out.println(
                NumberFormat.getCurrencyInstance().format(
                        totalFuncionarios.stream().mapToDouble(
                                f-> f.getSalario()).sum()));


        //calculando o salario bruto
        totalFuncionarios.forEach(f -> {
            double totalSalario = f.getSalario() + f.getBonus();


            //imprimindo o salario bruto
            System.out.println("\nFuncionario= " + f.getNome());
            System.out.println("\nSalario= " + NumberFormat.getNumberInstance().format(f.getSalario()));
            System.out.println("\nBonus= " + NumberFormat.getNumberInstance().format(f.getBonus()));
            System.out.println("\nBruto= " + NumberFormat.getNumberInstance().format(totalSalario));
        });

        //calculando o reajuste de 5%
        totalFuncionarios.forEach(funcionario -> {
            funcionario.setSalario(funcionario.getSalario() * 1.05);
            reajuste += funcionario.getBonus() + funcionario.getSalario();
        });

        //imprimindo novo salario
        System.out.println(NumberFormat.getCurrencyInstance().format(reajuste));

        //calculando o reajuste sem forEach
        System.out.println(
                NumberFormat.getCurrencyInstance().format(
                        totalFuncionarios.stream().mapToDouble(funcionario -> {
                            funcionario.setSalario(funcionario.getSalario() * 1.05);
                            return funcionario.getBonus() + funcionario.getSalario();
                        }).sum()));

    }
}