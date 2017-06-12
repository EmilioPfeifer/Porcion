package ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class VentanaIngreso extends JFrame implements ActionListener {

    private PanelIngresoDatos panelDatos;

    public VentanaIngreso() {
        initComponents();
    }

    private void initComponents() {
        this.panelDatos = new PanelIngresoDatos();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setTitle("Porcion Justa");
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        this.panelDatos.getBtnAceptar().addActionListener((ActionListener) this);

        this.add(panelDatos);
    }

    public void actionPerformed(ActionEvent e) {
        if (this.panelDatos.getBtnAceptar() == e.getSource()) {

        }
    }
}
