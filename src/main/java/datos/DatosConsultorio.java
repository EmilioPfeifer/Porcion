/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

/**
 *
 * @author UsuarioWin7
 */
public class DatosConsultorio extends DataManager {
    
    public void addControl(String control) {
        String ARCHIVO = "C:\\Users\\UsuarioWin7\\Desktop\\pruebas\\EMILIO.txt";
        FileWriter escribir = null;

        try {
            escribir = new FileWriter(ARCHIVO, true);
            escribir.write("\r\n"+control);
        } catch (IOException e) {
            System.out.println("Problemas abriendo el archivo" + ARCHIVO);
        } finally {
            try {
                escribir.close();
            } catch (IOException ex) {
                System.out.println("Problemas cerrando el archivo " + ARCHIVO);
            }
        }
    }
}
/*
Hombres

TMB= 66,4730 + (13,7516 x Peso en Kg) + (5,0033 x Altura en Cm) – (6,7550 x edad en años)

Mujeres

TMB= 655,0955 + (9,5634 x peso en Kg) + (1,8496 x altura en Cm) – (4,6756 x edad en años)   
*/