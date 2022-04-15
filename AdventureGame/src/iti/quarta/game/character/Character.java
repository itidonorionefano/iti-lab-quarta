package iti.quarta.game.character;

/** 
 * Base class that defines every character that is inside a game.
 */
public abstract class Character {
    private final String name;
    protected int atk;
    protected int def;

    protected Character(String name, int atk, int def) {
        this.name = name;
        this.atk = atk;
        this.def = def;
    }

    String getName() {
        return name;
    }
    int getAtk() {
        return atk;
    }
    int getDef() {
        return def;
    }
}
