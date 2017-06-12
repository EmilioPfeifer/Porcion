package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class VentanaInicio extends JFrame{
	private PanelBotonesMenu  panelBotones;
	private PanelDatosPersona panelDatos;
	
	public VentanaInicio(){
		initComponents();
	}
	private void initComponents(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(600,450); 
	    this.setTitle("Porcion Justa");
	    this.setVisible(true);
	    this.setLocationRelativeTo(null);
	  GridLayout distribution = new GridLayout(1, 2);
	    this.setLayout(distribution);

		
	    
	    this.setBackground(Color.ORANGE);
	    
	    
		this.panelBotones = new PanelBotonesMenu();
		this.panelDatos = new PanelDatosPersona();
		
		this.add(panelDatos, 0);

		this.add(panelBotones, 1);
		
	}
	
	
}
