package ventanas;

import javax.swing.JFrame;

public class VentanaIngreso extends JFrame{
	private PanelIngresoDatos panelDatos;
	
	public VentanaIngreso(){
		initComponents();
	}
	
	private void initComponents(){
		this.panelDatos = new PanelIngresoDatos();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(600,450); 
	    this.setTitle("Porcion Justa");
	    this.setVisible(true);
	    this.setLocationRelativeTo(null);
	    
	    this.add(panelDatos);
	}
}

