package com.globant.mytest.prefinal08jul2023;

public class BuscadorAnio extends Buscador {
    private int anioBuscado;

    public BuscadorAnio(int anioBuscado) {
        this.anioBuscado = anioBuscado;
    }
    
    @Override
    public boolean cumple(Objeto o) {
        return o.getAnio() == this.anioBuscado;
    }
}