package com.exercicio2;

public class CalcPotencia {
    private double tensao;
    private double corrente;
    private double potencia;

    public double getTensao() {
        return tensao;
    }
    public void setTensao(double tensao) {
        this.tensao = tensao;
    }
    public double getCorrente() {
        return corrente;
    }
    public void setCorrente(double corrente) {
        this.corrente = corrente;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public CalcPotencia() {}

    public double calcularPotencia( double tensao, double corrente) {
        setPotencia(tensao * corrente);
        return potencia;
    }
}   