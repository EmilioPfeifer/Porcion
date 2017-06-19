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
            
            this.dispose();

        } else {
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

    private boolean comprovar() {
        //metodo que verifica si lo datos son compatible con las variable tipo double
        //de no ser compatible, el metodo no da el paso para continuar el algoritmo
        boolean c = false;
        try {
            Double.parseDouble(this.panelIngDatos.getEstatura().getText());
            Double.parseDouble(this.panelIngDatos.getPeso().getText());
        } catch (IllegalArgumentException e) {
            Logger.getLogger(getClass().getName()).log(
                    Level.WARNING, "Se introdujo un caracter ilegal");
            c = true;
        }
        return c;
    }

    public void actionPerformed(ActionEvent e) {

        if (this.panelIngDatos.getBtnAceptar() == e.getSource()) {

            if (this.panelIngDatos.getNombre().getText().equals("")
                    || this.panelIngDatos.getEstatura().getText().equals("")
                    || this.panelIngDatos.getPeso().getText().equals("")
                    || this.panelIngDatos.getFechaNacimiento().getText().equals("")
                    || this.comprovar()) {
                JOptionPane.showMessageDialog(null, "Ingrese Todos los campos solicitados");
            } else {
                String nombre = this.panelIngDatos.getNombre().getText();
                double estatura = Double.parseDouble(this.panelIngDatos.getEstatura().getText());
                Logger.getLogger(getClass().getName()).log(
                        Level.INFO, "texto estatura " + this.panelIngDatos.getEstatura().getText());
                double peso = Double.parseDouble(this.panelIngDatos.getPeso().getText());
                String fechaNac = this.panelIngDatos.getFechaNacimiento().getText();
                String sexo = (String) this.panelIngDatos.getComboSexo().getSelectedItem();
                Paciente p = new Paciente(nombre, estatura, fechaNac, peso, sexo);
                p.crearJson(p);
                VentanaInicio v = new VentanaInicio();
                Logger.getLogger(getClass().getName()).log(
                        Level.INFO, p.toString());
                this.setVisible(false);
            }
            if (this.panelIngDatos.getBtnCancelar() == e.getSource()) {
                System.exit(0);
            }

        }
    }
}
