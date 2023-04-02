package model;

public class Passaro extends Animal{
    private double z;

    //construtor da classe passaro
    public Passaro(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    //metodo mover da classe passaro
    public void mover(double x, double y, double z) {
        System.out.println("\nMoveu o passaro");
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //metodo de desenho da classe animal
    @Override
    public void desenhar() {
        System.out.println("\nDesenhou o passaro");
    }

    //tostring
    @Override
    public String toString() {
        return "\nPassaro= " + super.toString() + ", z= " + z + "}";
    }
}
