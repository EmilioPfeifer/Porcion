package LegionGatito.PorcionJusta.GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaIngreso extends JFrame implements ActionListener{
    private PanelTextos panelTextos;
    private PanelTextField panelTF;
    private PanelBotones panelBotones;
        
    public VentanaIngreso(){
        initComponents();
    }
	
    private void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(640,480); 
        this.setTitle("Ventana Ingreso");
        this.setLocationRelativeTo(null);
        BorderLayout distribution = new BorderLayout();
        this.setLayout(distribution);
            
        this.panelTextos = new PanelTextos();
        this.panelTextos.textosDatos();
        this.panelTF = new PanelTextField();
        this.panelTF.initIngresoNuevo();
        this.panelBotones = new PanelBotones();
        this.panelBotones.initIngreso();
			
        this.panelBotones.getBtnMenu().addActionListener((ActionListener)this);
        this.panelBotones.getBtnSalir().addActionListener((ActionListener)this);
			
        this.add(this.panelBotones, distribution.SOUTH);
        this.add(this.panelTextos, distribution.WEST);
        this.add(this.panelTF, distribution.CENTER);
        this.setVisible(true);		
    }

	
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (this.panelBotones.getBtnMenu() == e.getSource()) {
            VentanaInicio ini = new VentanaInicio();
            ini.setVisible(true);
            this.setVisible(false);
        }	        
        if (this.panelBotones.getBtnSalir() == e.getSource()) {
            VentanaSeleccion s = new VentanaSeleccion();
            s.setVisible(true);
            this.setVisible(false);
        }
			
    }
}
