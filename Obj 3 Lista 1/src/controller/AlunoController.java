package controller;

import model.Aluno;
import model.Disciplina;

import java.util.Comparator;
public class AlunoController {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1L, "Argel", "Heberle");
        Aluno aluno2 = new Aluno(2L, "Manu", "Nornberg");

        Disciplina d1 = new Disciplina(1L, "Portugues");
        Disciplina d2 = new Disciplina(2L, "Matematica");
        Disciplina d3 = new Disciplina(3L, "Quimica");

        System.out.println("\nAdicionando disciplinas no aluno 1: ");
        aluno1.getDisciplinas().add(d1);
        aluno1.getDisciplinas().add(d2);
        System.out.println(aluno1);

        System.out.println("\nAdicionando disciplinas no aluno 2: ");
        aluno2.getDisciplinas().add(d1);
        aluno2.getDisciplinas().add(d2);
        aluno2.getDisciplinas().add(d3);
        System.out.println(aluno2);

        System.out.println("\nOrdenando as disciplinas por aluno por nome de materia:  ");
        aluno1.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(aluno1);
        aluno2.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(aluno2);

        System.out.println("\nDesmatriculando aluno 2: ");
        aluno2.getDisciplinas().clear();
        System.out.println(aluno2);

        System.out.println("\nOrdenando as disciplinas por aluno por nome de materia:  ");
        aluno1.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(aluno1);
        aluno2.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(aluno2);

    }
}