package ventanas;

import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotonesMenu extends JPanel{
	private JButton btnTablaComida;
	private JButton btnAgregarControl;
	private JButton btnGraficoControles;
	private JButton btnSalir;
	
	public PanelBotonesMenu(){
		initComponents();
	}
	private void initComponents (){
		this.setLayout(null);
		this.setSize(150,450);
		this.btnAgregarControl = new JButton("Agregar Control");
		this.btnGraficoControles = new JButton("Ver avance Grafico");
		this.btnSalir = new JButton("Salir");
		this.btnTablaComida = new JButton("Comidas y Calorias");

		this.btnTablaComida.setBounds     (110, 50, 150, 30) ;
		this.btnGraficoControles.setBounds(110, 120, 150, 30);
		this.btnAgregarControl.setBounds  (110,190,150, 30);
		this.btnSalir.setBounds		   (150,350, 80, 30);
		
		this.setBackground(new Color(137, 208, 171));
		this.btnTablaComida.setBackground(new Color(255, 171, 107));
		this.btnSalir.setBackground(new Color(255, 171, 107));
		this.btnAgregarControl.setBackground(new Color(255, 171, 107));
		this.btnGraficoControles.setBackground(new Color(255, 171, 107));
		
		this.add(btnAgregarControl);
		this.add(btnGraficoControles);
		this.add(btnTablaComida);
		this.add(btnSalir);
	}
}
