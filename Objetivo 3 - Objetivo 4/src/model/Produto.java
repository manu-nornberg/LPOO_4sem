package model;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Produto {
    private int codigo, qnt, aumentaEstoque, estoque;
    private String nome;
    private double preco;
    private List<Item> itens = new ArrayList<>();
    private Fornecedor fornecedor;

    public Produto(int codigo, int qnt, String nome, double preco) {
        this.codigo = codigo;
        this.qnt = qnt;
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(int codigo, int qnt, String nome, double preco, Fornecedor fornecedor) {
        this.codigo = codigo;
        this.qnt = qnt;
        this.nome = nome;
        this.preco = preco;
        this.fornecedor = fornecedor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQnt() {
        return qnt = qnt + aumentaEstoque;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

   public int getAumentaEstoque() {
      return aumentaEstoque = fornecedor.getEstoque();}


    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", qnt=" + qnt +
                ", nome='" + nome + '\'' +
                ", preco=" + NumberFormat.getNumberInstance().format(preco) +
                '}';
    }
}
