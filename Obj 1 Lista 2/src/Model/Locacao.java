package Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Locacao {
    private LocalDate dataLocacao;
    private static LocalDate DataDevolucao;
    private LocalTime horaLocacao, horaDevolucao;
    private Integer km;
    private Double valorCalcao, valorLocacao;
    private Boolean devolvido;


    public Locacao() {
    }

    public Locacao(LocalDate dataLocacao, LocalDate dataDevolucao, LocalTime horaLocacao, LocalTime horaDevolucao, Integer km, Double valorCalcao, Double valorLocacao, Boolean devolvido) {
        this.dataLocacao = dataLocacao;
        DataDevolucao = dataDevolucao;
        this.horaLocacao = horaLocacao;
        this.horaDevolucao = horaDevolucao;
        this.km = km;
        this.valorCalcao = valorCalcao;
        this.valorLocacao = valorLocacao;
        this.devolvido = devolvido;
    }

    public LocalDate getDataLocacao(LocalDate of) {

        return dataLocacao;
    }

    public void setDataLocacao(LocalDate dataLocacao) {

        this.dataLocacao = dataLocacao;
    }

    public static LocalDate getDataDevolucao(LocalDate of) {

        return DataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {

        DataDevolucao = dataDevolucao;
    }

    public LocalTime getHoraLocacao(LocalTime of) {

        return horaLocacao;
    }

    public void setHoraLocacao(LocalTime horaLocacao) {

        this.horaLocacao = horaLocacao;
    }

    public LocalTime getHoraDevolucao() {

        return horaDevolucao;
    }

    public void setHoraDevolucao(LocalTime horaDevolucao) {

        this.horaDevolucao = horaDevolucao;
    }

    public Integer getKm() {

        return km;
    }

    public void setKm(Integer km) {

        this.km = km;
    }

    public Double getValorCalcao() {

        return valorCalcao;
    }

    public void setValorCalcao(Double valorCalcao) {

        this.valorCalcao = valorCalcao;
    }

    public Double getValorLocacao() {

        return valorLocacao;
    }

    public void setValorLocacao(Double valorLocacao) {

        this.valorLocacao = valorLocacao;
    }

    public Boolean getDevolvido() {

        return devolvido;
    }

    public void setDevolvido(Boolean devolvido) {

        this.devolvido = devolvido;
    }

    @Override
    public String toString() {
        return "\nLocacao{" +
                "dataLocacao=" + dataLocacao +
                ", DataDevolucao=" + DataDevolucao +
                ", horaLocacao=" + horaLocacao +
                ", horaDevolucao=" + horaDevolucao +
                ", km=" + km +
                ", valorCalcao=" + valorCalcao +
                ", valorLocacao=" + valorLocacao +
                ", devolvido=" + devolvido +
                '}';
    }


    public void getDataDevolucao() {
        return;
    }
}

