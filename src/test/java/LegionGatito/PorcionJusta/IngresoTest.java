/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LegionGatito.PorcionJusta;

import modelo.Paciente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ventanas.PanelIngresoDatos;

/**
 *
 * @author UsuarioWin7
 */
public class IngresoTest {
    PanelIngresoDatos panel;
    Paciente p;
    
    public IngresoTest() {
        panel = new PanelIngresoDatos();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void ingresoTest() {
        String nul="10";
        String f = this.panel.getFechaNacimiento().getText();
        String n =this.panel.getNombre().getText();
        this.panel.getPeso().setText(nul);
        this.panel.getEstatura().setText(nul);
        Double.parseDouble(this.panel.getEstatura().getText());
        Double.parseDouble(this.panel.getPeso().getText());
    }
}
