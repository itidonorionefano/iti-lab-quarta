package iti.quarta.game.inventory;

/**
 * Specifies an object that can be used by the user.
 */
public abstract class Usable extends Item {
    public Usable(String id, String name) {
        super(id, name);
    }

    /**
     * Use the item, apply something, do something.
     */
    abstract void use();

}
