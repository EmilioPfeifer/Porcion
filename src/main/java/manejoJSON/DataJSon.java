package manejoJSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import modelo.Alimento;
import modelo.Persona;

/**
 *
 * @author p.m.h
 */
public class DataJSon {



    public void serializar() {
        Alimento alimento = new Alimento();
        p1.setId(1);
        p1.setNombres("Juan");
        p1.setApellidos("Lopez");
        p1.setFechaNacimiento("12-12-2016");
        Gson objJson = new Gson();
        String jsonString = objJson.toJson(p1);
        System.out.println(jsonString);

    }

    public void deserializar() {
      Alimento alimento = new Alimento();
        alimento.setNombre(nombre);
        p1.setNombres("Juan");
        p1.setApellidos("Lopez");
        p1.setFechaNacimiento("12-12-2016");
        Gson objJson = new Gson();
        String jsonString = objJson.toJson(p1);
        Persona p2 = objJson.fromJson(jsonString,
                Persona.class);
        System.out.println(p2);
    }

    public void persistenciaJson() {
        Persona p = new Persona();
        p.setId(1);
        p.setNombres("Juan");
        p.setApellidos("Lopez");
        p.setFechaNacimiento("12-12-2016");
        FileWriter writer;
        try {
            writer = new FileWriter("data/output.json");
            Gson gson = new GsonBuilder().create();
            gson.toJson(p, writer);
            writer.close();
        } catch (IOException ex) {
            System.out.println("Erro al manejar el archivo");
        }
    }

    public void mostrarPersona() {
        Persona p = recuperarDatos();
        System.out.println(p.getId() + "-" + p.getNombres() + "-" + p.getFechaNacimiento() + "-");
    }

    public Persona recuperarDatosAlimentos() {
        try {
            Reader reader = new FileReader("data/output.json");
            Gson gson = new Gson();
            Alimeto features = gson.fromJson(reader, Persona.class);
            return features;
        } catch (FileNotFoundException e) {
            System.out.println("archivo no encontrado");
            
        }
        return null;

        
    }
}
