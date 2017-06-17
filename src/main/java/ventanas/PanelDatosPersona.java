package ventanas;

import com.google.gson.Gson;
import datos.Datos;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.Paciente;

public class PanelDatosPersona extends JPanel{
    
        Datos data = new Datos();

	private JLabel nombre;
	private JLabel edad;
	private JLabel estatura;
	private JLabel peso;
	private JLabel sexo;
        private JLabel IMC;
        private JLabel contenedorImagen;
     
	
	private JLabel datoNombre;
	private JLabel datoEdad;
	private JLabel datoEstatura;
	private JLabel datoPeso;
	private JLabel datoSexo;
        private JLabel datoIMC;
        private ImageIcon imagen;
        private Icon imagenAjustada;
	
	public PanelDatosPersona() {
		initComponents();
	}
	
	private  void initComponents(){
		this.setLayout(null);
                
		this.nombre  =new JLabel("Nombre");
		this.edad = new JLabel("Edad");
		this.estatura = new JLabel("Estatura");
		this.sexo = new JLabel("Sexo");
		this.peso = new JLabel("Peso");
                this.IMC = new JLabel("IMC");
		this.setBackground(new Color (137, 208, 171));
                this.contenedorImagen = new JLabel();
                
                this.imagen =new ImageIcon("img/imcTable.png");
		
                this.imagenAjustada = new ImageIcon(imagen.getImage().getScaledInstance(253,140,  Image.SCALE_DEFAULT ));
                this.contenedorImagen.setIcon(imagenAjustada);
                
		this.nombre.setForeground(Color.WHITE);
		this.edad.setForeground(Color.WHITE);
		this.estatura.setForeground(Color.WHITE);
		this.sexo.setForeground(Color.WHITE);
		this.peso.setForeground(Color.WHITE);
                this.IMC.setForeground(Color.WHITE);
		
		this.edad.setBounds(50, 40, 80, 20);
		this.nombre.setBounds(50, 80, 80, 20);
		this.estatura.setBounds(50, 120, 80, 20);
		this.peso.setBounds(50, 160, 80, 20);
		this.sexo.setBounds(50,200, 80, 20);
                this.IMC.setBounds(50, 240, 80, 20);
                this.contenedorImagen.setBounds(40,255, 253, 150);
		
		this.add(this.edad);
		this.add(this.nombre);
		this.add(this.estatura);
		this.add(this.peso);
		this.add(this.sexo);
                this.add(this.IMC);
                this.add(this.contenedorImagen);
                
                initDatos(this.crearPaciente());
                

	}
        
        private void initDatos(Paciente p){
            this.datoEdad = new JLabel(String.valueOf(p.getEdad()));
            this.datoNombre = new JLabel(p.getNombre());
            this.datoEstatura = new JLabel(String.valueOf(p.getEstatura()));
            this.datoPeso = new JLabel(String.valueOf(p.getPeso()));
            this.datoSexo = new JLabel();
            this.datoIMC = new JLabel(String.valueOf(p.getIMC()));
            
            this.datoEdad.setForeground(Color.WHITE);
            this.datoNombre.setForeground(Color.WHITE);
            this.datoEstatura.setForeground(Color.WHITE);
            this.datoPeso.setForeground(Color.WHITE);
            this.datoSexo.setForeground(Color.WHITE);
            this.datoIMC.setForeground(Color.WHITE);
            
            this.datoEdad.setBounds(200, 40, 80, 20);
            this.datoNombre.setBounds(200, 80, 80, 20);
            this.datoEstatura.setBounds(200, 120, 80, 20);
            this.datoPeso.setBounds(200, 160, 80, 20);
            this.datoSexo.setBounds(200, 200, 80, 20);
            this.datoIMC.setBounds(200, 240, 80, 20);
            
            this.add(this.datoEdad);
            this.add(this.datoNombre);
            this.add(this.datoEstatura);
            this.add(this.datoPeso);
            this.add(this.datoSexo);
            this.add(this.datoIMC);
        }
        
        private Paciente crearPaciente(){
            Gson objJson = new Gson();
            String jsonString = this.data.obtenerPaciente();
            Paciente p = objJson.fromJson(jsonString, Paciente.class);
            System.out.println(p);
            return p;
        }
}
