/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;


import datos.DataManager;
import modelo.TablaAlimento;
import ventanas.VentanaAlimentos;
import ventanas.VentanaInicio;

/**
 *
 * @author p.m.h
 */
public class App {
    
    public static void main(String[] args){
        TablaAlimento t = new TablaAlimento();
        t.llenarAlimentos();
        //VentanaAlimentos va = new VentanaAlimentos();
    }
    
}
