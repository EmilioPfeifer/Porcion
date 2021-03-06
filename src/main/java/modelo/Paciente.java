
package modelo;

import com.google.gson.Gson;
import datos.Datos;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Paciente {
    private Datos data = new Datos();
    
    private String nombre;
    private int edad;
    private double estatura;
    private String fechaNac;
    private double peso;
    private boolean masculino;
    double imc;
    double caloriasDiarias;
    
    private ArrayList<Control> controles = new ArrayList<Control>();
    public Calculadora calculadora ;
    
    
    public Paciente(String nombre, double estatura, String fechaNac, double peso, String masculino) {
        this.nombre = nombre;
        this.estatura = estatura;
        this.fechaNac = fechaNac;
        this.peso = peso;
        this.masculino = comprobarMasculino(masculino);
        this.calculadora = new Calculadora();
        this.edad = calculadora.calcularEdad(this.fechaNac);
        this.imc = this.calculadora.calcularImc(this.peso, this.estatura);
        this.caloriasDiarias =this.calculadora.calcularCalorias(this.masculino, this.peso, this.estatura, this.edad);
        if (this.data.comprobadorExistenciaArrayJson()) {
        }else{
            Control c = new Control(this.peso);
            this.data.firstControl(c);
        }
        this.llenarArrayList();
    }


    
    private boolean comprobarMasculino(String masculino){
        boolean sexo = true;
        if (masculino.equals("Femenino")) {
            return false;
        }
        return sexo;
    }
    
    public void addControl(double peso) {
        Control control = new Control(peso);
        this.data.addControl(control);
        this.controles.add(control);
    }
    public void llenarArrayList() {
        String aux = "";
        int cont=0;
        while(this.data.obtenerControles()[cont]!=null){
            Gson objJson = new Gson();
            aux = this.data.obtenerControles()[cont];
            String jsonString = aux;
            Control control = objJson.fromJson(jsonString, Control.class);
            this.controles.add(control);
            cont++;
        }
    }
    
    public void crearJson(Paciente p){
        Logger.getLogger(getClass().getName()).log(
        Level.INFO, p.toString());

        this.data.addPaciente(p);
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
    
    public double getIMC() {
        return this.imc;
    }

    public double getCaloriasDiarias() {
        return caloriasDiarias;
    }

    public ArrayList<Control> getControles() {
        return controles;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public void setCaloriasDiarias(double caloriasDiarias) {
        this.caloriasDiarias = caloriasDiarias;
    }
    
    

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + ", fechaNac=" + fechaNac + ", peso=" + peso + ", masculino=" + masculino + ", imc=" + imc + ", caloriasDiarias=" + caloriasDiarias + '}';
    }

    /*@Override
    public String toString() {
        return "Paciente{" + "data=" + data + ", nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + ", fechaNac=" + fechaNac + ", peso=" + peso + ", masculino=" + masculino + ", imc=" + imc + ", caloriasDiarias=" + caloriasDiarias + ", controles=" + controles + ", calculadora=" + calculadora + '}';
    }*/
    

    
}
