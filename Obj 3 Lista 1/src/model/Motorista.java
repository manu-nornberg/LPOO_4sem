package model;

import java.util.ArrayList;
import java.util.List;

public class Motorista {
    private long id;
    private String nome, email, telefone;

    //ligando corrida e veiculo com motorista
    private List<Corrida> corridas = new ArrayList<>();
    private Veiculo veiculo;

    public Motorista() {
    }

    public Motorista(long id, String nome, String email, String telefone, List<Corrida> corridas, Veiculo veiculo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.corridas = corridas;
        this.veiculo = veiculo;
    }

    public Motorista(long id, String nome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public Motorista(long id, String nome, String email, String telefone, Veiculo veiculo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.veiculo = veiculo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Corrida> getCorridas() {
        return corridas;
    }

    public void setCorridas(List<Corrida> corridas) {
        this.corridas = corridas;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public String toString() {
        return "Motorista{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", veiculo=" + veiculo +
                '}';
    }
}
