package LegionGatito.PorcionJusta.GUI;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class PanelCombo extends JPanel{
	JComboBox cmbListaPacientes;
	
	public PanelCombo(){
		initSeleccion();
	}
	
	public void initSeleccion(){
		String[] pacientes = {"Ana", "Isabel", "Ignacio", "David"};
		this.cmbListaPacientes = new JComboBox(pacientes);
		this.add(cmbListaPacientes);
	}
}
/*combo = new JComboBox();
        combo.addItem("uno");
        combo.addItem("dos");
        combo.addItem("tres");
        this.cmbListaPacientes.addItem("hola");*/
