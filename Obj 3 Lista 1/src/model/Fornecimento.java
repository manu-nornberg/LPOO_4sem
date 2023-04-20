package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fornecimento {
    private LocalDate data;
    private double valor;

    //ligando em fornecimento outras classes
    private Fornecedor fornecedor;
    private Produto produto;

    public Fornecimento(LocalDate data, double valor) {
        this.data = data;
        this.valor = valor;
    }

    public Fornecimento(LocalDate data, double valor, Fornecedor fornecedor, Produto produto) {
        this.data = data;
        this.valor = valor;
        this.fornecedor = fornecedor;
        this.produto = produto;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Fornecimento{" +
                "data=" + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(data) +
                ", valor=" + valor +
                ", fornecedor=" + fornecedor +
                ", produto=" + produto +
                '}';
    }
}
