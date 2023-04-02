package model;

public abstract class Animal {
    protected double x, y;

    //construtor
    public Animal(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //metodo mover
    public void mover(double x, double y){
        System.out.println("\nBichinho foi movido");
        this.x = x;
        this.y = y;
    }

    //metodo desenhar
    public abstract void desenhar();

    //tostring
    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y;
    }
}
