package ventanas;

import datos.Datos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Paciente;

public class VentanaIngreso extends JFrame implements ActionListener {

    private PanelIngresoDatos panelIngDatos;

    public VentanaIngreso() {
        Datos datosAux = new Datos();
                
        if (datosAux.comprobadorExistenciaArchivo()) {
            VentanaInicio vi = new VentanaInicio();
        }else{
             initComponents();
        }
       
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

            if (this.panelIngDatos.getNombre().getText() != null && this.panelIngDatos.getEstatura().getText() != null && this.panelIngDatos.getPeso().getText() != null && this.panelIngDatos.getFechaNacimiento().getText() != null) {
                String nombre = this.panelIngDatos.getNombre().getText();
                double estatura = Double.parseDouble(this.panelIngDatos.getEstatura().getText());
                 Logger.getLogger(getClass().getName()).log(
                    Level.INFO, "texto estatura "+this.panelIngDatos.getEstatura().getText());
                double peso = Double.parseDouble(this.panelIngDatos.getPeso().getText());
                String fechaNac = this.panelIngDatos.getFechaNacimiento().getText();
                String sexo = (String) this.panelIngDatos.getComboSexo().getSelectedItem();
                Paciente p = new Paciente(nombre, estatura, fechaNac, peso, sexo);
                p.crearJson(p);
                VentanaInicio v = new VentanaInicio();
                Logger.getLogger(getClass().getName()).log(
                        Level.INFO, p.toString());
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese Todos los campos solicitados");
            }

            if (this.panelIngDatos.getBtnCancelar() == e.getSource()) {
                System.exit(0);
            }

        }
    }
}
