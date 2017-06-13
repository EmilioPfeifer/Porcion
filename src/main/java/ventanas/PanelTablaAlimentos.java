package ventanas;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PanelTablaAlimentos extends JPanel {

    private JTable tablaAlimentos;
    DefaultTableModel tabla;
    private JLabel textComida;
    private JTextField comida;
    private JButton btnSeleccionar;
    JScrollPane scroll;

    public PanelTablaAlimentos() {
        initComponents();

    }

    private void initComponents() {
        this.setLayout(null);
        String[] titulo = {"Alimentos","num","num"};
        Object[][] datos ={{"pollo",1,2},{"perro",1,2}};
       DefaultTableModel tab = new DefaultTableModel(datos, titulo);
        this.tablaAlimentos = new JTable(tab);
        this.scroll = new JScrollPane(tablaAlimentos);
        this.scroll.setPreferredSize(new Dimension(400,150));
        
        
        this.add(this.scroll);

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
