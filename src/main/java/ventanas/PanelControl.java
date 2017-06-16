package ventanas;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class PanelControl extends JPanel{
	private JLabel texto;
	private JTextField ingresoPeso;
	private JButton aceptar;
	
	public PanelControl(){
            initComponents();
	}
	
	private void initComponents(){
		//BorderLayout distribution = new BorderLayout();
		this.setLayout(null);
		
		this.texto = new JLabel("ingrese su peso actual");
		this.texto.setBounds(100, 20, 200, 20);
		this.ingresoPeso = new JTextField();
		this.ingresoPeso.setBounds(120, 50, 90, 20);
		this.aceptar = new JButton("Aceptar");
		this.aceptar.setBounds(125, 100, 80, 20);
		
		this.setBackground(new Color(137, 208, 171));
		this.aceptar.setBackground(new Color (255, 171, 107));

		this.ingresoPeso.setMaximumSize(getSize());
		this.ingresoPeso.setMinimumSize(getSize());
		
		this.add(texto);
		this.add(ingresoPeso);
		this.add(aceptar);
		
		
		
	}

    public JTextField getIngresoPeso() {
        return ingresoPeso;
    }

    public JButton getAceptar() {
        return aceptar;
    }
	
}
