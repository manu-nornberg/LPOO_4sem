package model;

public class Cliente implements Investidor{
    String nome, sobrenome, ticker;
    int quantidade;

    //construtores
    public Cliente(String nome, String sobrenome, String ticker, int quantidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ticker = ticker;
        this.quantidade = quantidade;
    }

    public Cliente() {
    }

    //get and set
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getTicker() {
        return ticker;
    }

    @Override
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //tostring
    @Override
    public String toString() {
        return "\nCliente= {" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", ticker='" + ticker + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }
}
