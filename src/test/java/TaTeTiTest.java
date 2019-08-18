package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.java.TaTeTi;

public class TaTeTiTest {
	TaTeTi miJuego;

	@Before
	public void before(){
		miJuego = new TaTeTi();
	}

	@Test
	public void ganaXenDiagonalPrincipal(){
		assertFalse(miJuego.huboGanador());
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 0);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 1);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 1);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 2);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 2);
		assertTrue(miJuego.huboGanador());
		assertEquals("X", miJuego.obtenerJugadorActual());
	}
	@Test
	public void ganaOenDiagonalPrincipal(){
		assertFalse(miJuego.huboGanador());
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 1);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 0);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 2);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 1);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 1);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 2);
		assertTrue(miJuego.huboGanador());
		assertEquals("O", miJuego.obtenerJugadorActual());
	}
	@Test
	public void ganaXenDiagonalSecundaria(){
		assertFalse(miJuego.huboGanador());
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 2);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 1);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 1);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 2);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 0);
		assertTrue(miJuego.huboGanador());
		assertEquals("X", miJuego.obtenerJugadorActual());
	}
	@Test
	public void ganaOenDiagonalSecundaria(){
		assertFalse(miJuego.huboGanador());
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 1);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 2);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 2);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 1);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 0);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 0);
		assertTrue(miJuego.huboGanador());
		assertEquals("O", miJuego.obtenerJugadorActual());
	}
	@Test
	public void ganaXenPrimeraFila(){
		assertFalse(miJuego.huboGanador());
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 0);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 2);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 1);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 1);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 2);
		assertTrue(miJuego.huboGanador());
		assertEquals("X", miJuego.obtenerJugadorActual());
	}
	@Test
	public void ganaOenPrimeraFila(){
		assertFalse(miJuego.huboGanador());
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 0);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 2);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 1);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 1);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 2);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 0);
		assertTrue(miJuego.huboGanador());
		assertEquals("O", miJuego.obtenerJugadorActual());
	}
	@Test
	public void ganaXenSegundoFila(){
		assertFalse(miJuego.huboGanador());
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 0);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 2);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 1);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 1);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 2);
		assertTrue(miJuego.huboGanador());
		assertEquals("X", miJuego.obtenerJugadorActual());
	}
	@Test
	public void ganaOenSegundaFila(){
		assertFalse(miJuego.huboGanador());
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 0);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 0);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 1);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 1);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 2);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 2);
		assertTrue(miJuego.huboGanador());
		assertEquals("O", miJuego.obtenerJugadorActual());
	}
	@Test
	public void ganaXenTerceraFila(){
		assertFalse(miJuego.huboGanador());
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 0);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 2);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 1);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 1);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 2);
		assertTrue(miJuego.huboGanador());
		assertEquals("X", miJuego.obtenerJugadorActual());
	}
	@Test
	public void ganaOenTerceraFila(){
		assertFalse(miJuego.huboGanador());
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 0);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 0);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 1);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 1);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 2);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 2);
		assertTrue(miJuego.huboGanador());
		assertEquals("O", miJuego.obtenerJugadorActual());
	}
	@Test
	public void ganaXenPrimeraColumna(){
		assertFalse(miJuego.huboGanador());
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 0);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 2);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 0);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 1);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 0);
		assertTrue(miJuego.huboGanador());
		assertEquals("X", miJuego.obtenerJugadorActual());
	}
	@Test
	public void ganaOenPimeraColumna(){
		assertFalse(miJuego.huboGanador());
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 1);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 0);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 1);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 0);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 2);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 0);
		assertTrue(miJuego.huboGanador());
		assertEquals("O", miJuego.obtenerJugadorActual());
	}
	@Test
	public void ganaXenSegundaColumna(){
		assertFalse(miJuego.huboGanador());
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 1);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 2);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 1);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 2);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 1);
		assertTrue(miJuego.huboGanador());
		assertEquals("X", miJuego.obtenerJugadorActual());
	}
	@Test
	public void ganaOenSegundaColumna(){
		assertFalse(miJuego.huboGanador());
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 0);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 1);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 2);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 1);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 2);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 1);
		assertTrue(miJuego.huboGanador());
		assertEquals("O", miJuego.obtenerJugadorActual());
	}
	@Test
	public void ganaXenTerceraColumna(){
		assertFalse(miJuego.huboGanador());
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 2);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 0);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 2);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 1);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 2);
		assertTrue(miJuego.huboGanador());
		assertEquals("X", miJuego.obtenerJugadorActual());
	}
	@Test
	public void ganaOenTerceraColumna(){
		assertFalse(miJuego.huboGanador());
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 0);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 2);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 1);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 2);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 0);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 2);
		assertTrue(miJuego.huboGanador());
		assertEquals("O", miJuego.obtenerJugadorActual());
	}
	@Test
	public void noHayGanador(){
		assertFalse(miJuego.huboGanador());
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 0);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 1);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 1);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(0, 2);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 0);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 1);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 2);
		assertEquals("O", miJuego.obtenerJugadorActual());
		miJuego.marcar(1, 0);
		assertEquals("X", miJuego.obtenerJugadorActual());
		miJuego.marcar(2, 2);
		assertFalse(miJuego.huboGanador());
		assertEquals("X", miJuego.obtenerJugadorActual());
	}
}
