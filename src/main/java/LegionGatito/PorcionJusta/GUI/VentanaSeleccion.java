/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LegionGatito.PorcionJusta.GUI;

import LegionGatito.PorcionJusta.Datos.DataManager;
import LegionGatito.PorcionJusta.Datos.DatosConsultorio;
import LegionGatito.PorcionJusta.Logic.Consultorio;
import LegionGatito.PorcionJusta.Logic.Paciente;
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
    private DataManager archivo;
    private DatosConsultorio subArchivo;
    private Consultorio consultorio;
    private Paciente paciente;

    public VentanaSeleccion() {
        /*String[] nombres = {"Ana", "Margarita", "Daniela", "Divian",
            "Leslie", "Paz", "Andrea", "Macarena"};
        JList lista = new JList(nombres);*/
        this.archivo = new DataManager();
        this.consultorio = new Consultorio();
        this.subArchivo = new DatosConsultorio();
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
        this.panelCombo.initSeleccion();
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
            int contador =0;
            while(this.subArchivo.obtenerPacientes()[contador] != null) {
               this.paciente = new Paciente(this.subArchivo.leerNombrePaciente(this.subArchivo.obtenerPacientes()[contador]));
               this.consultorio.add(this.paciente);
               contador++;
            }
            this.consultorio.add(paciente);
            //String nombre = (String)this.panelCombo.cmbListaPacientes.getSelectedItem();
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
