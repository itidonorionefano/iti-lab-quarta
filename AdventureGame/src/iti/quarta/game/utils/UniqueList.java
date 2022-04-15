package iti.quarta.game.utils;

import java.util.Collection;

/**
 * Defines a list of unique items.
 *
 * @param <X> The type of the id specified inside the UniqueItem instance.
 * @param <Y> The object implementing the UniqueItem interface.
 */
public interface UniqueList<X, Y extends UniqueItem<X>> {
    void add(Y item);
    void remove(X id);
    Y get(X id);
    Collection<Y> getCollection();
    boolean exists(X id);
}
