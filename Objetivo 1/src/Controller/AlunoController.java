package Controller;

import Model.Aluno;

public class AlunoController {
    public static void main(String[] args) {

        //criando instancias com construtor padrao
        Aluno aluno1 = new Aluno();
        System.out.println(aluno1);
        Aluno aluno2 = new Aluno();
        System.out.println(aluno2);

        //criando instancias com construtor parametrizado
        Aluno aluno3 = new Aluno(300, 123123, "José", "Silva", "jose@gmail");
        System.out.println(aluno3);
        Aluno aluno4 = new Aluno(400, 456456, "Maria", "da Rosa", "maria@gmail");
        System.out.println(aluno4);

        //criando instancias com construtor com dois atributos parametrizado
        Aluno aluno5 = new Aluno(500,"Thomas");
        System.out.println(aluno5);
        Aluno aluno6 = new Aluno(600,"Ana");
        System.out.println(aluno6);

        //fim da criacao de instancias


    }
}
