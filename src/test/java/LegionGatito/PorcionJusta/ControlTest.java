
package LegionGatito.PorcionJusta;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import LegionGatito.PorcionJusta.modelo.Control;

public class ControlTest {
	private Control control;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		control = null;
	}

	@Test
	public void testCalcularFechaActual() {
		//hoy es  31 del 5 del año 2017
		this.control = new Control(88);
		String fechaEsperada = "31-05-2017";
		String fechaReal =control.getFechaControl();
		assertEquals(fechaEsperada, fechaReal);
		//funciono
		
	}
		
	@Test(expected = NullPointerException.class)
	public void testConstructor(){
		double peso = Double.NaN;
		this.control = new Control(peso);
		}

}
