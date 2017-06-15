
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author UsuarioWin7
 */
public class Persona {

    private String nombre;
    private int edad;
    private double estatura;
    private String fechaNac;
    private double peso;
    private boolean masculino;

    public Persona(String nombre, int edad, double estatura, String fechaNac, double peso, boolean masculino) {
        if (nombre != null) {
            this.nombre = nombre;
            this.edad = edad;
            this.estatura = estatura;
            this.fechaNac = fechaNac;
            this.peso = peso;
            this.masculino = masculino;
        }
    }
    
    public Persona(){
        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
