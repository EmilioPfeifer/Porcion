/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LegionGatito.PorcionJusta.Logic;

import java.util.ArrayList;

/**
 *
 * @author UsuarioWin7
 */
public class Consultorio {
    ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
    Calculadora calculadora;

    public Consultorio() {
       
    }
    
    public void add(Paciente pac){
        this.pacientes.add(pac);
    }
    
    
    public double calcularIMC(){
        return this.pacientes.get(0).imc;
    }
    
    public double calDiarias() {
        return this.pacientes.get(0).caloriasDiarias;
    }
    
    public void agregarPersona() {
        
    }
    
    public ArrayList<Paciente> getLista() {
        return this.pacientes;
    }   
}