/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import datos.Datos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.Control;

/**
 *
 * @author p.m.h
 */
public class VentanaControl extends JFrame implements ActionListener {
    private PanelControl pnlComntrol;
    private Datos data = new Datos();
    private Control ctl;
    
    public VentanaControl(){
        initComponents();
    }
    
    private void initComponents(){
        this.setSize(340,200); 
        this.setTitle("Grafico");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
            
        this.setResizable(false);
        this.pnlComntrol = new PanelControl();
        this.pnlComntrol.getAceptar().addActionListener((ActionListener) this);
        this.add(this.pnlComntrol);
        
    }

    public void actionPerformed(ActionEvent e) {
        if (this.pnlComntrol.getAceptar() == e.getSource()) {
            double peso = Double.parseDouble(this.pnlComntrol.getIngresoPeso().getText());
            this.data.addControl(this.ctl = new Control(peso));
            this.setVisible(false);
        }
    }
}
