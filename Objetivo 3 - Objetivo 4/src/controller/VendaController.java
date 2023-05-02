package controller;

import model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VendaController {
    public static void main(String[] args) {
        //criando um vendedor para realizar a venda
        System.out.println("\n======Para iniciar a aplicação, criei um vendedor para realizar a venda======");
        Funcionario v1 = new Vendedor(1, "Manu", "Rua das Flores", "Centro", "96030222", "Pelotas", "RS", "Loja");
        System.out.println(v1);

        //criando produtos
        System.out.println("\n=====Criando produtos====");
        Produto p1 = new Produto(1, 50, "Prego", 2);
        Produto p2 = new Produto(2, 40, "Parafuso", 3);
        Produto p3 = new Produto(3, 30, "Porca", 1);
        Produto p4 = new Produto(4, 20, "Pino", 5);

        List<Produto> produtoList = new ArrayList<>();
        produtoList.add(p1);
        produtoList.add(p2);
        produtoList.add(p3);
        produtoList.add(p4);

        produtoList.forEach(prod -> {
            System.out.println(prod);
        });

        //criando um fornecedor para os produtos
        System.out.println("\n=====Criando um fornecedor para os produtos====");
        Fornecedor f1 = new Fornecedor(22222222, "99999999", "ProdudosLTDA");
        System.out.println(f1);

//////////////////////////////////////////////////////////////////////////////////

        //verificando o estoque dos produtos
        System.out.println("\n=========Estoque antes da venda=========");
        produtoList.forEach(prod ->{
                System.out.println(prod.getNome() + "= " + prod.getQnt() + " unidades");
        });

        //criando a venda de 2 produtos
        Item i = new Item(1, 2, 0.5, p1);
        Item i1 = new Item(2, 1, 0.5, p2);

        //criando a venda de 3 produtos
        Item i2 = new Item(1, 10, 0.5, p3);
        Item i3 = new Item(2, 10, 0.5, p4);
        Item i4 = new Item(3, 10, 0.5, p1);


        //fazendo uma coleção dos itens q vao no pedido 1
        List<Item> itemList = new ArrayList<>();
        itemList.add(i);
        itemList.add(i1);

        System.out.println("\n========= itens da venda 1========= ");
        itemList.forEach(item->{
            System.out.println(item);
        });

        System.out.println("\n=======STATUS DO PEDIDO=====\n" + Tipo.valueOf("PENDENTE"));

        //verificando o estoque da venda 1
        System.out.println("\n========Estoque depois da venda==========");
        p1.setQnt(p1.getQnt() - i.getQnt());
        System.out.println("Estoque produto:" + " " + p1.getNome() + " = " + p1.getQnt() + " unidades");
        try{
            if (p1.getQnt() <= 0){
                throw new ExcecaoEstoque();
            }
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("Erro!");
            Tipo.valueOf("CANCELADO");
        }

        p2.setQnt(p2.getQnt() - i1.getQnt());
        System.out.println("Estoque produto:" + " " + p2.getNome() + " = " + p2.getQnt() + " unidades");
        try{
            if (p2.getQnt() <= 0){
                throw new ExcecaoEstoque();
            }
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("Erro!");
            Tipo.valueOf("CANCELADO");
        }

        //pedido 1
        double valorTotal = 0.0;
        for(Item it : itemList){
            valorTotal += it.getValorTotalItem();
        }
        Pedido pe1 = new Pedido(1, LocalDate.of(2032, 04, 26), valorTotal, (Vendedor) v1, itemList);
        System.out.println("\n========= Pedido 1 ========= ");
        System.out.println(pe1);
        System.out.println("\n=======STATUS DO PEDIDO=====\n" + pe1.getTipo());


//////////////////////////////////////////////////////////////////////////////////

        System.out.println("\n========= Realizando outra venda ========= ");
        //fazendo uma coleçao dos itens q vao no pedido 2
        List<Item> itemList1 = new ArrayList<>();
        itemList1.add(i2);
        itemList1.add(i3);
        itemList1.add(i4);

        System.out.println("\n========= itens da venda 2========= ");
        itemList.forEach(item->{
            System.out.println(item);
        });

        System.out.println("\n=======STATUS DO PEDIDO=====\n" + Tipo.valueOf("PENDENTE"));

        //pedido 2
        double valorTotal1 = 0.0;
        for(Item it : itemList1){
            valorTotal1 += it.getValorTotalItem();
        }
        Pedido pe2 = new Pedido(2, LocalDate.of(2023, 06, 21), valorTotal1, (Vendedor) v1, itemList1);
        System.out.println("\n========= Pedido 2 ========= ");
        System.out.println(pe2);
        System.out.println("\n=======STATUS DO PEDIDO=====\n" + pe2.getTipo());

        //verificando o estoque depois da venda 2
        System.out.println("\nEstoque depois da venda 2= ");
        p1.setQnt(p1.getQnt() - i4.getQnt());
        System.out.println("Estoque produto:" + " " + p1.getNome() + " = " + p1.getQnt() + " unidades");
        try{
            if (p1.getQnt() <= 0){
                throw new ExcecaoEstoque();
            }
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("Erro!");
            Tipo.valueOf("CANCELADO");
        }
        p3.setQnt(p3.getQnt() - i2.getQnt());
        System.out.println("Estoque produto:" + " " + p3.getNome() + " = " + p3.getQnt() + " unidades");
        try{
            if (p3.getQnt() <= 0){
                throw new ExcecaoEstoque();
            }
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("Erro!");
            Tipo.valueOf("CANCELADO");
        }
        p4.setQnt(p4.getQnt() - i3.getQnt());
        System.out.println("Estoque produto:" + " " + p4.getNome() + " = " + p4.getQnt() + " unidades");
        try{
            if (p4.getQnt() <= 0){
                throw new ExcecaoEstoque();
            }
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("Erro!");
            Tipo.valueOf("CANCELADO");
        }

//////////////////////////////////////////////////////////////////////////////////

        //imprimindo os pedidos realizados
        List<Pedido> pedidoList = new ArrayList<>();
        pedidoList.add(pe1);
        pedidoList.add(pe2);
        System.out.println("\nImprimindo os pedidos realizados= ");
        System.out.println(pedidoList);

        //imprimindo a lista de produtos apos a venda
        System.out.println("\nLista de produtos após as vendas= ");
        produtoList.forEach(prod ->{
            System.out.println("Codigo= " + prod.getCodigo() +", Nome= "+ prod.getNome() +", Preco= "+ prod.getPreco() +", Quantidade= "+ prod.getQnt());
        });


//////////////////////////////////////////////////////////////////////////////////

        //imprimindo o fornecedor
        System.out.println("\nImprimindo o fornecedor= ");
        f1.getProdutos().add(p1);
        f1.getProdutos().add(p2);
        System.out.println(f1);

        //ja esta criado um fornecedor
        System.out.println("\nAumentando o estoque= ");
        p1.setFornecedor(f1);
        f1.setEstoque(100);
        p1.getAumentaEstoque();
        System.out.println("Nome do produto= " + p1.getNome() + ", Quantidade nova= " + p1.getQnt() + " unidades");

        p2.setFornecedor(f1);
        f1.setEstoque(11);
        p2.getAumentaEstoque();
        System.out.println("Nome do produto= " + p2.getNome() + ", Quantidade nova= " + p2.getQnt() + " unidades");


        //criando fornecimento dos produtos
        System.out.println("\n=====Criando fornecimentos dos produtos====");
        Fornecimento for1 = new Fornecimento(LocalDate.of(2023, 04, 20), p1.getPreco() * p1.getQnt(), p1, f1);
        Fornecimento for2 = new Fornecimento(LocalDate.of(2023, 04, 25), p2.getPreco() * p2.getQnt(), p2, f1);

        List<Fornecimento> fornecimentos = new ArrayList<>();
        fornecimentos.add(for1);
        fornecimentos.add(for2);
        System.out.println(fornecimentos);

        System.out.println("\n=====Custo total do fornecimento====");
        double custoTotal = 0.0;
        for (Fornecimento forne : fornecimentos){
            custoTotal += forne.getValorTotal();
        }
        System.out.println("\nCusto total de fornecimento= " + custoTotal);

    }
}

