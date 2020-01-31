package es.Studium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CajaBlanca {

	@Test
	void testCamino1() {
		String resultadoEsperado = "Agosto tiene: 31 d�as";
		String resultadoReal= Ejercicio5.diasDeMes("Agosto");
		assertEquals(resultadoEsperado, resultadoReal);
	}
		
	@Test
	void testCamino2() {
		String resultadoEsperado = "Junio tiene: 30 d�as";
		String resultadoReal= Ejercicio5.diasDeMes("Junio");
		assertEquals(resultadoEsperado, resultadoReal);
	}
		
	@Test
	void testCamino3() {
		String resultadoEsperado = "Febrero tiene: 28 d�as o 29 d�as (en a�o bisiesto)";
		String resultadoReal= Ejercicio5.diasDeMes("Febrero");
		assertEquals(resultadoEsperado, resultadoReal);
	}
		
	@Test
	void testCamino4() {
		String resultadoEsperado = "No has especificado un mes v�lido";
		String resultadoReal= Ejercicio5.diasDeMes("Javier");
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
