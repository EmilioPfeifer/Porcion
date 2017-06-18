package ventanas;

import com.google.gson.Gson;
import datos.Datos;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import modelo.Paciente;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class PanelGrafico extends JPanel {

    private JFreeChart grafico;
    private ChartPanel contenedorGrafico;
    private DefaultCategoryDataset graficoLineas;
    //private Paciente paciente;
    private Datos data;
    private Logger logger = Logger.getLogger(PanelGrafico.class.getName());

    public PanelGrafico(Paciente p) {
        initComponents(this.crearPaciente(p));

    }

    private void initComponents(Paciente p) {

        //crearPaciente();
        logger.log(Level.INFO, p.toString());
        logger.log(Level.INFO, String.valueOf(p.getControles().size()));
        this.graficoLineas = new DefaultCategoryDataset();
        for (int i = 0; i < p.getControles().size(); i++) {
            this.graficoLineas.addValue(p.getControles().get(i).getPesoControl(), p.getNombre(), p.getControles().get(i).getFechaControl());
        }

        /*
       this.graficoLineas.addValue(80, "daniela", "Semana 1");
        this.graficoLineas.addValue(70, "daniela", "Semana 2");
        this.graficoLineas.addValue(40, "daniela", "Semana 3");
        this.graficoLineas.addValue(60, "daniela", "Semana 4");
         */
        this.grafico = ChartFactory.createLineChart("avance por semanas", "Controles", "Kilos", graficoLineas, PlotOrientation.VERTICAL, true, true, false);

        contenedorGrafico = new ChartPanel(grafico);
        this.add(contenedorGrafico);
    }

    public Paciente crearPaciente(Paciente p) {
        //Gson objJson = new Gson();
        //String jsonString = this.data.obtenerPaciente();
        //Paciente p = objJson.fromJson(jsonString, Paciente.class);
        return p;
    }
}
