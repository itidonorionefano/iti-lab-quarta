package iti.quarta.car_dealer.menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class Menu<X, Y> {
	protected final Map<X, Y> entries;

    public Menu() {
        entries = new HashMap<>();
    }

    public void addEntry(X selection, Y text) {
        this.entries.put(selection, text);
    }

    public X getEntry() {
        Scanner scanner = new Scanner(System.in);
        X selection;
        do {
            selection = parseSelection(scanner.nextLine());
        } while (!entries.containsKey(selection));
        return selection;
    }

    protected abstract X parseSelection(String input);
    public abstract void printMenu();
}
