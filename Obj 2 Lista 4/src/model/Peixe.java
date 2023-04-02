package model;

public class Peixe extends Animal{
    private double z;

    //construtor da classe peixe
    public Peixe(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    //metodo mover da classe peixe
    public void mover(double x, double y, double z) {
        System.out.println("\nMoveu o peixe");
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //metodo desenhar da classe animal
    @Override
    public void desenhar() {
        System.out.println("\nDesenhou o peixe");
    }

    //tostring
    @Override
    public String toString() {
        return "\nPeixe= " + super.toString() + ", z= " + z + "}";
    }
}
