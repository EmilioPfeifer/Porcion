package ventanas;



import java.awt.Color;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class PanelGrafico extends JPanel{
	JFreeChart grafico;
	ChartPanel contenedorGrafico ;
        DefaultCategoryDataset graficoLineas;

	
	public PanelGrafico(){
		initComponents();
	}
	
	private void initComponents(){
		this.graficoLineas= new DefaultCategoryDataset();
		this.graficoLineas.addValue(80, "daniela", "Semana 1");
		this.graficoLineas.addValue(70, "daniela", "Semana 2");
		this.graficoLineas.addValue(40, "daniela", "Semana 3");
		this.graficoLineas.addValue(60, "daniela", "Semana 4");
		
		this.grafico = ChartFactory.createLineChart("avance por semanas", "Controles", "Kilos",graficoLineas,PlotOrientation.VERTICAL, true,true,false);

                
                contenedorGrafico = new ChartPanel(grafico);
		this.add(contenedorGrafico);
	}
}
