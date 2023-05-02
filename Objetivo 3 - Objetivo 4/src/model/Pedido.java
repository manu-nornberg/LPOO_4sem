package model;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private LocalDate data;
    private double valor;
    private Vendedor vendedor;
    private List<Item> itens = new ArrayList<>();
    private Tipo tipo;


    public Pedido() {
    }

    public Pedido(int numero, LocalDate data, double valor, Vendedor vendedor) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.vendedor = vendedor;
        this.tipo = Tipo.valueOf("ATENDIDO");
    }

    public Pedido(int numero, LocalDate data, double valor, Vendedor vendedor, List<Item> itens) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.vendedor = vendedor;
        this.itens = itens;
        this.tipo = Tipo.valueOf("ATENDIDO");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void venda() throws ExcecaoEstoque{
        try{
            this.getItens().forEach(i-> {
                if (i.getProduto().getQnt() < i.getQnt()) {
                    throw new ExcecaoEstoque();
                }
            });
            System.out.println(Tipo.valueOf("ATENDIDO"));
            this.getItens().forEach(item -> {
                item.getProduto().diminuiEstoque(item.getQnt());
            });
        }catch (Exception e){
            e.getMessage();
            e.printStackTrace();
            System.err.println("Erro! STATUS PEDIDO= " + Tipo.valueOf("CANCELADO"));
        }
    }

    @Override
    public String toString() {
        return "\nPedido{" +
                "numero=" + numero +
                ", data=" + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(data) +
                ", valor total do pedido=" + NumberFormat.getNumberInstance().format(valor) +
                ", \nVendedor= "+ vendedor +
                ", \n" + itens +
                '}';
    }
}
