package model;

public interface Associado {

    double lucros(int qdeCotas, double valorCota);
    int getQdeCotas();
    void setQdeCotas(int qdeCotas);
    double getValorCota();
    void setValorCota(double valorCota);

}
