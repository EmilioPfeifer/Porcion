/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.google.gson.Gson;
import java.util.logging.Logger;
import datos.Datos;
import java.util.ArrayList;
import java.util.logging.Level;

/**
 *
 * @author UsuarioWin7
 */
public class TablaAlimento {
    Datos data;
    private String[][] alimentos; //Pramaetro para JList
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
    /*
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
    */
    
    private void llenarArrayList() {
        String aux = "";
        this.tabAlimentos.clear();
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
    
    public String[][] nombresTodosAlimentos(){
        llenarArrayList();
        String[][] todosAlimentos = new String[tabAlimentos.size()][1];
        System.out.println(tabAlimentos.size());
        for (int i = 0; i < tabAlimentos.size(); i++) {
            todosAlimentos[i][0]=tabAlimentos.get(i).getNombre();
        }
        return todosAlimentos;
    }
    public String[][] busquedaAlimentos(String alimentoBuscar) {
        //metodo ayuda a buscar una cadena y devuelve una matriz con los posibles alimentos
        //ej:  parametro que entra es "c", devolveria coliflor, comino,coco,
        int largo = alimentoBuscar.length();
        ArrayList<String> auxBuscar = new ArrayList<String>();
        alimentoBuscar =alimentoBuscar.toLowerCase();
        
        for (int i = 0; i < tabAlimentos.size(); i++) {
            String alimentoEnTabla = tabAlimentos.get(i).getNombre();
            if(largo > alimentoEnTabla.length()){
            }else if (alimentoBuscar.equals(cortaCadena(largo, alimentoEnTabla))) {
                System.out.println(cortaCadena(largo, alimentoEnTabla));
                auxBuscar.add(alimentoEnTabla);
            }
        }
        String[][] busqueda = new String[auxBuscar.size()][1];
        for (int i = 0; i < auxBuscar.size(); i++) {
            busqueda[i][0] = auxBuscar.get(i);
        }
        //Logger.getLogger(getClass().getName()).log(
        //Level.INFO, "Fallo busqueda Alimentos");
        return busqueda;
    }

    private String cortaCadena(int largo, String palabra) {
        //corta una palabra de un largo especifico;
        String palabraCortada = "";
        for (int i = 0; i < largo; i++) {
            try{
                palabraCortada = "" + palabra.charAt(i);
            }catch(StringIndexOutOfBoundsException e){
            }
        }
        return palabraCortada.toLowerCase();
    }
}