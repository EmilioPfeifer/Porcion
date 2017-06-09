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
		if (fechaNac != null) {
			if (!Double.isNaN(altura) && !Double.isNaN(peso)) {
				this.fechaNacimiento = fechaNac;
				this.peso = peso;
				this.altura = altura;
				this.edad = calcularEdad();
				this.masculino = masculino;
			} else {
					throw new IllegalArgumentException("double vacio");
			}

		} else {
			throw new NullPointerException("String Vacio");
		}

	}

	public double calcularCalorias() {
		double calorias = 0;
		if (masculino) {
			calorias = 66.4730 + (13.7516 * this.peso) + (5.0033 * this.altura) - (6.7550 * this.edad);
		}
		if (!masculino) {
			calorias = 65.0955 + (9.5634 * this.peso) + (5.0033 * this.altura) - (6.7550 * this.edad);
		}
		System.out.println(calorias);
		return calorias;
	}

	public double calcularImc() {
		double imc = 0;
		imc = peso / (altura * altura);
		imc = imc*100;
		int truncarCentesima = (int) imc;
		imc = truncarCentesima /100;
		return imc;
	}

	public int calcularEdad() {
		int edad = 0;
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate fechaNac = LocalDate.parse(fechaNacimiento, fmt);
		LocalDate ahora = LocalDate.now();

		Period periodo = Period.between(fechaNac, ahora);
		return periodo.getYears();
	}

	public int getEdad() {
		return edad;
	}
}
