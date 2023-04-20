package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario {
    private long id;
    private String nome, sobrenome, cpf;
    private LocalDate dataNasc;

    public Funcionario() {
    }

    public Funcionario(long id, String nome, String sobrenome, String cpf, LocalDate dataNasc) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNasc=" + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dataNasc) +
                '}';
    }
}
