package com.bongo.beans;

public class Car implements Vehicle {

    private int num_of_wheels, num_of_passengers;
    private boolean has_gas;

    public Car(int num_of_wheels, int num_of_passengers, boolean has_gas) {
        this.num_of_wheels = num_of_wheels;
        this.num_of_passengers = num_of_passengers;
        this.has_gas = has_gas;
    }

    @Override
    public int get_num_of_wheels() {
        return num_of_wheels;
    }

    @Override
    public int get_num_of_passengers() {
        return num_of_passengers;
    }

    @Override
    public boolean has_gas() {
        return has_gas;
    }
}
