package ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.Paciente;

public class VentanaGrafico extends JFrame implements ActionListener{
	private PanelGrafico panelGrafico;
   
	
	public VentanaGrafico(){
		initComponents();
              
	}
	
	private void initComponents(){
            //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(700,500); 
	    this.setTitle("Grafico");
	    this.setVisible(true);
	    this.setLocationRelativeTo(null);
	    
	    this.panelGrafico = new PanelGrafico();
	    this.add(this.panelGrafico);
		
	}

    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
