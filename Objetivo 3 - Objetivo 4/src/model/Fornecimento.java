package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fornecimento {
    private LocalDate data;
    private double valorTotal;
    private Produto produto;
    private Fornecedor fornecedor;

    public Fornecimento(LocalDate data, double valorTotal, Produto produto, Fornecedor fornecedor) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.produto = produto;
        this.fornecedor = fornecedor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }


    @Override
    public String toString() {
        return "Fornecimento{" +
                "data=" +  DateTimeFormatter.ofPattern("dd/MM/yyyy").format(data) +
                ", valorTotal=" + valorTotal +
                ", " + produto +
                "\nFornecedor = CNPJ= " + fornecedor.getCnpj() +
                ", Contato= " + fornecedor.getContato() +
                ", Nome= " + fornecedor.getNome() +
                "}\n";
    }
}
