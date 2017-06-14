/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.DataManager;

/**
 *
 * @author UsuarioWin7
 */
public class TablaAlimentoQuePase {
    DataManager data;
    private String[][] alimentos;
    private String[] lista;
    //private Alimento alimento;

    public TablaAlimentoQuePase() {
        data = new DataManager();
        this.obtenerLista();
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
}
