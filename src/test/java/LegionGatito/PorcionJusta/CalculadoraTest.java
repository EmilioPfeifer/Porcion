package LegionGatito.PorcionJusta;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import LegionGatito.PorcionJusta.Logic.Calculadora;

public class CalculadoraTest {
	private Calculadora calculadora;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		calculadora = new Calculadora(82, 1.75, "11-11-1996", true);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConstructorStringVacio() {
		double peso = 84;
		double altura = 1.58;
		String fechaNac = null;
		boolean masculino = true;
		calculadora = new Calculadora(peso, altura, fechaNac, masculino);
	}
	@Test
	public void testConstructorDoubleVacio() {
		double peso = 84;
		double altura = Double.NaN;
		String fechaNac = "11-11-1996";
		boolean masculino = true;
		calculadora = new Calculadora(peso, altura, fechaNac, masculino);
	}

	@Test 
	public void testCalcularEdad(){
		double peso = 84;
		double altura = 1.58;
		String fechaNac = "11-11-1996";
		boolean masculino = true;
		calculadora = new Calculadora(peso, altura, fechaNac, masculino);
		int edadEsperada = 20;
		int edadReal = calculadora.calcularEdad();
		assertEquals(edadEsperada, edadReal);
	}
	
	@Test
	public void testCalcularIMC(){
		double caloriasEsperadas = 26.77;
		double caloriasReales = this.calculadora.calcularImc();
		assertEquals(caloriasEsperadas, caloriasReales, 0.0);
		
	}
	

}
