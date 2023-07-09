package com.educacionit.marielagcw;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MarielagcwApplicationTests {

	@Test
	void contextLoads() {
	}

	// Pruebas unitarias - Ejemplos

	@Test
	void prueba1() {
		//assertEquals(true, false); // Rojo
	}

	@Test
	void prueba2() {
		assertEquals(true, true); // Verde
	}

	@Test
	void prueba3() {
		assertEquals(2+2, 4); // Verde
	}

	@Test
	void prueba4() {
		//assertEquals(2+3, 4); // Rojo
	}

}
