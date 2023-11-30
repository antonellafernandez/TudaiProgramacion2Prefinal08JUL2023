package com.globant.mytest.prefinal08jul2023;

import java.util.ArrayList;
import java.util.Comparator;

public class ColeccionExclusiva extends Coleccion {
    public ColeccionExclusiva(String nombre) {
        super(nombre);
    }
    
    @Override
    public boolean objetoPertenece(Objeto o) {
        return false;
    }
    
    @Override
    public ArrayList<Objeto> buscar(Buscador b, Comparator c) {
        ArrayList<Objeto> salida = new ArrayList<>();
        return salida;
    }
}