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
    String nombre;
    int edad;
    double estatura;
    Date fechaNac;
    double peso;
    boolean masculino;

    public Persona(String nombre, int edad, double estatura, Date fechaNac, double peso, boolean masculino) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.fechaNac = fechaNac;
        this.peso = peso;
        this.masculino = masculino;
    }
    
    
}
