package iti.quarta.game.inventory;

import iti.quarta.game.utils.Rate;

/**
 * Instance of the drop object.
 */
public interface Drop {
	Item getItem();
	int getMaxQuantity();
	Rate getRate();
}
