package LegionGatito.PorcionJusta.GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaGrafico extends JFrame implements ActionListener{
	panelGrafico panelGr;
	PanelBotones panelBotones;
	public VentanaGrafico(){
		initComponents();
	}
	
	public void initComponents(){
		BorderLayout distribution = new BorderLayout();
		this.setLayout(distribution);
		this.setSize(700,500);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    this.setVisible(true);
	    
	    panelGr= new panelGrafico();
	    
	    panelBotones = new PanelBotones();
	    
	    this.panelBotones.initGraph();
	    this.panelBotones.getBtnSalir().addActionListener( (ActionListener)this);
	    this.add(panelBotones, BorderLayout.SOUTH);
	    this.add(panelGr, BorderLayout.NORTH);
	    this.setVisible(true);
	}

	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			
	        if (this.panelBotones.getBtnSalir() == e.getSource()) {
	        	
	            VentanaMostrarPaciente mp = new VentanaMostrarPaciente();
	            mp.setVisible(true);
	            this.setVisible(false);
	        }
		
	}
	
    
}
