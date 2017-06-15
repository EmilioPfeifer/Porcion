package datos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import modelo.Alimento;
import modelo.Paciente;
import modelo.Persona;

/**
 *
 * @author p.m.h
 */
public class DatosJSon {



    public void serializar() {
        Paciente p1 = new Paciente();
       
        Gson objJson = new Gson();
        String jsonString = objJson.toJson(p1);
        System.out.println(jsonString);

    }

    public void deserializar() {
        Persona p1 = new Persona();
        //p1.setId(1);
        p1.setNombre("Juan");
        //p1.setApellidos("Lopez");
        //p1.setFechaNacimiento("12-12-2016");
        Gson objJson = new Gson();
        String jsonString = objJson.toJson(p1);
        Persona p2 = objJson.fromJson(jsonString,
                Persona.class);
        System.out.println(p2);
    }

    public void persistenciaJsonPersona(Paciente p) {
        FileWriter writer;
        try {
            writer = new FileWriter("data/"+p.getNombre().toUpperCase()+".json");
            Gson gson = new GsonBuilder().create();
            gson.toJson(p, writer);
            writer.close();
        } catch (IOException ex) {
            System.out.println("Erro al manejar el archivo");
        }
    }

    public ArrayList<Alimento> recuperarDatosAlimento() {
       ArrayList<Alimento> alimentos = new ArrayList<Alimento>();
        try {
            Reader reader = new FileReader("data/output.json");
            Gson gson = new Gson();
            JsonArray 
            
<<<<<<< HEAD
            //return features;
=======
>>>>>>> f1552558d38ceb02ceed9dbaceeb452c4f88c775
        } catch (FileNotFoundException e) {
            System.out.println("archivo no encontrado");
            
        }
        return null; 
    }
    public Alimento recuperarDatosPersona() {
        try {
            Reader reader = new FileReader("data/output.json");
            Gson gson = new Gson();
            Alimento features = gson.fromJson(reader, Alimento.class);
            return features;
        } catch (FileNotFoundException e) {
            System.out.println("archivo no encontrado");
            
        }
        return null;
    }
}
