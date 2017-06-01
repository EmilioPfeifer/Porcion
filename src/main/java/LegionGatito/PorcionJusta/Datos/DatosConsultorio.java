/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LegionGatito.PorcionJusta.Datos;

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
    public void buscarControl() {
        
    }
    
    public void leerPacientes(String[] paciente) {
        String[] texto = new String[3000];
        String direccion = "C:\\Users\\UsuarioWin7\\Desktop\\pruebas\\Pacientes.txt";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String bfRead;
            int contador=0;
            while((bfRead = bf.readLine()) != null) {
               texto[contador]=bfRead;
               paciente[contador] = texto[contador];
               contador++;
            }
            bf.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog( null, "No existe", "ERROR", JOptionPane.PLAIN_MESSAGE );
        }
    }
    public void reescribirPaciente(String[] data, String nuevo) {
        //System.out.println("Ingrese ruta completa del archivo");
        String ruta = "C:\\Users\\UsuarioWin7\\Desktop\\pruebas\\Pacientes.txt";
        Path archivo = Paths.get(ruta);
        //System.out.println("Ingrese texto a guardar en el archivo");
        //String texto = "hola mundo\r\nhello world";
        escribirPaciente(ruta, data, nuevo);
        //Files.write(archivo, texto.getBytes());
    }
    private void escribirPaciente(String ruta, String[] data, String nuevo) {
        String[] texto = new String[3000];
        System.arraycopy(data, 0, texto, 0, data.length);
        try{
            BufferedReader bf = new BufferedReader(new FileReader(ruta));
            String bfRead;
            int contador=0;
            while((bfRead = bf.readLine()) != null) {
               texto[contador]=bfRead;
               contador++;
            }if (texto[contador]==null) {
               texto[contador] = nuevo;
            }
            bf.close();
        }catch(IOException e){
        }
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));
            int contador=0;
            while(texto[contador] != null) {
               //texto[contador]=bfRead;
               bw.write(texto[contador]);
               bw.newLine();
               contador++;
            }
            bw.close();
        }catch(IOException e){
        }
    }
    public String[] leerNombrePaciente(String nombre) {
        String[] texto = new String[3000];
        String direccion = "C:\\Users\\UsuarioWin7\\Desktop\\pruebas\\"+nombre+".txt";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String bfRead;
            int contador=0;
            while((bfRead = bf.readLine()) != null) {
               texto[contador]=bfRead;
               //paciente[contador] = texto[contador];
               //System.out.println(paciente[contador]);
               contador++;
            }
            bf.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog( null, "No existe", "ERROR", JOptionPane.PLAIN_MESSAGE );
        }
        return texto;
    }
    public String[] obtenerPacientes() {
        String[] texto = new String[3000];
        String direccion = "C:\\Users\\UsuarioWin7\\Desktop\\pruebas\\Pacientes.txt";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String bfRead;
            int contador=0;
            while((bfRead = bf.readLine()) != null) {
               texto[contador]=bfRead;
               contador++;
            }
            bf.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog( null, "No existe", "ERROR", JOptionPane.PLAIN_MESSAGE );
        }
        return texto;
    }
}
/*
Hombres

TMB= 66,4730 + (13,7516 x Peso en Kg) + (5,0033 x Altura en Cm) – (6,7550 x edad en años)

Mujeres

TMB= 655,0955 + (9,5634 x peso en Kg) + (1,8496 x altura en Cm) – (4,6756 x edad en años)   
*/
