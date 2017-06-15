package ventanas;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelIngresoDatos extends JPanel {

	private JLabel TextNombre;
	private JLabel TextFechaNacimietno;
	private JLabel TextEstatura;
	private JLabel TextPeso;
	private JTextField nombre;
	private JTextField fechaNacimiento;
	private JTextField estatura;
	private JTextField peso;
        private JButton btnAceptar;
        private JButton btnCancelar;
        

	public PanelIngresoDatos() {
		initComponents();
	}

	private void initComponents() {
		this.setLayout(null);

		this.TextNombre = new JLabel("Nombre");
		this.TextFechaNacimietno = new JLabel("Fecha de Nacimiento");
		this.TextEstatura = new JLabel("Estatura");
		this.TextPeso = new JLabel("Peso");

		this.nombre = new JTextField();
		this.fechaNacimiento = new JTextField();
		this.estatura = new JTextField();
		this.peso = new JTextField();
                this.btnAceptar = new JButton("Aceptar");
                this.btnCancelar = new JButton("Cancelar");

		this.TextNombre.setBounds(50, 50, 100, 20);
		this.TextFechaNacimietno.setBounds(50, 80, 100, 20);
		this.TextEstatura.setBounds(50, 110, 100, 20);
		this.TextPeso.setBounds(50, 140, 100, 20);

		this.nombre.setBounds(190, 50, 100, 20);
		this.estatura.setBounds(190, 80, 100, 20);
		this.fechaNacimiento.setBounds(190, 110, 100, 20);
		this.peso.setBounds(190, 140, 100, 20);
		this.btnAceptar.setBounds(100, 190, 90, 20);
                this.btnCancelar.setBounds(200, 190, 90, 20);
                
		this.setBackground(new Color(137, 208, 171));

		this.add(this.TextNombre);
		this.add(this.TextFechaNacimietno);
		this.add(this.TextEstatura);
		this.add(this.TextPeso);
		this.add(this.nombre);
		this.add(this.estatura);
		this.add(this.fechaNacimiento);
		this.add(this.peso);
                this.add(this.btnAceptar);
                this.add(this.btnCancelar);

	}

    public JTextField getNombre() {
        return nombre;
    }

    public JTextField getFechaNacimiento() {
        return fechaNacimiento;
    }

    public JTextField getEstatura() {
        return estatura;
    }

    public JTextField getPeso() {
        return peso;
    }

    public JButton getBtnAceptar() {
        return btnAceptar;
    }

    public void setNombre(JTextField nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(JTextField fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEstatura(JTextField estatura) {
        this.estatura = estatura;
    }

    public void setPeso(JTextField peso) {
        this.peso = peso;
    }
        
}
