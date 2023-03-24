package Controller;

import Model.Aluno;

import java.util.*;

public class AlunoController {
    public static void main(String[] args) {

        //criando instancias com construtor padrao
        System.out.println("\nInstancias padroes");
        Aluno aluno1 = new Aluno();
        System.out.println(aluno1);
        Aluno aluno2 = new Aluno();
        System.out.println(aluno2);

        //criando instancias com construtor parametrizado
        System.out.println("\nInstancias parametrizadas");
        Aluno aluno3 = new Aluno(300, "123123", "José", "Silva", "jose@gmail");
        System.out.println(aluno3);
        Aluno aluno4 = new Aluno(400, "456456", "Maria", "da Rosa", "maria@gmail");
        System.out.println(aluno4);

        //criando instancias com construtor com dois atributos parametrizado
        System.out.println("\nIntancias com dois atributos");
        Aluno aluno5 = new Aluno(500,"Thomas");
        System.out.println(aluno5);
        Aluno aluno6 = new Aluno(600,"Ana");
        System.out.println(aluno6);

        //fim da criacao de instancias

        //modificando instancias
        System.out.println("\nImprimindo modificacoes com set e get");
        aluno1.setId(100);
        aluno1.setCpf("789789");
        aluno1.setNome("Natalia");
        aluno1.setSobrenome("Gomes");
        aluno1.setEmail("nat@gmail");
        System.out.println(aluno1.getClass());
        System.out.println(aluno1.getCpf());
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getSobrenome());
        System.out.println(aluno1.getEmail());

        aluno2.setId(200);
        aluno2.setCpf("789456");
        aluno2.setNome("Jinx");
        aluno2.setSobrenome("Miau");
        aluno2.setEmail("gatinho@gmail");
        System.out.println(aluno2.getId());
        System.out.println(aluno2.getCpf());
        System.out.println(aluno2.getNome());
        System.out.println(aluno2.getSobrenome());
        System.out.println(aluno2.getEmail());

        //fim da modificacao das instancias

        //criacao da lista
        List<Aluno> totalAlunos = new ArrayList<>();
        totalAlunos.add(aluno1);
        totalAlunos.add(aluno2);
        totalAlunos.add(aluno3);
        totalAlunos.add(aluno4);
        totalAlunos.add(aluno5);
        totalAlunos.add(aluno6);
        System.out.println("\nImprimindo ID de alunos pelo List");
        System.out.println(totalAlunos);

        //criacao do map
        Map<Integer, Aluno> alunoMap = new HashMap<>();
        alunoMap.put(aluno1.getId(), aluno1);
        alunoMap.put(aluno2.getId(), aluno2);
        alunoMap.put(aluno3.getId(), aluno3);
        alunoMap.put(aluno4.getId(), aluno4);
        alunoMap.put(aluno5.getId(), aluno5);
        alunoMap.put(aluno6.getId(), aluno6);
        System.out.println("\nImprimindo ID de alunos pelo Map");
        System.out.println(alunoMap);

        //ordenando pelo id decrescente
        totalAlunos.sort(Comparator.comparing(Aluno::getId).reversed());
        System.out.println("\nImprimindo pelo ID decrescente");
        System.out.println(totalAlunos);

        //pesquisando o id = 5 pelo list
        Aluno alunoAchou = totalAlunos.stream()
                .filter(aluno -> aluno.getId()
                        .equals(500)).findAny().orElse(null);
        System.out.println("\nImprimindo pesquisa do ID 5 com o list");
        System.out.println(alunoAchou);

        //pesquisando o id = 5 com o map
        System.out.println("\nImprimindo pesquisa do ID 5 com o map");
        System.out.println(alunoMap.get(500));

    }
}
