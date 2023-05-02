package model;

public class ExcecaoEstoque extends RuntimeException {
    public ExcecaoEstoque() {
        super("Estoque insuficiente!");
    }
}