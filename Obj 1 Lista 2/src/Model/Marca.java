package Model;

public class Marca {
    private String descricao;

    public Marca() {
    }

    public Marca(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "\nMarca{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
