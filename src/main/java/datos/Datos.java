/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

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