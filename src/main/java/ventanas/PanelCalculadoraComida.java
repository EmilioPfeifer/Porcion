package ventanas;

import java.awt.Color;
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
	
		this.setLayout(null);

		this.textoIndicacion = new JLabel("ingresar las calorias a consumir");
		this.cantidadCalorias = new JTextField();
		this.btnCalcular = new JButton("Calcular");
		this.caloriasComida = new JLabel("");

		this.textoIndicacion.setBounds(50, 50, 200, 20);
		this.cantidadCalorias.setBounds(100, 90, 80, 20);
		this.btnCalcular.setBounds(90, 130, 100, 20);
		this.caloriasComida.setBounds(100, 170, 80, 20);
		
		this.add(textoIndicacion,0);
		this.add(cantidadCalorias,1);
		this.add(btnCalcular,2);
		this.add(caloriasComida,3);
                 this.setBackground(new Color(137, 208, 171));
		
	}

    public JButton getBtnCalcular() {
        return btnCalcular;
    }

    public JTextField getCantidadCalorias() {
        return cantidadCalorias;
    }
        
}
