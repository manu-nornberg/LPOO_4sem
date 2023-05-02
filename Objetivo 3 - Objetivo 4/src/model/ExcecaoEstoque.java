package model;

public class ExcecaoEstoque extends Exception {
    public ExcecaoEstoque() {
        super("Estoque insuficiente!");
    }
}