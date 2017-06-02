package LegionGatito.PorcionJusta.GUI;

import java.util.ArrayList;

import javax.sound.sampled.Control;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import LegionGatito.PorcionJusta.Logic.Paciente;

public class panelGrafico extends JPanel{
	JFreeChart grafico;
	ChartPanel panelGraf ;
	private Paciente paciente;
	
	public panelGrafico(){
		initComponents();
	}
	
	private void initComponents(){
			DefaultCategoryDataset graficoLineas = new DefaultCategoryDataset();
			/*
			ArrayList<LegionGatito.PorcionJusta.Logic.Control> controles = paciente.getControles();
			for (int i = 0; i < controles.size(); i++) {
				graficoLineas.addValue(controles.get(i).getPesoControl(), paciente.getNombre(), controles.get(i).getFechaControl());
			}*/
			graficoLineas.addValue(80, "daniela", "Semana 1");
			graficoLineas.addValue(70, "daniela", "Semana 2");
			graficoLineas.addValue(40, "daniela", "Semana 3");
			graficoLineas.addValue(60, "daniela", "Semana 4");
			
			grafico = ChartFactory.createLineChart("avance por semanas", "Controles", "Kilos",graficoLineas,PlotOrientation.VERTICAL, true,true,false);
	
			panelGraf = new ChartPanel(grafico);
			this.add(panelGraf);
	}
	
}
