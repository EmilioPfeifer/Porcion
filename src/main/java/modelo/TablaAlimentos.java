/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author p.m.h
 */
public class TablaAlimentos {

    private ArrayList<Alimento> tabAlimentos;

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
}
