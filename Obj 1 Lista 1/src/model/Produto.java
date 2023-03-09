package model;

public class Produto { //classe produto encapsulada
     private String nome;
     private String descricao;
     private Double valor;
     private Integer estoque;

    //construtor padrao
    public Produto(){ //construtor padrao

    }

    //construtor parametizado
    public Produto(String nome, String descricao, Double valor, Integer estoque) { //construtor parametizado
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
    }

    //Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        int estoqueNovo = this.estoque + estoque;
        if(estoqueNovo > 0){
            this.estoque=estoque;
        }
    }

    //toString
    @Override
    public String toString() {
        return "\nProduto{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", estoque=" + estoque +
                '}';
    }
}
