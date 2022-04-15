package iti.quarta.game.utils;

/**
 * Defines a unique item, that has X as return type.
 * @param <X>
 */
public interface UniqueItem<X> {
    /**
     * Returns the ID of X type
     */
    X getId();
}
