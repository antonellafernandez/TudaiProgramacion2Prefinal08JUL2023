package com.globant.mytest.prefinal08jul2023;

import java.util.Comparator;

public class ComparadorAND implements Comparator<Objeto> {
    private Comparator c1, c2;

    public ComparadorAND(Comparator c1, Comparator c2) {
        this.c1 = c1;
        this.c2 = c2;
    }
    
    @Override
    public int compare(Objeto o1, Objeto o2) {
        int resultado = this.c1.compare(o1, o2);
        
        if (resultado == 0) {
            resultado = this.c2.compare(o1, o2);
        }
        
        return resultado;
    }
}