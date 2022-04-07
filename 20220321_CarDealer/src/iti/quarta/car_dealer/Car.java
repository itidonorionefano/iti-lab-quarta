package iti.quarta.car_dealer;

public class Car {
	private String id;
    private String model;
    private String brand;
    private int cc;
    private int registration;
    private Owner owner;

    public Car(final String id, final String model, final String brand, final int cc, final int registration) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.cc = cc;
        this.registration = registration;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(final Owner owner) {
        this.owner = owner;
    }
}
