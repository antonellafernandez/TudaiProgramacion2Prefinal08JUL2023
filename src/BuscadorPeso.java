package com.globant.mytest.prefinal08jul2023;

public class BuscadorPeso extends Buscador {
    private double pesoBuscado;

    public BuscadorPeso(double pesoBuscado) {
        this.pesoBuscado = pesoBuscado;
    }
    
    @Override
    public boolean cumple(Objeto o) {
        return o.getPeso() < this.pesoBuscado;
    }
}