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
public class DataManager {
    
    public void crearArchivo(String[] data, String nombre) {
        //System.out.println("Ingrese ruta completa del archivo");
        String ruta = "data/"+nombre.toUpperCase()+".txt";
        Path archivo = Paths.get(ruta);
        //System.out.println("Ingrese texto a guardar en el archivo");
        //String texto = "hola mundo\r\nhello world";
        escribir(ruta, data);
        //Files.write(archivo, texto.getBytes());
        JOptionPane.showMessageDialog( null, "Se a agregado al Usuario", "", JOptionPane.PLAIN_MESSAGE );
    }
    
    private void escribir(String ruta, String[] data) {
        String[] texto = new String[3000];
        System.arraycopy(data, 0, texto, 0, data.length);
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
    
    public void leerArchivoTxt(String nombre) {
        String[] texto = new String[3000];
        String direccion = "C:\\Users\\UsuarioWin7\\Desktop\\pruebas\\"+nombre.toUpperCase()+".txt";
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
    }
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
    /*  int pos1=str.indexOf(" ");
        System.out.println(pos1);
        int pos2=str.indexOf(" ", pos1+1);
        System.out.println(pos2);
        String subStr = str.substring(pos1,pos2);
        System.out.println(subStr);*/
}
