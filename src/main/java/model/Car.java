package model;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public static Car createCar(String name) {
    	return new Car(name);
    }
}
