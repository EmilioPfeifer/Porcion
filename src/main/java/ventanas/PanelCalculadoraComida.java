package ventanas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelCalculadoraComida extends JPanel {
	private JLabel textoIndicacion;
	private JButton btnCalcular;
	private JTextField cantidadCalorias;
	private JLabel caloriasComida;

	
	
	public PanelCalculadoraComida(){
		initComponents();
	}
	
	private void initComponents(){
		GridLayout distribution = new GridLayout(4, 1);
		this.setLayout(distribution);

		this.textoIndicacion = new JLabel("ingresar las calorias a consumir");
		this.cantidadCalorias = new JTextField();
		this.btnCalcular = new JButton("Calcular");
		this.caloriasComida = new JLabel("");
	/*
		this.textoIndicacion.setBounds(50, 50, 50, 20);
		this.cantidadCalorias.setBounds(50, 90, 80, 20);
		this.btnCalcular.setBounds(50, 130, 80, 20);
		this.caloriasComida.setBounds(50, 170, 80, 20);
		*/
		this.add(textoIndicacion,0);
		this.add(cantidadCalorias,1);
		this.add(btnCalcular,2);
		this.add(caloriasComida,3);
		
	}

    public JButton getBtnCalcular() {
        return btnCalcular;
    }

    public JTextField getCantidadCalorias() {
        return cantidadCalorias;
    }
        
}
