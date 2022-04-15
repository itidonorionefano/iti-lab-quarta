package iti.quarta.game;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import iti.quarta.game.utils.Rate;

class TestUtils {

	@Test
	void testRate() {
		// Percentuale 0
		Rate rate0 = null;
		assertEquals(0, rate0.getRate());
		// Percentuale 100
		Rate rate100 = null;
		assertEquals(100, rate100.getRate());
		// Percentuale -100
		Rate rateMinus100 = null;
		assertEquals(0, rateMinus100.getRate());
		// Percentuale 1000
		Rate rate1000 = null;
		assertEquals(100, rate1000.getRate());
	}
}
