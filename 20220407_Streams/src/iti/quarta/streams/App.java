package iti.quarta.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import iti.quarta.streams.data.Persona;
import iti.quarta.streams.data.PersonaImpl;

public final class App {

	public static void main(String[] args) {
		List<Persona> archive = new ArrayList<>();
        archive.add(new PersonaImpl("Avaltroni", "Luca", 21, 1, 2004, true));
        archive.add(new PersonaImpl("Bucci", "Tommaso", 18, 9, 2004, true));
        archive.add(new PersonaImpl("Iannone", "Simone", 31, 8, 2004, true));
        archive.add(new PersonaImpl("Iodice", "Gianluca", 7, 12, 2004, true));
        archive.add(new PersonaImpl("Isotti", "Tommaso", 18, 10, 2004, true));
        archive.add(new PersonaImpl("Mandolini", "Michelangelo", 9, 9, 2004, true));
        archive.add(new PersonaImpl("Mattioli", "Marco", 10, 1, 2002, true));
        archive.add(new PersonaImpl("Napoli", "Emanuele", 13, 9, 2004, true));
        archive.add(new PersonaImpl("Orefice", "Mattia", 22, 8, 2004, true));
        archive.add(new PersonaImpl("Suffer", "Samuel", 29, 7, 2004, true));
        archive.add(new PersonaImpl("Tomassoli", "Luca", 2, 6, 2004, true));
        /* 1a revisione
        final List<Persona> sortedByName = archive.stream().sorted(new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getName().compareTo(p2.getName());
            }
        }).collect(Collectors.toList());

        2a revisione
        final List<Persona> sortedByName = archive.stream()
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .collect(Collectors.toList());
         */
        final List<Persona> sortedByName = archive.stream()
                .sorted(Comparator.comparing(Persona::getName))
                .collect(Collectors.toList());

        for (Persona persona : sortedByName) {
            System.out.println(persona.getName() + " " + persona.getSurname());
        }

        /* 1a revisione
        archive.stream().sorted(new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                if (p1.getYear() - p2.getYear() == 0) {
                    if (p1.getMonth() - p2.getMonth() == 0) {
                        return p1.getDay() - p2.getDay();
                    } else {
                        return p1.getMonth() - p2.getMonth();
                    }
                } else {
                    return p1.getYear() - p2.getYear();
                }
            }
        }).forEach(persona -> System.out.println(persona));
         */
        archive.stream().sorted().forEach(System.out::println);
	}

}
