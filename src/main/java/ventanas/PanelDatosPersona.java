package ventanas;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelDatosPersona extends JPanel{

	private JLabel nombre;
	private JLabel edad;
	private JLabel estatura;
	private JLabel peso;
	private JLabel sexo;
	
	private JLabel datoNombre;
	private JLabel datoEdad;
	private JLabel datoEstatura;
	private JLabel datoPeso;
	private JLabel datoSexo;
	
	public PanelDatosPersona() {
		initComponents();
	}
	
	private  void initComponents(){
		this.setLayout(null);
		
		this.nombre  =new JLabel("Nombre");
		this.edad = new JLabel("Edad");
		this.estatura = new JLabel("Estatura");
		this.sexo = new JLabel("Sexo");
		this.peso = new JLabel("Peso");
		this.setBackground(new Color (137, 208, 171));
		
		this.nombre.setForeground(Color.WHITE);
		this.edad.setForeground(Color.WHITE);
		this.estatura.setForeground(Color.WHITE);
		this.sexo.setForeground(Color.WHITE);
		this.peso.setForeground(Color.WHITE);
		
		this.edad.setBounds(50, 50, 80, 20);
		this.nombre.setBounds(50, 90, 80, 20);
		this.estatura.setBounds(50, 130, 80, 20);
		this.peso.setBounds(50, 170, 80, 20);
		this.sexo.setBounds(50,210, 80, 20);
		
		this.add(this.edad);
		this.add(this.nombre);
		this.add(this.estatura);
		this.add(this.peso);
		this.add(this.sexo);
		
		
	}
	

}
