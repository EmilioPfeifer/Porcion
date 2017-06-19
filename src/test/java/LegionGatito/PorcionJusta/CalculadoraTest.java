
package LegionGatito.PorcionJusta;

import modelo.Alimento;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modelo.Calculadora;
import ventanas.PanelCalculadoraComida;

public class CalculadoraTest {
	private Calculadora calculadora;
        PanelCalculadoraComida panelCalcCalorias;
        Alimento alim;

    public CalculadoraTest() {
    }
        

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	//	calculadora = new Calculadora(82, 1.75, "11-11-1996", true);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected =NullPointerException.class)
        //test ingresa valores vacios, a lo cual se espera un illegalArgumentException
        public void testCalcularCaloriasAlimentoVariablesVacias(){
            double parametrVacio = Double.NaN;
            double gramos =400;
            this.calculadora.calcularCaloriasAlimento(parametrVacio,gramos);
        }
        
        @Test
        //test ingresa valores al metodo esperando tener la respuesta esperada
        public void testCalcularCaloriasAlimentos(){
            double caloriaAlimento  = 0.5;
            double gramos =400;
            double valorEsperado = 200;
            double valorReal = Double.parseDouble(this.calculadora.calcularCaloriasAlimento(caloriaAlimento, gramos));

            assertEquals(valorEsperado, valorReal,0.0);
        }
        
        @Test(expected = IllegalArgumentException.class)
        public void testCalcularCaloriasVariableVacia(){
            Boolean sexo =null;
            double peso = Double.NaN;
            double altura = Double.NaN;
            int edad = Integer.parseInt(null);
            this.calculadora.calcularCalorias(sexo, peso, altura, edad);
        }
	@Test 
	public void testCalcularEdad(){
		double peso = 84;
		double altura = 1.58;
		String fechaNac = "11-11-1996";
		boolean masculino = true;
		//calculadora = new Calculadora(peso, altura, fechaNac, masculino);
		int edadEsperada = 20;
		//int edadReal = calculadora.calcularEdad();
        //		assertEquals(edadEsperada, edadReal);
	}
	
	@Test
	public void testCalcularIMC(){
		double caloriasEsperadas = 22.0;
		double peso= 78.0;
                double altura = 1.87;
                double caloriasReales = this.calculadora.calcularImc(peso, altura);
                 assertEquals(caloriasEsperadas, caloriasReales, 0.0);
         
	}
        

	

}
