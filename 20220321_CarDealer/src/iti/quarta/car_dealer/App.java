package iti.quarta.car_dealer;

import java.util.Scanner;

import iti.quarta.car_dealer.menu.MenuImpl;

public class App {

	public static void main(String[] args) {
		final Dealer testDealer = new Dealer("Gabellini", "Pesaro", "0000");

        final MenuImpl menu = new MenuImpl();
        menu.addEntry(1, "Inserisci Dealer");
        menu.addEntry(2, "Inserisci Auto");
        menu.addEntry(3, "Inserisci Owner");
        menu.addEntry(0, "Esci dal programma");
        boolean loop = true;
        while (loop) {
            menu.printMenu();
            int entry = menu.getEntry();
            switch (entry) {
                case 2:
                    try {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Inserisci l'identificativo: ");
                        String id = scanner.nextLine();
                        System.out.println("Inserisci il marchio: ");
                        String brand = scanner.nextLine();
                        System.out.println("Inserisci il modello: ");
                        String model = scanner.nextLine();
                        System.out.println("Inserisci la cilindrata: ");
                        int cc = Integer.parseInt(scanner.nextLine());
                        System.out.println("Inserisci l'anno di immatricolazione: ");
                        int registration = Integer.parseInt(scanner.nextLine());
                        testDealer.addCar(new Car(id, brand, model, cc, registration));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 1:
                case 3:
                    throw new RuntimeException("Not implemented.");
                case 0:
                    loop = false;
                    break;
            }
        }
	}

}
