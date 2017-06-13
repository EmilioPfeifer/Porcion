
package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author UsuarioWin7
 */
public class Paciente extends Persona {
    double imc;
    double caloriasDiarias;
    private ArrayList<Control> controles = new ArrayList<Control>();
    private Calculadora calculadora ;

    public Paciente(String nombre, int edad, double estatura, String fechaNac, double peso, boolean masculino) {
        super(nombre, edad, estatura, fechaNac, peso, masculino);
    	calculadora = new Calculadora(peso, estatura, fechaNac, masculino);
    	this.edad = calculadora.calcularEdad();
    	this.imc = calculadora.calcularImc();
        this.caloriasDiarias = calculadora.calcularCalorias();
    }

    public Paciente(String[] datos) {
        super(datos);
    }
    
    public void addControl(double peso) {
        Control control = new Control(peso);
        this.controles.add(control);
    }

    public double getImc() {
        return imc;
    }

    public double getCaloriasDiarias() {
        return caloriasDiarias;
    }

    public String[] getData() {
        return data;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public ArrayList<Control> getControles() {
		return controles;
	}

	public double getEstatura() {
        return estatura;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isMasculino() {
        return masculino;
    }
    
}
