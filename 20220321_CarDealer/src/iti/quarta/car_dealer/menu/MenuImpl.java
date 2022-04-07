package iti.quarta.car_dealer.menu;

import java.util.Map;

public class MenuImpl extends Menu<Integer, String> {
	@Override
    protected Integer parseSelection(String input) {
        return Integer.parseInt(input);
    }

    @Override
    public void printMenu() {
        for (Map.Entry<Integer, String> entry : this.entries.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
    }
}
