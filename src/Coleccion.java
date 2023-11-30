package com.globant.mytest.prefinal08jul2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Coleccion extends Elemento {
    private ArrayList<Elemento> elems;
    private static double porcentajeExtra = 0.1;

    public Coleccion(String nombre) {
        super(nombre);
        this.elems = new ArrayList<>();
    }
    
    public ArrayList<Elemento> getElems() {
        return new ArrayList<Elemento>(this.elems);
    }
    
    public void addElem(Elemento e) {
        this.elems.add(e);
    }
    
    public static double getPorcentajeExtra() {
        return porcentajeExtra;
    }
    
    public static void setPorcentajeExtra(double pe) {
        porcentajeExtra = pe;
    }
    
    @Override
    public int getAnio() {
        int sumaAnios = 0;
        
        for (Elemento e : this.elems) {
            sumaAnios += e.getAnio();
        }
        
        int salida = sumaAnios / this.elems.size();
        
        return salida;
    }
    
    @Override
    public int getCantidad() {
        int salida = 0;
        
        for (Elemento e : this.elems) {
            salida += e.getCantidad();
        }
        
        return salida;
    }

    @Override
    public double getValor() {
        double salida = 0;
        
        for (Elemento e : this.elems) {
            salida += e.getValor();
        }
        
        salida = salida + this.getCantidad() * Coleccion.getPorcentajeExtra() / 100;
        
        return salida;
    }
    
    @Override
    public double getPeso() {
        double salida = 0;
        
        for (Elemento e : this.elems) {
            salida += e.getPeso();
        }
        
        return salida;
    }
    
    @Override
    public boolean objetoPertenece(Objeto o) {
        boolean existe = false;
        int i = 0;
        
        while (!existe && i < this.elems.size()) {
            if (this.elems.get(i).objetoPertenece(o)) {
                existe = true;
            } else {
                i++;
            }
        }
        
        return existe;
    }
    
    @Override
    public ArrayList<Objeto> buscar(Buscador b, Comparator c) {
        ArrayList<Objeto> salida = new ArrayList<>();
        
        for (Elemento e : this.elems) {
            salida.addAll(e.buscar(b, c));
        }
        
        Collections.sort(salida, c);
        return salida;
    }
}