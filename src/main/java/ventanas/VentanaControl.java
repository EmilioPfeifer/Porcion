/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import datos.Datos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    private boolean comprovar(){
        //el metodo comprueba que el dato ingresado en un numero.
        //sino no se realiza la operacion del boton "aceptar"
        boolean c = true;
        try{
            Double.parseDouble(this.pnlComntrol.getIngresoPeso().getText());
        }catch(IllegalArgumentException e){
            Logger.getLogger(getClass().getName()).log(
                Level.WARNING, "Se introdujo un caracter ilegal");
            c = false;
        }
        return c;
    }
    
    public void actionPerformed(ActionEvent e) {
        if (this.pnlComntrol.getAceptar() == e.getSource()) {
            if (comprovar()) {
                double peso = Double.parseDouble(this.pnlComntrol.getIngresoPeso().getText());
                this.data.addControl(this.ctl = new Control(peso));
                this.setVisible(false);
                VentanaInicio vi = new VentanaInicio();
            }
        }
    }
}
