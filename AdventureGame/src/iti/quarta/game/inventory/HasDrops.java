package iti.quarta.game.inventory;

import java.util.Collection;

@FunctionalInterface
public interface HasDrops {
	Collection<Drop> getDrops();
}
