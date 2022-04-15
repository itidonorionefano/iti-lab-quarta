package iti.quarta.game.inventory;

public abstract class Equipment extends Item {

    private final int atk;
    private final int def;
    private final EquipLocation equipLocation;

    public Equipment(String id, String name, EquipLocation equipLocation, int atk, int def) {
        super(id, name);
        this.equipLocation = equipLocation;
        this.atk = atk;
        this.def = def;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public EquipLocation getEquipLocation() {
        return equipLocation;
    }
}
