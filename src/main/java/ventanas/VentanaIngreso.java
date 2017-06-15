package ventanas;

import datos.Datos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.Paciente;

public class VentanaIngreso extends JFrame implements ActionListener {

    private PanelIngresoDatos panelIngDatos;

    public VentanaIngreso() {
        initComponents();
    }

    private void initComponents() {
        this.panelIngDatos = new PanelIngresoDatos();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setTitle("Porcion Justa");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        this.panelIngDatos.getBtnAceptar().addActionListener((ActionListener) this);

        this.panelIngDatos.getBtnCancelar().addActionListener((ActionListener) this);
        this.add(panelIngDatos);
    }

    public void actionPerformed(ActionEvent e) {

        
        if (this.panelIngDatos.getBtnAceptar() == e.getSource()) {
            
            String nombre = this.panelIngDatos.getNombre().getText();
           double estatura=  Double.parseDouble(this.panelIngDatos.getEstatura().getText());
          double peso= Double.parseDouble(this.panelIngDatos.getPeso().getText()) ;
          String fechaNac = this.panelIngDatos.getFechaNacimiento().getText();
           String sexo = (String) this.panelIngDatos.getComboSexo().getSelectedItem();
            
            Paciente p= new Paciente(nombre, estatura, fechaNac, peso, sexo);
        }
          if (this.panelIngDatos.getBtnCancelar()== e.getSource()) {
               System.exit(0);
        }
        
    }
}
