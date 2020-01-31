package es.Studium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CajaBlanca {

	@Test
	void testCamino1() {
		String resultadoEsperado = "Agosto tiene: 31 días";
		String resultadoReal= Ejercicio5.diasDeMes("Agosto");
		assertEquals(resultadoEsperado, resultadoReal);
	}
		
	@Test
	void testCamino2() {
		String resultadoEsperado = "Junio tiene: 30 días";
		String resultadoReal= Ejercicio5.diasDeMes("Junio");
		assertEquals(resultadoEsperado, resultadoReal);
	}
		
	@Test
	void testCamino3() {
		String resultadoEsperado = "Febrero tiene: 28 días o 29 días (en año bisiesto)";
		String resultadoReal= Ejercicio5.diasDeMes("Febrero");
		assertEquals(resultadoEsperado, resultadoReal);
	}
		
	@Test
	void testCamino4() {
		String resultadoEsperado = "No has especificado un mes válido";
		String resultadoReal= Ejercicio5.diasDeMes("Javier");
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
