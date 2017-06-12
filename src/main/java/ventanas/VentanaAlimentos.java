package ventanas;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class VentanaAlimentos extends JFrame {
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
    
    this.panelCalcCalorias = new PanelCalculadoraComida();
    //this.panelTablaAlimentos = new PanelTablaAlimentos();
   // this.add(this.panelTablaAlimentos ,0);
    this.add(this.panelCalcCalorias);

}
}
