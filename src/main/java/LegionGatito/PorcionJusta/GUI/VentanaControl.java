package LegionGatito.PorcionJusta.GUI;

import LegionGatito.PorcionJusta.Datos.DatosConsultorio;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaControl extends JFrame implements ActionListener{
	
	private PanelBotones panelBotones;
	private PanelTextos txt;
	private PanelTextField textF; 
        private DatosConsultorio data;
	
	public VentanaControl() {
		// TODO Auto-generated constructor stub
		initComponents();
	}
	
	private void initComponents(){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(440,280); 
	    this.setTitle("Ventana Control");
	    this.setLocationRelativeTo(null);
	    BorderLayout distribution = new BorderLayout();
	    this.setLayout(distribution);
	    
	    this.txt = new PanelTextos();
	    txt.txtControl();
	    
	    this.textF = new PanelTextField();
	    textF.initControl();
	    this.add(this.txt , distribution.NORTH);
	    this.add(this.textF, distribution.CENTER);
	    
	    this.panelBotones = new PanelBotones();
	    this.panelBotones.initControl();
	    this.panelBotones.getBtnAddControl().addActionListener((ActionListener)this);
            this.panelBotones.getBtnSalir().addActionListener((ActionListener)this);
	    
	    this.add(panelBotones, distribution.SOUTH);
            this.data = new DatosConsultorio();
	    
	    
	    
	}
        public void comprovarIngreso(){
            try{
                Double.parseDouble(this.textF.ingrPeso.getText().trim().replace(",", "."));
            }catch(IllegalArgumentException e){
                JOptionPane.showMessageDialog( null, "caracter ilegal", "ERROR", JOptionPane.PLAIN_MESSAGE );
            }
        }
        
	public void actionPerformed(ActionEvent e) {
            if(this.panelBotones.getBtnAddControl() == (e.getSource())){
                if (this.textF.ingrPeso.getText().trim().equals("")) {
                    JOptionPane.showMessageDialog( null, "Bloque vacio", "", JOptionPane.PLAIN_MESSAGE );
                    return;
                }
                this.data.addControl(this.textF.ingrPeso.getText().trim());
                this.setVisible(false);
            }
            if (this.panelBotones.getBtnSalir() == (e.getSource())) {
                this.setVisible(false);
            }
	}
	
}
