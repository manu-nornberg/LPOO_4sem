package model;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor {
    private int cnpj;
    protected int estoque;
    private String contato, nome;
    private List<Produto> produtos = new ArrayList<>();

    public Fornecedor(int cnpj, String contato, String nome, List<Produto> produtos) {
        this.cnpj = cnpj;
        this.contato = contato;
        this.nome = nome;
        this.produtos = produtos;
    }

    public Fornecedor(int cnpj, String contato, String nome) {
        this.cnpj = cnpj;
        this.contato = contato;
        this.nome = nome;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void setEstoque(int estoque){
        this.estoque = estoque;
    }

    public int getEstoque() {
        return estoque;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "cnpj=" + cnpj +
                ", contato='" + contato + '\'' +
                ", nome='" + nome + '\'' +
                ", produtos=" + produtos +
                '}';
    }
}
