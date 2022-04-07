package iti.quarta.streams.data;

public class PersonaImpl implements Persona, Comparable<Persona> {

	private final String surname;
    private final String name;
    private final int day;
    private final int month;
    private final int year;
    private final boolean isAlive;

    public PersonaImpl(String surname, String name, int day, int month, int year, boolean isAlive) {
        this.surname = surname;
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.isAlive = isAlive;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDay() {
        return day;
    }

    @Override
    public int getMonth() {
        return month;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public boolean isAlive() {
        return isAlive;
    }

    @Override
    public String toString() {
        return "PersonaImpl{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", isAlive=" + isAlive +
                '}';
    }

    @Override
    public int compareTo(Persona persona) {
        if (this.year - persona.getYear() == 0) {
            if (this.month - persona.getMonth() == 0) {
                return this.day - persona.getDay();
            } else {
                return this.month - persona.getMonth();
            }
        } else {
            return this.year - persona.getYear();
        }
    }

}
