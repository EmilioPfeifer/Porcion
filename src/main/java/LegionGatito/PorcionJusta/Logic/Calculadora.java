/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LegionGatito.PorcionJusta.Logic;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author UsuarioWin7
 */
public class Calculadora {
	private double peso;
	private double altura;
	private int edad;
	private boolean masculino;
	private String fechaNacimiento;

	public Calculadora(double peso, double altura, String fechaNac, boolean masculino) {
		this.fechaNacimiento = fechaNac;
		this.peso = peso;
		this.altura = altura;
		this.edad = calcularEdad();
		this.masculino = masculino;
	}

	public double calcularCalorias() {
		double calorias = 0;
		if (masculino) {
			calorias = 66.4730 + (13.7516 * this.peso) + (5.0033 * this.altura) - (6.7550 * this.edad);
		}
		if (masculino) {
			calorias = 65.0955 + (9.5634 * this.peso) + (5.0033 * this.altura) - (6.7550 * this.edad);
		}
		return calorias;
	}

	public double calcularImc() {
		double imc = 0;
		imc = peso / (altura * altura);
		return imc;
	}

	public int calcularEdad() {
		int edad = 0;
		System.out.println("entro");
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate fechaNac = LocalDate.parse(fechaNacimiento, fmt);
		LocalDate ahora = LocalDate.now();

		Period periodo = Period.between(fechaNac, ahora);
		System.out.printf("Tu edad es: %s años, %s meses y %s días", periodo.getYears(), periodo.getMonths(),
				periodo.getDays());
		System.out.println(edad);
		return periodo.getYears();
	}
	
	

	public int getEdad() {
		return edad;
	}
}
