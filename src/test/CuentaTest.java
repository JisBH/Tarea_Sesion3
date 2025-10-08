package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import paquete.Cuenta;

class CuentaTest {
	
	static Cuenta cuenta, cuenta2, cuenta3;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta = new Cuenta("","",0.0);
		cuenta2 = new Cuenta("12345","",50.0);
		cuenta3 = new Cuenta("67890","",0.0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta.setSaldo(0.0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		cuenta.ingresar(500.0);
		assertEquals(500.0,cuenta.getSaldo());
	}
	
	@Test
	void testRetirar() {
		cuenta.retirar(500.0);
		assertEquals(-500.0,cuenta.getSaldo());
	}
	
	@Test
	void testInstruccionesCuenta2() {
		cuenta2.retirar(200.0);
		cuenta2.ingresar(100.0);
		cuenta2.retirar(200.0);
		assertEquals(-250.0,cuenta2.getSaldo());
	}
	
	@Test
	void testInstruccionesCuenta3() {
		cuenta3.retirar(350.0);
		cuenta3.retirar(200.0);
		cuenta3.retirar(150.0);
		cuenta3.ingresar(50.0);
		cuenta3.retirar(100.0);
		assertEquals(-450.0,cuenta3.getSaldo());
	}

}
