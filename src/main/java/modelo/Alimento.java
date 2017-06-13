/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author p.m.h
 */
public class Alimento {
    private String nombre;
    private double caloria;

    public Alimento(String nombre, double caloria) {
        this.nombre = nombre;
        this.caloria = caloria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCaloria() {
        return caloria;
    }
    
    
}
