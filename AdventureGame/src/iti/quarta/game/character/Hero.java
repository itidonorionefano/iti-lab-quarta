package iti.quarta.game.character;

import iti.quarta.game.inventory.Equipment;
import iti.quarta.game.inventory.EquipmentEngine;
import iti.quarta.game.inventory.Inventory;
import iti.quarta.game.inventory.Item;

/**
 * Implementation of our hero, the hero needs to have equipment and inventory.
 */
public class Hero extends Character {

    private Inventory inventory;
    private EquipmentEngine equipmentEngine;

    public Hero(String name, int atk, int def) {
        super(name, atk, def);
        this.inventory = new Inventory();
        this.equipmentEngine = new EquipmentEngine(this.inventory);
    }

    @Override
    int getAtk() {
        int tmpAtk = super.getAtk();
        for (Equipment equipment : equipmentEngine.getEquipped()) {
            tmpAtk = tmpAtk + equipment.getAtk();
        }
        return tmpAtk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    @Override
    int getDef() {
        int tmpDef = super.getDef();
        for (Equipment equipment : equipmentEngine.getEquipped()) {
            tmpDef = tmpDef + equipment.getDef();
        }
        return tmpDef;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void equip(String id) throws Exception {
        if (inventory.exists(id)) {
            Item tmpItem = inventory.get(id);
            if (tmpItem instanceof Equipment) {
                inventory.remove(id);
                equipmentEngine.equip(((Equipment) tmpItem).getEquipLocation(), (Equipment) tmpItem);
            } else {
                throw new Exception("Item not equippable");
            }

        }
    }
}
