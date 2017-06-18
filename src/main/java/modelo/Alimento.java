
package modelo;


public class Alimento {
    private String nombre;
    private double caloria;

    public Alimento(String nombre, double caloria) {
        this.nombre = nombre;
        this.caloria = caloria;
    }

    public Alimento() {
    }

    public String getNombre() {
        return nombre;
    }

    public double getCaloria() {
        return caloria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCaloria(double caloria) {
        this.caloria = caloria;
    }

    @Override
    public String toString() {
        return "Alimento{" + "nombre=" + nombre + ", caloria=" + caloria + '}';
    }
/*
    public void setGr(long gr) {
        this.gr = gr;
    }

    //@Override
    //public String toString() {
        //return "Alimento{" + "nombre=" + nombre + ", gr=" + gr + '}';
    //}

//=======
    public double getCaloria() {
        return caloria;
    }
    
    
    
//>>>>>>> 5637d981a3766c3f5e6eb32081740e33a639cc37
=======
>>>>>>> 594cbbecef5561823645b13b7a1ee3bce70d832c
        */
}
