/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Control;
import modelo.Paciente;

/**
 *
 * @author UsuarioWin7
 */
public class Datos {
    public String[] leerAlimentos() {
        String[] texto = new String[3000];
        String[] aux;
        String direccion = "data\\listaComida.txt";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String bfRead;
            int contador=0;
            int pos;
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
    //aqui se crea el el archivo con todo los json
    /*public void setJson(Alimento a){
        FileWriter writer;
        try{
            writer = new FileWriter("data\\Alimentos.json", true);
            writer.write("\r\n");
            Gson gson = new GsonBuilder().create();
            gson.toJson(a, writer);
            writer.close();
            
        }catch (IOException e){
            System.out.println("Error");
        }
    }*/
    
    public String[] leerArchivo() {
        String[] texto = new String[3000];
        String direccion = "data\\Alimentos.json";
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
    
    public void addControl(Control control) {
        FileWriter writer;
        try{
            writer = new FileWriter("data\\Control.json", true);
            writer.write("\r\n");
            Gson gson = new GsonBuilder().create();
            gson.toJson(control, writer);
            writer.close();
            
        }catch (IOException e){
            Logger.getLogger(getClass().getName()).log(
            Level.INFO, "No se añadio el control");
        }
    }
    public void firstControl(Control control) {
        FileWriter writer;
        try{
            writer = new FileWriter("data\\Control.json");
            Gson gson = new GsonBuilder().create();
            gson.toJson(control, writer);
            writer.close();
            
        }catch (IOException e){
            Logger.getLogger(getClass().getName()).log(
            Level.INFO, "No se añadio el control");
        }
    }
    public String[] obtenerControles() {
        String[] texto = new String[3000];
        String direccion = "data\\Control.json";
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
            Logger.getLogger(getClass().getName()).log(
            Level.INFO, "Fallo obtencion de controles");
        }
        return texto;
    }
    public void addPaciente(Paciente paciente){
        FileWriter writer;
        try{
            writer = new FileWriter("data\\Paciente.json");
            Gson gson = new GsonBuilder().create();
            gson.toJson(paciente, writer);
            writer.close();
        }catch(IOException e){
            Logger.getLogger(getClass().getName()).log(
            Level.INFO, "Fallo escrbir en paciente");
        }
    }
    
    public boolean comprobadorExistenciaArchivo(){
        String direccionPaciente = "data/Paciente.json";
        File   ficheroAux = new File(direccionPaciente);
        boolean existe = false;
        if (ficheroAux.exists()) {
            existe = true;
        }else{
            existe = false;
        }
        Logger.getLogger(getClass().getName()).log(
            Level.INFO, existe+"");
        return existe;
    }
    public boolean comprobadorExistenciaArrayJson(){
        String direccionPaciente = "data/Control.json";
        File   ficheroAux = new File(direccionPaciente);
        boolean existe = false;
        if (ficheroAux.exists()) {
            existe = true;
        }else{
            existe = false;
        }
        Logger.getLogger(getClass().getName()).log(
            Level.INFO, existe+"");
        return existe;
    }
    public String obtenerPaciente() {
        String texto = "";
        String direccion = "data\\Paciente.json";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String bfRead;
            while((bfRead = bf.readLine()) != null) {
               texto=bfRead;
            }
            bf.close();
        }catch(IOException e){
            Logger.getLogger(getClass().getName()).log(
            Level.INFO, "Fallo obtencion datos Paciente");
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