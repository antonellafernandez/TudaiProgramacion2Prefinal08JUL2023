package com.globant.mytest.prefinal08jul2023;

import java.util.Comparator;

public class ComparadorMarca implements Comparator<Objeto> {
    @Override
    public int compare(Objeto o1, Objeto o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}