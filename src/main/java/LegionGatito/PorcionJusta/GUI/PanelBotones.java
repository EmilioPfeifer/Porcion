/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LegionGatito.PorcionJusta.GUI;

import javax.swing.JPanel;
import javax.swing.JButton;

/**
 *
 * @author UsuarioWin7
 */
public class PanelBotones extends JPanel {
	private JButton btnEntrar;
	private JButton btnSalir;
	private JButton btnSeleccionar;
	private JButton btnAgregar;
	private JButton btnMenu;
	
	private JButton btnAddControl;
	private JButton btnGrafica;

	public void initInicio() {
		this.btnEntrar = new JButton("Entrar");
		this.btnSalir = new JButton("Salir");
		this.add(this.btnEntrar);
		this.add(this.btnSalir);
	}
	
	public void initControl(){
		this.btnAddControl = new JButton("Agregar");
		this.btnSalir = new JButton("Salir");
		this.add(btnAddControl);
                this.add(this.btnSalir);
	}
	public void initSeleccion() {
		//this.btnSeleccionar = new JButton("Seleccionar");

		//this.btnAgregar = new JButton("Agregar");
		this.btnMenu = new JButton("Atras");

		//this.add(this.btnSeleccionar);
		//this.add(this.btnAgregar);
		this.add(this.btnMenu);
	}

	/*public void initIngreso() {
		btnMenu = new JButton("Listo");
		this.add(this.btnMenu);
		this.btnSalir = new JButton("Salir");
		this.add(btnSalir);
	}*/
	
	public void initGraph(){
		this.btnSalir = new JButton("Salir");
		this.add(btnSalir);	
		
	}
	
	public void initMostrar(){
		this.btnGrafica = new JButton("Grafico");
		this.btnAddControl = new JButton("Agregar Control");
		
		this.add(btnAddControl);
		this.add(btnGrafica);
	}

	public JButton getBtnAddControl() {
		return btnAddControl;
	}

	public JButton getBtnGrafica() {
		return btnGrafica;
	}

	public JButton getBtnEntrar() {
		return btnEntrar;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public JButton getBtnSeleccionar() {
		return btnSeleccionar;
	}

	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	public JButton getBtnMenu() {
		return btnMenu;
	}



}
