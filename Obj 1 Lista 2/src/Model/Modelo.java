package Model;

public class Modelo {
    private String Modelo;

    public Modelo(String modelo) {
        Modelo = modelo;
    }

    public Modelo() {
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    @Override
    public String toString() {
        return "\nModelo{" +
                "Modelo='" + Modelo + '\'' +
                '}';
    }
}
