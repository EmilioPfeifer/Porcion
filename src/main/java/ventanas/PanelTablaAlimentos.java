package ventanas;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class PanelTablaAlimentos extends JPanel {
	private JTable tablaAlimentos;
	private JLabel textComida;
	private JTextField comida;
	private JButton btnSeleccionar;
	
	public PanelTablaAlimentos(){
		initComponents();
		
	}
	 
	private void initComponents(){
		
		this.setLayout(null);
		this.tablaAlimentos = new JTable();
		this.tablaAlimentos.setBounds(50, 50, 100, 150);
		this.add(tablaAlimentos);
		
		
		//this.setBackground(new Color(137, 208, 171));
		
	}

    public JTable getTablaAlimentos() {
        return tablaAlimentos;
    }

    public JTextField getComida() {
        return comida;
    }

    public JButton getBtnSeleccionar() {
        return btnSeleccionar;
    }
	
}
