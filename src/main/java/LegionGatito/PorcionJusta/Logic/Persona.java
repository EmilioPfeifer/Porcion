/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LegionGatito.PorcionJusta.Logic;

import java.util.Date;

/**
 *
 * @author UsuarioWin7
 */
public class Persona {
    public String[] data = new String[3000];
    String nombre;
    int edad;
    double estatura;
    String fechaNac;
    double peso;
    boolean masculino;

    public Persona(String nombre, int edad, double estatura, String fechaNac, double peso, boolean masculino) {
        this.nombre = nombre;
        this.data[0] = this.nombre;
        this.edad = edad;
        this.data[1] = String.valueOf(this.edad);
        this.estatura = estatura;
        this.data[2] = String.valueOf(this.estatura);
        this.fechaNac = fechaNac;
        this.data[3] = this.fechaNac;
        this.peso = peso;
        this.data[4] = String.valueOf(this.peso);
        this.masculino = masculino;
    }
    
    
}
