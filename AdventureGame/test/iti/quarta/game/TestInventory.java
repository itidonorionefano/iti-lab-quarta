package iti.quarta.game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import iti.quarta.game.inventory.Drop;
import iti.quarta.game.inventory.Item;

class TestInventory {

	@Test
	void testDrop() {
		// Drop that drops any Item, with a rate of 10 and maxItems of 3.
		Drop completeDrop = null;
		assertInstanceOf(Item.class, completeDrop.getItem());
		assertEquals(10, completeDrop.getRate());
		assertEquals(3, completeDrop.getMaxQuantity());
		
		// a drop with maxQuantity -1
		Drop impossibleDrop = null;
		assertEquals(1, completeDrop.getMaxQuantity());
	}

}
