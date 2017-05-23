/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LegionGatito.PorcionJusta.GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author UsuarioWin7
 */
public class VentanaInicio extends JFrame implements ActionListener{
    
    private PanelBotones panelBotones;
    private PanelTextos panelTextos;
    
    public VentanaInicio() {
        initComponents();
        //this.setLocationRelativeTo(null);
    }
    
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(640,480); 
        this.setLocationRelativeTo(null);
        BorderLayout distribucion = new BorderLayout();
        this.setLayout(distribucion);
        this.panelTextos = new PanelTextos();
        this.panelTextos.initInicio();
        this.panelBotones = new PanelBotones();
        this.panelBotones.initInicio();
        
        this.panelBotones.getBtnEntrar().addActionListener( (ActionListener)this);
        this.panelBotones.getBtnSalir().addActionListener( (ActionListener)this);
        this.add(this.panelTextos, distribucion.CENTER);
        this.add(this.panelBotones, distribucion.SOUTH);
        this.setVisible(true);
    }
    
    public void mostrar(){
        this.setVisible(true);
    }

    
    public void actionPerformed(ActionEvent e) {
        if (this.panelBotones.getBtnEntrar() == e.getSource()) {
            VentanaSeleccion s = new VentanaSeleccion();
            s.setVisible(true);
            this.setVisible(false);
        }
        
        if (this.panelBotones.getBtnSalir() == e.getSource()) {
            System.exit(0);
        }
    }
}
