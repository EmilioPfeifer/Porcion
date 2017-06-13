
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author UsuarioWin7
 */
public class Consultorio {
    private ArrayList<Paciente> pacientes ;
    

    public Consultorio() {
    	pacientes = new ArrayList<Paciente>();

	}

 
    
    public void addPaciente(Paciente paciente){
    	if (paciente != null) {
    		this.pacientes.add(paciente);
		}else{
			throw new NullPointerException("Parametro paciente vacio");
		}
    }
}