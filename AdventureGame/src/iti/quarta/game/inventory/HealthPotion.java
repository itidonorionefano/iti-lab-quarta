package iti.quarta.game.inventory;

public class HealthPotion extends Usable {
    private final int hp;

    public HealthPotion(String id, String name, int hp) {
        super(id, name);
        this.hp = hp;
    }

    @Override
    void use() {
        // TODO: aumentare gli HP del personaggio
    }
}