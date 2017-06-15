/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import javax.swing.JFrame;

/**
 *
 * @author p.m.h
 */
public class VentanaControl extends JFrame{
    private PanelControl pnlComntrol;
    
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
        this.add(this.pnlComntrol);
        
    }
}
