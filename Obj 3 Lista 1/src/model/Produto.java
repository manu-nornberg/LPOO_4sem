package model;

public class Produto {
    private int codigo, qnt;
    private String nome;
    private double preco;

    //ligando fornecedor com produto
    private Fornecedor fornecedor;

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
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
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

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setManterProduto(int codigo){
        this.codigo=codigo;
    }
    public boolean getManterProduto(){
        return getManterProduto();
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", qnt=" + qnt +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", fornecedor=" + fornecedor +
                '}';
    }
}
