package ventanas;

import datos.Datos;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
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
    private JButton volver;

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

        this.grafico = ChartFactory.createLineChart("avance por semanas", "Controles", "Kilos", graficoLineas, PlotOrientation.VERTICAL, true, true, false);

        contenedorGrafico = new ChartPanel(grafico);

        this.volver = new JButton("Volver");
        this.volver.setBounds(300, 380, 80, 20);

        this.setBackground(new Color(137, 208, 171));
        this.volver.setBackground(new Color(255, 171, 107));

        this.add(contenedorGrafico);
        this.add(volver);
    }

    public JButton getVolver() {
        return volver;
    }

    public Paciente crearPaciente(Paciente p) {
        //Gson objJson = new Gson();
        //String jsonString = this.data.obtenerPaciente();
        //Paciente p = objJson.fromJson(jsonString, Paciente.class);
        return p;
    }
}
