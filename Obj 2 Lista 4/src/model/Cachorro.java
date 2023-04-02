package model;

public class Cachorro extends Animal {
    //construtor da classe animal
    public Cachorro(double x, double y) {
        super(x, y);
    }

    //metodo mover da classe animal
    @Override
    public void mover(double x, double y) {
        super.mover(x, y);
    }

    //metodo desenhar da classe animal
    @Override
    public void desenhar() {
        System.out.println("\nDesenhou o dog");
    }

    //tostring
    @Override
    public String toString() {
        return "\nCachorro= " + super.toString() + "}";
    }
}
