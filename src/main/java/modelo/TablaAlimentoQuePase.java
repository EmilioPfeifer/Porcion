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

    public TablaAlimentoQuePase() {
        data = new DataManager();
        this.obtenerLista();
    }
    
    public void obtenerLista(){
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
        int contador=0;
        int corte=-1;
        this.alimentos = new String[this.lista.length][1];
        for (int i = 0; i < this.lista.length-1; i++) {
            corte = this.lista[i].lastIndexOf("\\");
            this.alimentos[i][0] = this.lista[i].substring(0, corte-1);
            System.out.println(this.alimentos[i][0]);
        }
    }
}
