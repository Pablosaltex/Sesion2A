package test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Sesion2.Calculadora;
class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSuma() {
		assertEquals(5,Calculadora.Suma(3, 2));
	}

	@Test
	void testResta() {
		assertEquals(6,Calculadora.Resta(8, 2));
	}

	@Test
	void testMultiplicacion() {
		assertEquals(6,Calculadora.Multiplicacion(3, 2));
	}

	@Test
	void testDivision() {
		assertEquals(2,Calculadora.Division(4, 2));
	}


	@Test
	void testDivisionpor0() {
		assertEquals(-1, Calculadora.Division(4, 0));
	}

	
}
