package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Corrida {
    private long id;
    private String tipoPagamento, detalhes;
    private LocalDateTime dataInicio;
    private double preco;
    private int atribute;

    //ligando motoristas e usuarios
    private Usuario usuario;
    private Motorista motorista;

    public Corrida() {
    }

    public Corrida(long id, String tipoPagamento, String detalhes, LocalDateTime dataInicio, double preco, int atribute, Usuario usuario, Motorista motorista) {
        this.id = id;
        this.tipoPagamento = tipoPagamento;
        this.detalhes = detalhes;
        this.dataInicio = dataInicio;
        this.preco = preco;
        this.atribute = atribute;
        this.usuario = usuario;
        this.motorista = motorista;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAtribute() {
        return atribute;
    }

    public void setAtribute(int atribute) {
        this.atribute = atribute;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @Override
    public String toString() {
        return "\nCorrida{" +
                "id=" + id +
                ", tipoPagamento='" + tipoPagamento + '\'' +
                ", detalhes='" + detalhes + '\'' +
                ", dataInicio=" + DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(dataInicio) +
                ", preco=" + preco +
                ", atribute=" + atribute +
                ", usuario=" + usuario +
                ", motorista=" + motorista +
                '}';
    }
}
