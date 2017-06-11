package ventanas;

import javax.swing.JFrame;

public class VentanaGrafico extends JFrame {
	private PanelGrafico panelGrafico;
	
	public VentanaGrafico(){
		initComponents();
	}
	
	private void initComponents(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(700,500); 
	    this.setTitle("Grafico");
	    this.setVisible(true);
	    this.setLocationRelativeTo(null);
	    
	    this.panelGrafico = new PanelGrafico();
	    this.add(this.panelGrafico);
		
	}
}
