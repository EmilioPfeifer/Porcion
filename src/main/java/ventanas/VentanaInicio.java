package ventanas;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

import javax.swing.JFrame;

public class VentanaInicio extends JFrame implements ActionListener {
    
    private PanelBotonesMenu panelBotones;
    private PanelDatosPersona panelDatos;
    private SystemTray systemTray;
    private PopupMenu popUP;
    private Image image;    
    private MenuItem menuSalir;    
    
    public VentanaInicio() {
        initComponents();
        if (SystemTray.isSupported()) {
            systemTray = SystemTray.getSystemTray();
            this.image = new ImageIcon(getClass().getResource("img/iconImage.png")).getImage();
        }
    }
    private void initComponents() {
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 450);
        this.setTitle("Porcion Justa");
        
        this.setLocationRelativeTo(null);
        GridLayout distribution = new GridLayout(1, 2);
        this.setLayout(distribution);
        
        this.setBackground(Color.ORANGE);
        
        this.panelBotones = new PanelBotonesMenu();
        this.panelDatos = new PanelDatosPersona();
        
        this.panelBotones.getBtnAgregarControl().addActionListener((ActionListener) this);
        this.panelBotones.getBtnGraficoControles().addActionListener((ActionListener) this);
        this.panelBotones.getBtnSalir().addActionListener((ActionListener) this);
        this.panelBotones.getBtnTablaComida().addActionListener((ActionListener) this);
        this.add(panelDatos, 0);
        this.add(panelBotones, 1);
        this.setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent e) {
        if (this.panelBotones.getBtnAgregarControl() == e.getSource()) {
            VentanaControl vc = new VentanaControl();
        }
        if (this.panelBotones.getBtnTablaComida() == e.getSource()) {
            VentanaAlimentos va = new VentanaAlimentos();
        }
        if (this.panelBotones.getBtnGraficoControles() == e.getSource()) {
            VentanaGrafico vg = new VentanaGrafico();
            
        }
        if (this.panelBotones.getBtnSalir() == e.getSource()) {
            System.exit(0);
        }
        
    }
    
}
