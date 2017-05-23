package LegionGatito.PorcionJusta.GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class VentanaMostrarPaciente extends JFrame implements ActionListener{
	private PanelTextos panelTextos;
	private PanelBotones panelBotones;
	
	public VentanaMostrarPaciente(){
		initComponents();
	}
	
	private void initComponents(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(640,480); 
        this.setTitle("Ventana Paciente");
        this.setLocationRelativeTo(null);
        BorderLayout distribucion = new BorderLayout();
        this.setLayout(distribucion);
        
        this.panelTextos = new PanelTextos();
        this.panelTextos.mostrarCalor();
        
        
        this.panelBotones = new PanelBotones();
        
        this.panelBotones.initMostrar();
        
        this.panelBotones.getBtnGrafica().addActionListener((ActionListener)this);
        this.panelBotones.getBtnMenu().addActionListener( (ActionListener)this);
        this.panelBotones.getBtnAddControl().addActionListener((ActionListener)this);
        this.add(this.panelTextos, distribucion.CENTER);
        this.add(panelBotones, distribucion.SOUTH);
        
        this.setVisible(true);
	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 if (this.panelBotones.getBtnMenu()== e.getSource()) {
	            VentanaInicio vi = new VentanaInicio();
	            vi.setVisible(true);
	            this.setVisible(false);
	        }
	        
	        if (this.panelBotones.getBtnGrafica()== e.getSource()) {
	            VentanaGrafico vg = new VentanaGrafico();
	            vg.setVisible(true);
	            this.setVisible(false);
	        }
	        
	        if(this.panelBotones.getBtnAddControl() == (e.getSource())){
	        	VentanaControl vc = new VentanaControl();
	        	vc.setVisible(true);
	        }
	        
		
	}
}
