package iti.quarta.car_dealer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Dealer {
    private final String name;
    private final String address;
    private final String telephone;
    private final List<Car> cars;

    public Dealer(final String name, final String address, final String telephone) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.cars = new ArrayList<>();
    }


    public void addCar(final Car car) throws Exception {
        for (Car insertedCar : this.cars) {
            if (insertedCar.equals(car)) {
                throw new Exception("Non ci possono essere due auto uguali.");
            }
        }
        this.cars.add(car);
    }

    public void removeCar(final int index) {
        this.cars.remove(index);
    }

    public Car pullCar(final int index) {
        final Car tmpCar = this.cars.get(index);
        this.removeCar(index);
        return tmpCar;
    }

    /*
     * Affidarsi al toString non è bellissimo.
     */
    public void printCars() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }


	@Override
	public int hashCode() {
		return Objects.hash(address, cars, name, telephone);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dealer other = (Dealer) obj;
		return Objects.equals(address, other.address) && Objects.equals(cars, other.cars)
				&& Objects.equals(name, other.name) && Objects.equals(telephone, other.telephone);
	}
    
    
    
}