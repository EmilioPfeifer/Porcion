package ventanas;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class VentanaAlimentos extends JFrame implements ActionListener{
private PanelTablaAlimentos panelTablaAlimentos;
private PanelCalculadoraComida panelCalcCalorias;

public VentanaAlimentos(){
	initComponents();
	}
private void initComponents(){
//	GridLayout distribution = new GridLayout(1, 2);
	//this.setLayout(distribution);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(600,450); 
    this.setTitle("Alimento");
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    
    this.panelCalcCalorias.getBtnCalcular().addActionListener((ActionListener) this);
    this.panelTablaAlimentos.getBtnSeleccionar().addActionListener((ActionListener) this);;
    
    this.panelCalcCalorias = new PanelCalculadoraComida();
    //this.panelTablaAlimentos = new PanelTablaAlimentos();
   // this.add(this.panelTablaAlimentos ,0);
    this.add(this.panelCalcCalorias);

}

    public void actionPerformed(ActionEvent e) {
        if (this.panelCalcCalorias.getBtnCalcular() == e.getSource()) {
            
        }
        if (this.panelTablaAlimentos.getBtnSeleccionar() == e.getSource()) {
            
        }
    }
}
