package iti.quarta.game.character;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import iti.quarta.game.inventory.Drop;
import iti.quarta.game.inventory.HasDrops;
import iti.quarta.game.inventory.Item;

/**
 * Base class for each NPC inside the game, needs to have drops and more.
 */
public abstract class NPC extends Character implements HasDrops {
    public NPC(String name, int atk, int def) {
        super(name, atk, def);
    }
    
    /**
     * This function allows to randomize the items dropped when dead.
     * @return a collection of items dropped.
     */
    Collection<Item> dropItems(Random random) {
    	List<Item> itemsDropped = new ArrayList<>();
    	for (Drop drop : getDrops()) {
    		if (random.nextInt(drop.getRate().getRate()) == 0) {
    			for (int i = 1; i < random.nextInt(drop.getMaxQuantity()); i++) {
    				itemsDropped.add(drop.getItem());
    			}
    		}
    	}
    	return itemsDropped;
    }
}