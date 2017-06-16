
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author UsuarioWin7
 */
public class Control {
    Calendar fecha;
    double pesoControl;
    String fechaControl;

    public Control(double pesoControlado) {
    	if (!Double.isNaN(pesoControlado)) {
            this.fechaControl =  calcularFechaActual();
            this.pesoControl = pesoControlado;
        }else{
            throw new IllegalArgumentException("Parametro peso vacio");
        }
    	
    }
    
    public String calcularFechaActual(){
    	this.fecha = new GregorianCalendar();
        String dia = Integer.toString(fecha.get(Calendar.DATE));
        String mes = Integer.toString(fecha.get(Calendar.MONTH)+1);
        String ano = Integer.toString(fecha.get(Calendar.YEAR));
    	return dia + "-" + mes + "-" +ano;
    }

	public String getFechaControl() {
		return fechaControl;
	}

	public double getPesoControl() {
		return pesoControl;
	}

    @Override
    public String toString() {
        return "Control{" + "pesoControl=" + pesoControl + ", fechaControl=" + fechaControl + '}';
    }
}
