/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LegionGatito.PorcionJusta.GUI;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

/**
 *
 * @author UsuarioWin7
 */
public class PanelTextos extends JPanel {
    JLabel titulo;
    JLabel nombre;
    JLabel fechaNac;
    JLabel estatura;
    JLabel peso;
    JLabel txtCal;
    JLabel cal;
    
    
    String[] nombres = {"Ana","Margarita","Daniela","Divian", 
                        "Leslie","Paz","Andrea","Macarena"};
    JList lista;
    
    public void initInicio() {
        this.titulo = new JLabel("Porcion Justa");
        Font auxFont=titulo.getFont(); 
        this.titulo.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 25));
        //this.titulo.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
        this.add(this.titulo);
    }
    
   
    
    public void  textosDatos(){
    	GridLayout distribution = new GridLayout(4,1,5,5);
    	this.setLayout(distribution);
    	this.nombre = new JLabel("nombre");
    	this.fechaNac = new JLabel("Fecha de nacimiento");
    	this.estatura = new  JLabel("Estatura");
    	this.peso = new JLabel("Peso");
    	
    	this.add(this.nombre);
    	this.add(this.fechaNac);
    	this.add(this.estatura);
    	this.add(this.peso);
    	
    }
    
    public void txtControl(){
    	this.peso = new JLabel("ingrese Peso Actual");
    	
    	this.add(this.peso);
    }
    
    public void  mostrarCalor(){
    	GridLayout distribution = new GridLayout(4,1,5,5);
    	this.setLayout(distribution);
    	this.nombre = new JLabel("nombre");
    	this.fechaNac = new JLabel("Fecha de nacimiento");
    	this.estatura = new  JLabel("Estatura");
    	this.peso = new JLabel("Peso");
    	this.txtCal = new JLabel("Calorias Consumidas Diariamente");
    	this.cal = new JLabel("2000");
    	
    	this.add(this.nombre);
    	this.add(this.fechaNac);
    	this.add(this.estatura);
    	this.add(this.peso);
    
    	this.add(this.txtCal);
    	this.add(this.cal);	
    }
}
