package ventanas;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class VentanaInicio extends JFrame implements ActionListener, Job {

    private PanelBotonesMenu panelBotones;
    private PanelDatosPersona panelDatos;
    private SystemTray systemTray;
    private  TareaSemanalQuartz tareaQuartz;

    public VentanaInicio() {
        initComponents();

    }

    private void initComponents() {

        this.setSize(600, 450);
        this.setTitle("Porcion Justa");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        GridLayout distribution = new GridLayout(1, 2);
        this.setResizable(false);
        this.setLayout(distribution);

        this.setBackground(Color.ORANGE);
        this.setIconImage(null);
        this.panelBotones = new PanelBotonesMenu();
        this.panelDatos = new PanelDatosPersona();
        this.systemTray = new SystemTray(this);

        this.panelBotones.getBtnAgregarControl().addActionListener((ActionListener) this);
        this.panelBotones.getBtnGraficoControles().addActionListener((ActionListener) this);
        this.panelBotones.getBtnSalir().addActionListener((ActionListener) this);
        this.panelBotones.getBtnTablaComida().addActionListener((ActionListener) this);
        this.add(panelDatos, 0);
        this.add(panelBotones, 1);

        
        this.systemTray.systemTray();
        this.tareaQuartz= new TareaSemanalQuartz();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (this.panelBotones.getBtnAgregarControl() == e.getSource()) {
            VentanaControl vc = new VentanaControl();
            this.setVisible(false);
            this.dispose();

        }
        if (this.panelBotones.getBtnTablaComida() == e.getSource()) {
            VentanaAlimentos va = new VentanaAlimentos();
            this.dispose();
        }
        if (this.panelBotones.getBtnGraficoControles() == e.getSource()) {
            VentanaGrafico vg = new VentanaGrafico(this.panelDatos.paciente);
            this.dispose();
        }
        if (this.panelBotones.getBtnSalir() == e.getSource()) {
            System.exit(0);

        }
    }

    public void execute(JobExecutionContext jec) throws JobExecutionException {
        this.systemTray.MensajeTrayIcon("Dia del control", TrayIcon.MessageType.WARNING);
    }
}
