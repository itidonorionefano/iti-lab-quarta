package iti.quarta.game.inventory;

import iti.quarta.game.utils.UniqueItem;

public class Item implements UniqueItem<String> {
    private final String id;
    private final String name;

    public Item(final String id, final String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
