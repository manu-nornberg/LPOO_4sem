package model;

import java.text.NumberFormat;

public class Item {
    private int codItem, qnt;
    private double desconto, valorTotalItem;
    private Produto produto;

    public Item(int codItem, int qnt, double desconto, Produto produto) {
        this.codItem = codItem;
        this.qnt = qnt;
        this.desconto = desconto;
        this.produto = produto;
        this.valorTotalItem = valorItem();
    }

    public int getCodItem() {
        return codItem;
    }

    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public double getDesconto() {
        return desconto ;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValorTotalItem() {
        return valorTotalItem;
    }

    public void setValorTotalItem(double valorTotalItem) {
        this.valorTotalItem =  valorTotalItem;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double valorItem(){
        return (this.qnt * this.produto.getPreco()) * this.desconto;
    }


    @Override
    public String toString() {
        return "Item{" +
                "codItem=" + codItem +
                ", qnt=" + qnt +
                ", desconto=" + NumberFormat.getNumberInstance().format(desconto) +
                ", valor total item=" + NumberFormat.getNumberInstance().format(valorTotalItem) +
                ", " + produto +
                '}';
    }
}
