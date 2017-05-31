package LegionGatito.PorcionJusta.GUI;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelTextField extends JPanel {
	JTextField ingrNombre;
	JTextField ingrFechaNac;
	JTextField ingrEstatura;
	JTextField ingrPeso;
	
	
	public PanelTextField(){
		
	}
	
	public void initControl(){
		GridLayout distribution = new GridLayout(4, 1);
		this.setLayout(distribution);
		this.ingrPeso = new JTextField();
		this.ingrPeso.setSize(200, 15);
		this.add(this.ingrPeso);
	}
	public void initIngresoNuevo(){
		GridLayout distribution = new GridLayout(4, 0);
		this.setLayout(distribution);
		this.ingrNombre =new JTextField();
		
		this.ingrFechaNac = new JTextField();
		
		this.ingrEstatura = new JTextField();
		
		this.ingrPeso = new JTextField();
		
		
		this.add(this.ingrNombre);
		this.add(this.ingrFechaNac);
		this.add(this.ingrEstatura);
		this.add(this.ingrPeso);
			
	}
}
