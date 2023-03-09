package controller;

import model.Produto;

import java.util.*;

public class ProdutoController {
    public static void main(String[] args) {

        //construindo instancias da classe Produto
        Produto produto1 = new Produto(); //construtor padrão
        System.out.println("Imprimindo construtor padrao");
        System.out.println(produto1.getNome()); //imprimindo

        Produto produto2 = new Produto("Pão","Cacetinho", 2.50, 5); //construtor parametrizado
        System.out.println("Imprimindo construtor parametizado");
        System.out.println(produto2.getNome()); //imprimindo
        System.out.println(produto2.getDescricao()); //imprimindo
        System.out.println(produto2.getValor()); //imprimindo
        System.out.println(produto2.getEstoque()); //imprimindo

        produto1.setNome("lasanha"); //alterando o objeto
        System.out.println("Alterando objeto");
        System.out.println(produto1.getNome());

        produto2.setNome("milho"); //alterando o objeto
        System.out.println("Alterando objeto");
        System.out.println(produto2.getNome());

        Produto produto3 = new Produto("batata", "Frita", 5.00, 6);
        System.out.println("Imprimindo em toString");
        System.out.println(produto3.toString()); //imprimindo em String

        //mais produtos pro exercicio 2
        Produto produto4 = new Produto("feijao", "preto", 5.00, 10);
        Produto produto5 = new Produto("arroz", "branco", 5.22, 9);

        //lista
        List<Produto> totalProdutos = new ArrayList<>();
        totalProdutos.add(produto1);
        totalProdutos.add(produto2);
        totalProdutos.add(produto3);
        totalProdutos.add(produto4);
        totalProdutos.add(produto5);
        System.out.println("Imprimindo lista");
        System.out.println(totalProdutos);

        //ordenacao pelo nome
        totalProdutos.sort(Comparator.comparing(Produto::getNome).reversed());
        System.out.println("Imprimindo lista ordenada");
        System.out.println(totalProdutos);

        //pesquisando
        totalProdutos.forEach(produto -> {
            if(produto.getNome().equals("arroz")){
                System.out.println("Imprimindo pesquisa");
                System.out.println(produto);
            }
        });

        //pesquisando pelo filter
        Produto produtoAchou = totalProdutos.stream().filter(produto -> produto.getNome().equals("arroz")).findAny().orElse(null);
        System.out.println(produtoAchou);

        //map
        Map<String, Produto> produtosMap = new HashMap<>();
        produtosMap.put(produto1.getNome(),produto1);
        produtosMap.put(produto2.getNome(),produto2);
        produtosMap.put(produto3.getNome(),produto3);
        produtosMap.put(produto4.getNome(),produto4);
        produtosMap.put(produto5.getNome(),produto5);
        System.out.println("Imprimindo Map");
        System.out.println(produtosMap);

        //pesquisando no map
        System.out.println("Pesquisando no map");
        System.out.println(produtosMap.get("arroz"));
    }

}
