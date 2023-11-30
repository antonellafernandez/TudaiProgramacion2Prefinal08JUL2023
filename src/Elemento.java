package com.globant.mytest.prefinal08jul2023;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Elemento {
    private String nombre;

    public Elemento(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String n) {
        this.nombre = n;
    }

    public abstract int getAnio();
    public abstract int getCantidad();
    public abstract double getValor();
    public abstract double getPeso();
    public abstract boolean objetoPertenece(Objeto o);
    public abstract ArrayList<Objeto> buscar(Buscador b, Comparator c);
}