
package modelo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Calculadora {
        
	public Calculadora(){
            
        }
        public String calcularCaloriasAlimento(double calGramo, double gramos){
            //calcula las calorias de las ccomida, recibe como parametro la caloria por unidad del alimento
            //y los gramos de alimentos, retorna la cantidad de calorias totales en la cantidad de alimento
            return ""+calGramo*gramos;
        }
        
	public double calcularCalorias(boolean masculino , double peso, double altura, int edad) {
            //calcula las calorias diarias que la persona debe consumir respecto los paramtros, sexo, 
            //peso. altura, edad
		double calorias = 0;
		if (masculino) {
			calorias = (66.4730 + (13.7516 * peso) + (5.0033 * altura) - (6.7550 * edad))*2.2;
		}
		if (!masculino) {
			calorias = 65.0955 + (9.5634 * peso) + (5.0033 * altura) - (6.7550 * edad);
		}
		return calorias;
	}

	public double calcularImc(double peso, double altura, int edad) {
            //calcula el indice de masa corporal con la altura y el peso de la persona
		double imc = 0;
		imc = peso / (altura * altura);
		imc = imc*100;
		int truncarCentesima = (int) imc;
		imc = truncarCentesima /100;
		return imc;
	}

	public int calcularEdad(String fechaNacimiento) {
            //calcula la edad respecto a la fecha de nacimietno
            //tiene como parametro una cadena con la fecha de nacimietno
		int edad = 0;
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate fechaNac = LocalDate.parse(fechaNacimiento, fmt);
		LocalDate ahora = LocalDate.now();

		Period periodo = Period.between(fechaNac, ahora);
		return periodo.getYears();
	}

}
