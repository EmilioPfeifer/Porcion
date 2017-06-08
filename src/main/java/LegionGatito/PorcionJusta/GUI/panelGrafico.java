package LegionGatito.PorcionJusta.GUI;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class panelGrafico extends JPanel{
	JFreeChart grafico;
	ChartPanel panelGraf ;
	
	public panelGrafico(){
		initComponents();
	}
	
	private void initComponents(){
			DefaultCategoryDataset graficoLineas = new DefaultCategoryDataset();
			graficoLineas.addValue(80, "", "Semana 1");
			graficoLineas.addValue(70, "", "Semana 2");
			graficoLineas.addValue(40, "", "Semana 3");
			graficoLineas.addValue(60, "", "Semana 4");
			
			grafico = ChartFactory.createLineChart("avance por semanas", "Controles", "Kilos",graficoLineas,PlotOrientation.VERTICAL, true,true,false);
	
			panelGraf = new ChartPanel(grafico);
			this.add(panelGraf);
	}
	
}
