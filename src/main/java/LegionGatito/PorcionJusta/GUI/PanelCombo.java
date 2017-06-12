package LegionGatito.PorcionJusta.GUI;

import LegionGatito.PorcionJusta.Datos.DatosConsultorio;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class PanelCombo extends JPanel{
	JComboBox cmbListaPacientes;
        DatosConsultorio leer;
        String[] lista = new String[3000];
	
	/*public PanelCombo(){
            this.leer = new DatosConsultorio();
            //initSeleccion();
	}
	
	public void initSeleccion(){
            String[] pacientes = new String[3000];
            this.leer.leerPacientes(pacientes);
            this.cmbListaPacientes = new JComboBox();
            this.add(cmbListaPacientes);
            int contador=0;
            while(pacientes[contador] != null) {
               this.cmbListaPacientes.addItem(pacientes[contador]);
               contador++;
            }
            System.arraycopy(pacientes, 0, this.lista, 0, pacientes.length);
	}
        public void initIngreso(){
            String[] pacientes = new String[3000];
            this.leer.leerPacientes(pacientes);
            System.arraycopy(pacientes, 0, this.lista, 0, pacientes.length);
        }
}
combo = new JComboBox();
        combo.addItem("uno");
        combo.addItem("dos");
        combo.addItem("tres");
        this.cmbListaPacientes.addItem("hola");*/
}
