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

        this.panelIngDatos.getBtnAceptar().addActionListener((ActionListener) this);

        this.add(panelIngDatos);
    }

    public void actionPerformed(ActionEvent e) {
        if (this.panelIngDatos.getBtnAceptar() == e.getSource()) {
            Paciente p = new Paciente(this.panelIngDatos.getNombre().getText(),
                    this.panelIngDatos.getEstatura().getText(),
                    Double.parseDouble(this.panelIngDatos.getFechaNacimiento().getText()),
                    Double.parseDouble(this.panelIngDatos.getPeso().getText()));
            System.out.println(p);
        }
    }
}
