/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author UsuarioWin7
 */
public class Alimento {
    private String nombre;
    private long gr;

    public Alimento() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getGr() {
        return gr;
    }

    public void setGr(long gr) {
        this.gr = gr;
    }

    @Override
    public String toString() {
        return "Alimento{" + "nombre=" + nombre + ", gr=" + gr + '}';
    }

}
