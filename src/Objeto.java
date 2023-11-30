package com.globant.mytest.prefinal08jul2023;

import java.util.ArrayList;
import java.util.Comparator;

public class Objeto extends Elemento {
    private String marca;
    private int anio;
    private double valor, peso;

    public Objeto(String marca, int anio, double valor, double peso, String nombre) {
        super(nombre);
        this.marca = marca;
        this.anio = anio;
        this.valor = valor;
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    @Override
    public int getAnio() {
        return this.anio;
    }
    
    public void setAnio(int a) {
        this.anio = a;
    }
    
    @Override
    public int getCantidad() {
        return 1;
    }

    @Override
    public boolean objetoPertenece(Objeto o) {
        boolean existe = false;
        
        if (o.getNombre().equalsIgnoreCase(this.getNombre()) 
                && o.getMarca().equalsIgnoreCase(this.getMarca())
                && o.getValor() == this.getValor()
                && o.getAnio() == this.getAnio()
                && o.getPeso() == this.getPeso()) {
            existe = true;
        }
        
        return existe;
    }
    
    @Override
    public ArrayList<Objeto> buscar(Buscador b, Comparator c) {
        ArrayList<Objeto> salida = new ArrayList<>();
        
        if (b.cumple(this)) {
            salida.add(this);
        }
        
        return salida;
    }
}