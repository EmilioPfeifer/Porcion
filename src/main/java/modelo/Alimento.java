/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
<<<<<<< HEAD
 * @author UsuarioWin7
 */
/*public class Alimento {
    private String nombre;
    private long gr;

    public Alimento() {
=======
 * @author p.m.h
 */
public class Alimento {
    private String nombre;
    private double caloria;

    public Alimento(String nombre, double caloria) {
        this.nombre = nombre;
        this.caloria = caloria;
//>>>>>>> 5637d981a3766c3f5e6eb32081740e33a639cc37
    }

    public String getNombre() {
        return nombre;
    }

//<<<<<<< HEAD
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*public long getGr() {
        return gr;
    }

    public void setGr(long gr) {
        this.gr = gr;
    }*/

    //@Override
    //public String toString() {
        //return "Alimento{" + "nombre=" + nombre + ", gr=" + gr + '}';
    //}

//=======
    public double getCaloria() {
        return caloria;
    }
    
    
    
//>>>>>>> 5637d981a3766c3f5e6eb32081740e33a639cc37

    public void setCaloria(double caloria) {
        this.caloria = caloria;
    }
}
