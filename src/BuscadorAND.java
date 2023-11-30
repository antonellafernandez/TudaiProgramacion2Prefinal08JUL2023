package com.globant.mytest.prefinal08jul2023;

public class BuscadorAND extends Buscador {
    private Buscador b1, b2;

    public BuscadorAND(Buscador b1, Buscador b2) {
        this.b1 = b1;
        this.b2 = b2;
    }
    
    @Override
    public boolean cumple(Objeto o) {
        return b1.cumple(o) && b2.cumple(o);
    }
}