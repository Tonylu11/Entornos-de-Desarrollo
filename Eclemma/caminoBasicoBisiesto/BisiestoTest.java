package caminoBasicoBisiesto;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Antonio Luque Bravo
 *
 */
public class BisiestoTest {
	@Test
	public void testMostrarSiBisiesto() {
		Bisiesto.mostrarSiBisiesto(100);
		Bisiesto.mostrarSiBisiesto(2016);
		Bisiesto.mostrarSiBisiesto(2);
		Bisiesto.mostrarSiBisiesto(0);
	}
}
