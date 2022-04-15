package iti.quarta.game.inventory;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EquipmentEngine {

    private Inventory inventory;
    private Map<EquipLocation, Equipment> equipmentMap;

    public EquipmentEngine(Inventory inventory) {
        this.inventory = inventory;
        this.equipmentMap = new HashMap<>();
    }

    public void equip(EquipLocation equipLocation, Equipment equipment) {
        remove(equipLocation);
        equipmentMap.put(equipLocation, equipment);
    }

    public void remove(EquipLocation equipLocation) {
        if (equipmentMap.containsKey(equipLocation)) {
            inventory.add(equipmentMap.remove(equipLocation));
        }
    }

    public Collection<Equipment> getEquipped() {
        return equipmentMap.values();
    }
}