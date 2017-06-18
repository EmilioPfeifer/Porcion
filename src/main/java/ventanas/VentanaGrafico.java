package ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.Paciente;

public class VentanaGrafico extends JFrame implements ActionListener{
	private PanelGrafico panelGrafico;
   
	
	public VentanaGrafico(Paciente p){
		initComponents(p);
              
	}
	
	private void initComponents(Paciente p){
            //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(700,500); 
	    this.setTitle("Grafico");
	    this.setVisible(true);
	    this.setLocationRelativeTo(null);
	    
	    this.panelGrafico = new PanelGrafico(p);
	    this.add(this.panelGrafico);
		
	}

    public void actionPerformed(ActionEvent ae) {
        
    }
}
