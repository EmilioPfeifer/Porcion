/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import datos.Datos;
import java.util.ArrayList;

/**
 *
 * @author UsuarioWin7
 */
public class TablaAlimento {
    Datos data;
    private String[][] alimentos;
    private String[] lista;
    private ArrayList<Alimento> tabAlimentos;
    private Alimento alimento;

    public TablaAlimento() {
        data = new Datos();
        this.obtenerLista();
        this.tabAlimentos = new ArrayList<Alimento>();
    }
    
    private void obtenerLista(){
        //this.alimentos[0] = this.data.leerAlimentos()[0];
        this.lista = new String[this.obtenerLargo()];
        System.arraycopy(this.data.leerAlimentos(), 5, this.lista, 0, this.lista.length);
    }
    
    private int obtenerLargo(){
        int x=0;
        while(this.data.leerAlimentos()[x]!=null){
            x++;
        }
        return x-5;
    }
    public void llenarAlimentos(){
        this.obtenerLista();
        int contador=0;
        int corte=-1;
        int fin=-1;
        this.alimentos = new String[this.lista.length][2];
        for (int i = 0; i < this.lista.length; i++) {
            corte = this.lista[i].lastIndexOf("\\");
            fin = this.lista[i].lastIndexOf("");
            this.alimentos[i][0] = this.lista[i].substring(0, corte-1);
            this.alimentos[i][1] = this.lista[i].substring(corte+1, fin);
            //se instancia la clase alimento por cada alimento en el txt,
            //luego se envia a un metodo en data manager para que lo escriba
            //en un archivo .json
            //this.alimento = new Alimento(this.alimentos[i][0], Double.parseDouble(this.alimentos[i][1]));
            //this.data.setJson(alimento);
        }
    }
    
    public void llenarArrayList() {
        String aux = "";
        int cont=0;
        while(this.data.leerArchivo()[cont]!=null){
            Gson objJson = new Gson();
            aux = this.data.leerArchivo()[cont];
            String jsonString = aux;
            Alimento alim = objJson.fromJson(jsonString, Alimento.class);
            this.tabAlimentos.add(alim);
            //System.out.println(alim);
            cont++;
        }
    }
    public String[][] busquedaAlimentos(String alimentoBuscar) {
        //metodo ayuda a buscar una cadena y devuelve una matriz con los posibles alimentos
        int largo = alimentoBuscar.length();
        ArrayList<String> auxBuscar = new ArrayList<String>();

        for (int i = 0; i < tabAlimentos.size(); i++) {
            String alimentoEnTabla = tabAlimentos.get(i).getNombre();
            if (alimentoBuscar.equals(cortaCadena(largo, alimentoEnTabla))) {
                auxBuscar.add(alimentoEnTabla);
            }
        }

        String[][] busqueda = new String[auxBuscar.size()][1];
        for (int i = 0; i < auxBuscar.size(); i++) {
            busqueda[i][0] = auxBuscar.get(i);
        }
        return busqueda;
    }

    private String cortaCadena(int largo, String palabra) {
        //corta una palabra de un largo especifico;
        String palabraCortada = "";
        for (int i = 0; i < largo; i++) {
            palabraCortada += "" + palabra.charAt(i);
        }
        return palabraCortada;
    }
    /*
    public void delArchivo() {
        FileReader reader = null;
        int caracter;
        String aux = "";
        try{
           reader = new FileReader("data\\output.json");
           caracter = reader.read();
           while (caracter != -1) {
           aux = aux+String.valueOf((char) caracter);
           caracter = reader.read();
           }
        }catch (IOException e){
            
        }finally{
            try{
                reader.close();
            }catch(IOException e){
                
            }
            Gson objJson = new Gson();
            String jsonString = aux;
        
            Persona p2 = objJson.fromJson(jsonString, Persona.class);
            System.out.println(p2);
        }
    }
    */
}
