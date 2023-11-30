package com.globant.mytest.prefinal08jul2023;

public class BuscadorNOT extends Buscador {
    private Buscador b;

    public BuscadorNOT(Buscador b) {
        this.b = b;
    }
    
    @Override
    public boolean cumple(Objeto o) {
        return !b.cumple(o);
    }
}