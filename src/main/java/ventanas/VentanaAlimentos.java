package ventanas;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;

public class VentanaAlimentos extends JFrame implements ActionListener {

    private PanelTablaAlimentos panelTablaAlimentos;
    private PanelCalculadoraComida panelCalcCalorias;

    public VentanaAlimentos() {
        initComponents();
    }

    private void initComponents() {
        GridLayout distribution = new GridLayout(1, 2);
        this.setLayout(distribution);
        this.setResizable(false);
        this.setSize(600, 450);
        this.setTitle("Alimento");
        this.setLocationRelativeTo(null);
        this.panelCalcCalorias = new PanelCalculadoraComida();
        this.panelTablaAlimentos = new PanelTablaAlimentos();
        this.panelCalcCalorias.getBtnCalcular().addActionListener((ActionListener) this);

        this.panelCalcCalorias.getBtnVolver().addActionListener((ActionListener) this);
        this.panelTablaAlimentos.getTFComida().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFCPresionado(evt);
            }
        });

        this.add(this.panelTablaAlimentos, 0);
        this.add(this.panelCalcCalorias, 1);
        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (this.panelCalcCalorias.getBtnCalcular() == e.getSource()) {

            int posicionAlimento = this.panelTablaAlimentos.getTablaAlimentos().getSelectedRow();
            Logger.getLogger(getClass().getName()).log(
                    Level.INFO, this.panelTablaAlimentos.alimentoDeTabla(posicionAlimento).toString());

            this.panelCalcCalorias.calcularCalorias(this.panelTablaAlimentos.alimentoDeTabla(posicionAlimento));
        }
        if (this.panelCalcCalorias.getBtnVolver() == e.getSource()) {
            VentanaInicio vi = new VentanaInicio();
            this.dispose();
        }
    }

    private void TFCPresionado(java.awt.event.KeyEvent evt) {
        String busqueda = panelTablaAlimentos.getTFComida().getText();
        Logger.getLogger(getClass().getName()).log(
                    Level.INFO, panelTablaAlimentos.getTFComida().getText());

    }
}
