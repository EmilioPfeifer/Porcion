package LegionGatito.PorcionJusta.GUI;

import LegionGatito.PorcionJusta.Logic.Persona;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanaIngreso extends JFrame implements ActionListener{
    private PanelTextos panelTextos;
    private PanelTextField panelTF;
    private PanelBotones panelBotones;
    private Archivador archivo;
    private Persona paciente;
        
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
        this.archivo = new Archivador();
        this.setVisible(true);		
    }

	
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (this.panelBotones.getBtnMenu() == e.getSource()) {
            if (this.panelTF.ingrNombre.getText().trim().equals("")) {
                JOptionPane.showMessageDialog( null, "Bloque vacio", "Nombre", JOptionPane.PLAIN_MESSAGE );
                return;
            }else if (this.panelTF.ingrFechaNac.getText().trim().equals("")) {
                JOptionPane.showMessageDialog( null, "Bloque vacio", "Fecha de Nacimiento", JOptionPane.PLAIN_MESSAGE );
                return;
            }else if (this.panelTF.ingrEstatura.getText().trim().equals("")) {
                JOptionPane.showMessageDialog( null, "Bloque vacio", "Estatura", JOptionPane.PLAIN_MESSAGE );
                return;
            }else if (this.panelTF.ingrPeso.getText().trim().equals("")) {
                JOptionPane.showMessageDialog( null, "Bloque vacio", "Peso", JOptionPane.PLAIN_MESSAGE );
                return;
            }
        paciente = new Persona(this.panelTF.ingrNombre.getText().trim(), 17,
        Double.parseDouble(this.panelTF.ingrEstatura.getText().trim()),
        this.panelTF.ingrFechaNac.getText().trim(),
        Double.parseDouble(this.panelTF.ingrPeso.getText().trim()),
        true);
        this.archivo.crearArchivo(this.paciente.data,this.panelTF.ingrNombre.getText().trim());
        VentanaSeleccion s = new VentanaSeleccion();
        s.setVisible(true);
        this.setVisible(false);
        }
        // otro boton
        if (this.panelBotones.getBtnSalir() == e.getSource()) {
            VentanaInicio ini = new VentanaInicio();
            ini.setVisible(true);
            this.setVisible(false);
        }
			
    }
}
