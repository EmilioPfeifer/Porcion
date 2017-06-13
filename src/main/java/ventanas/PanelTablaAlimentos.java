package ventanas;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PanelTablaAlimentos extends JPanel {

    private JTable tablaAlimentos;
    private DefaultTableModel tabla;
    private JLabel buscar;
    private JTextField TFComida;
    private JScrollPane scroll;
    private Object[][] datos;

    public PanelTablaAlimentos() {
        initComponents();

    }

    private void initComponents() {
        this.setLayout(null);
        String[] titulo = {"Alimentos"};
        Object[][] datos = {{"azucar"}, {"pepino"}, {"tomate"}, {"cardo"}, {"galleta"}, {"jurel"}, {"comino"}, {"coliflor"}, {"lechuga"}, {"col"}, {"cocos"}, {"zapallo"}, {"nuez"}, {"aceite"}, {"cilantro"}, {"tocino"}, {"sardina"}, {"gato"}};
        this.tabla = new DefaultTableModel(datos, titulo) {
            @Override
            public boolean isCellEditable(int columna, int i1) {
                if (columna ==1) {
                    return true;
                }else{
                    return false;
                }
            }
        };
        
        this.tablaAlimentos = new JTable(tabla);
        this.scroll = new JScrollPane(tablaAlimentos);
        this.scroll.setPreferredSize(new Dimension(260,300 ));
        this.scroll.setBackground(new Color(137, 208, 171));
        this.buscar = new JLabel("buscar");
        this.TFComida = new JTextField();
        
        this.TFComida.setBounds(130, 40,100, 20);
        this.buscar.setBounds(80, 40, 80, 20);
        this.scroll.setBounds(10, 80, 260, 300);
        
        this.add(this.buscar);
        this.add(TFComida);
        this.add(this.scroll);

        this.setBackground(new Color(137, 208, 171));
    }

    public JTable getTablaAlimentos() {
        return tablaAlimentos;
    }

    public JTextField getTFComida() {
        return TFComida;
    }

}
