package model;

public class Gerente extends Funcionario{
    private String formacao;

    public Gerente(int matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado, String formacao) {
        super(matricula, nome, endereco, bairro, cep, cidade, estado);
        this.formacao = formacao;
    }
}
