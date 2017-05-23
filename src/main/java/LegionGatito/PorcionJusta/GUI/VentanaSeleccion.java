/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LegionGatito.PorcionJusta.GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

/**
 *
 * @author UsuarioWin7
 */
public class VentanaSeleccion extends JFrame implements ActionListener {

    private PanelBotones panelBotones;
    private PanelTextos panelTextos;
    private PanelCombo panelCombo;

    public VentanaSeleccion() {
        String[] nombres = {"Ana", "Margarita", "Daniela", "Divian",
            "Leslie", "Paz", "Andrea", "Macarena"};
        JList lista = new JList(nombres);
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 350);
        this.setTitle("Ventana Seleccion");
        this.setLocationRelativeTo(null);
        BorderLayout distribucion = new BorderLayout();
        this.setLayout(distribucion);
        this.panelBotones = new PanelBotones();
        this.panelTextos = new PanelTextos();
        this.panelCombo = new PanelCombo();
        this.panelBotones.initSeleccion();
        this.panelBotones.getBtnAgregar().addActionListener((ActionListener) this);
        this.panelBotones.getBtnSeleccionar().addActionListener((ActionListener) this);
        this.panelBotones.getBtnMenu().addActionListener((ActionListener) this);
        this.add(this.panelCombo, distribucion.CENTER);
        this.add(this.panelBotones, distribucion.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        if (this.panelBotones.getBtnMenu() == e.getSource()) {
            VentanaInicio v = new VentanaInicio();
            v.setVisible(true);
            this.setVisible(false);
        }
        if (this.panelBotones.getBtnSeleccionar() == e.getSource()) {
            VentanaMostrarPaciente mp = new VentanaMostrarPaciente();
            mp.setVisible(true);
            this.setVisible(false);
        }
        if (this.panelBotones.getBtnAgregar() == (e.getSource())) {
            VentanaIngreso vi = new VentanaIngreso();
            vi.setVisible(true);
            this.setVisible(false);
        }
    }
}
