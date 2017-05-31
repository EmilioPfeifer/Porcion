/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LegionGatito.PorcionJusta.Logic;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author UsuarioWin7
 */
public class Paciente extends Persona {
    double imc;
    double caloriasDiarias;
    ArrayList<Control> controles = new ArrayList<Control>();

    public Paciente(String nombre, int edad, double estatura, String fechaNac, double peso, boolean masculino) {
        super(nombre, edad, estatura, fechaNac, peso, masculino);
    }
    
    
    public void addControl(double peso) {
        Control control = new Control(peso);
        this.controles.add(control);
    }
}
