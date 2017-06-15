
package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author UsuarioWin7
 */
public class Paciente {
    private String nombre;
    private int edad;
    private double estatura;
    private String fechaNac;
    private double peso;
    private boolean masculino;
    double imc;
    double caloriasDiarias;
    private ArrayList<Control> controles = new ArrayList<Control>();
    private Calculadora calculadora ;
    
    public void addControl(double peso) {
        Control control = new Control(peso);
        this.controles.add(control);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isMasculino() {
        return masculino;
    }

    public String getFechaNac() {
        return fechaNac;
    }
   
}
