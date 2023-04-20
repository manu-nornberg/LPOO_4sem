package controller;

import model.Fornecedor;
import model.Fornecimento;
import model.Produto;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FornecedorController {
    public static void main(String[] args) {
        Fornecedor f1 = new Fornecedor(2222111,"998989989","Argel");
        Fornecedor f2 = new Fornecedor(11213213,"555656565","Manu");

        Produto p1 = new Produto(1,2,"martelo",40, f1);
        Produto p2 = new Produto(2,4,"parafuso",20, f1);
        Produto p3 = new Produto(3,6,"prego",10, f2);

        double valor=p1.getPreco()* p1.getQnt();
        Fornecimento for1 = new Fornecimento(LocalDate.of(2019,3,5),valor,f1, p1);
        System.out.println(for1);

        double valor1=p2.getPreco()* p2.getQnt();
        Fornecimento for2 = new Fornecimento(LocalDate.of(2019,3,5),valor1,f1, p2);
        System.out.println(for2);

        double valor3=p3.getPreco()* p3.getQnt();
        Fornecimento for3 = new Fornecimento(LocalDate.of(2019,3,5),valor3,f2, p3);
        System.out.println(for3);

        List<Fornecimento> fornecimentos = new ArrayList<>();
        fornecimentos.add(for1);
        fornecimentos.add(for2);
        fornecimentos.add(for3);
        System.out.println("\nLista de fornecimentos: ");
        System.out.println(fornecimentos);

        System.out.println("\nTotal de fornecimento");
        System.out.println(NumberFormat.getCurrencyInstance().format(fornecimentos.stream().mapToDouble(f->f.getValor()).sum()));

    }
}
