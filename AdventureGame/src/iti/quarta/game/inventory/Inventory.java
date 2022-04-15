package iti.quarta.game.inventory;

import iti.quarta.game.utils.UniqueList;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Inventory implements UniqueList<String, Item> {

    private Map<String, ItemCounter> inventory = new HashMap<>();

    @Override
    public void add(Item item) {
        if (exists(item.getId())) {
            inventory.get(item.getId())
                    .increase();
        } else {
            inventory.put(item.getId(), new ItemCounter(item));
        }
    }

    @Override
    public void remove(String id) {
        try {
            inventory.get(id)
                    .decrease();
        } catch (ItemLessThanOne e) {
            inventory.remove(id);
        }
    }

    @Override
    public Item get(String id) {
        return inventory.get(id)
                .getItem();
    }

    @Override
    public Collection<Item> getCollection() {
        // TODO
        return null;
    }

    @Override
    public boolean exists(String id) {
        return inventory.containsKey(id);
    }
}