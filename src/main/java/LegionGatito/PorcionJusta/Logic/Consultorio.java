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
    private ArrayList<Paciente> pacientes = new ArrayList<Paciente>();

    

    public Consultorio() {

	}

 
    
    public void add(Paciente pac){
        this.pacientes.add(pac);
    }
    
	public void agregarPaciente() {
    	
    }
    
    public ArrayList<Paciente> getLista() {
        return this.pacientes;
    }   
}