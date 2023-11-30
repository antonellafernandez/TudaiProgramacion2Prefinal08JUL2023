package com.globant.mytest.prefinal08jul2023;

public class BuscadorMarca extends Buscador {
    private String marcaBuscada;

    public BuscadorMarca(String marcaBuscada) {
        this.marcaBuscada = marcaBuscada;
    }
    
    @Override
    public boolean cumple(Objeto o) {
        return o.getMarca().equals(this.marcaBuscada);
    }
}