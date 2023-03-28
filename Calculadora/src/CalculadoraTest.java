import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testearSuma() {
		Calculadora calcular = new Calculadora(4,2);
		double resul=calcular.suma();
		assertEquals(6,resul);
		//fail("Not yet implemented");
	}

	@Test
	void testeoResta() {
		Calculadora calcular = new Calculadora(4,2);
		double resul=calcular.resta();
		assertEquals(2,resul);
		//fail("Not yet implemented");
	}

	@Test
	void testMultiplica() {
		Calculadora calcular = new Calculadora(4,2);
		double resul=calcular.multiplica();
		assertEquals(8,resul);
		//fail("Not yet implemented");
	}

	@Test
	void testDivide() {
		Calculadora calcular = new Calculadora(4,2);
		double resul=calcular.divide();
		assertEquals(2,resul);
		//fail("Not yet implemented");
	}

}
