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

        System.out.println("\n========= itens da venda 1 ========= ");
        itemList.forEach(item->{
            System.out.println(item);
        });

        System.out.println("\n======= STATUS DO PEDIDO =====\n" + Tipo.valueOf("PENDENTE"));
        System.out.println("\n===AGUARDANDO CHECAGEM DE ESTOQUE===");

        //pedido 1
        double valorTotal = 0.0;
        for(Item it : itemList){
            valorTotal += it.getValorTotalItem();
        }
        Pedido pe1 = new Pedido(1, LocalDate.of(2032, 04, 26), valorTotal, (Vendedor) v1, itemList);
        System.out.println("\n========= Pedido 1 ========= ");
        System.out.println("\n=======STATUS DO PEDIDO=====\n");
        pe1.venda();
        System.out.println(pe1);

        //verificando o estoque da venda 1
        System.out.println("\n========Estoque depois da venda==========");
        produtoList.forEach(p->{
            System.out.println(p);
        });

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
        System.out.println("\n===AGUARDANDO CHECAGEM DE ESTOQUE===");

        //pedido 2
        double valorTotal1 = 0.0;
        for(Item it : itemList1){
            valorTotal1 += it.getValorTotalItem();
        }
        Pedido pe2 = new Pedido(2, LocalDate.of(2023, 06, 21), valorTotal1, (Vendedor) v1, itemList1);
        System.out.println("\n========= Pedido 2 ========= ");
        System.out.println("\n=======STATUS DO PEDIDO=====\n");
        pe2.venda();
        System.out.println(pe2);

        //verificando o estoque depois da venda 2
        System.out.println("\nEstoque depois da venda 2= ");
        produtoList.forEach(p->{
            System.out.println(p);
        });

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


        //criando fornecimento dos produtos
        //ja esta criado um fornecedor
        System.out.println("\nAumentando o estoque= ");
        p1.setFornecedor(f1);
        f1.setEstoque(100);
        int estoquep1 = f1.getEstoque();
        p1.getAumentaEstoque();
        System.out.println("Fornecedor= " + f1.getNome() + ", aumentou o estoque para= " + estoquep1 + " unidades");
        System.out.println("Nome do produto= " + p1.getNome() + ", Quantidade nova= " + p1.getQnt() + " unidades");

        p2.setFornecedor(f1);
        f1.setEstoque(11);
        p2.getAumentaEstoque();
        int estoquep2 = f1.getEstoque();
        System.out.println("Fornecedor= " + f1.getNome() + ", aumentou o estoque para= " + estoquep2 + " unidades");
        System.out.println("Nome do produto= " + p2.getNome() + ", Quantidade nova= " + p2.getQnt() + " unidades");

        System.out.println("\n=====Criando fornecimentos dos produtos====");
        Fornecimento for1 = new Fornecimento(LocalDate.of(2023, 04, 20), p1.getPreco() * estoquep1, p1, f1);
        Fornecimento for2 = new Fornecimento(LocalDate.of(2023, 04, 25), p2.getPreco() * estoquep2, p2, f1);



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

//////////////////////////////////////////////////////////////////////////
        System.out.println("\n=====Realizando uma vendo com execeçao========");
        Item i5 = new Item(10,300,0,p3);

        //pedido 2
        double valorTotal3 = 0.0;
        for(Item it : itemList1){
            valorTotal3 += it.getValorTotalItem();
        }
        Pedido pe3 = new Pedido(2, LocalDate.of(2023, 4, 15), valorTotal3, (Vendedor) v1);
        pe3.getItens().add(i5);

        System.out.println("\n=======STATUS DO PEDIDO=====\n" + Tipo.valueOf("PENDENTE"));
        System.out.println("\n===AGUARDANDO CHECAGEM DE ESTOQUE===");

        System.out.println("\n========= Pedido 3 ========= ");
        pe3.venda();

    }
}

