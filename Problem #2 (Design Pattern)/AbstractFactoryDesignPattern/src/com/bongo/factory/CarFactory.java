package com.bongo.factory;

import com.bongo.beans.Car;
import com.bongo.beans.Vehicle;

public class CarFactory extends AbstractVehicleFactory {

    private int num_of_wheels, num_of_passengers;

    public CarFactory(int num_of_wheels, int num_of_passengers) {
        this.num_of_wheels = num_of_wheels;
        this.num_of_passengers = num_of_passengers;
    }

    @Override
    protected Vehicle createVehicle() {
        if (num_of_wheels != 4) {
            //This is not a valid car input so return no gas car
            return new Car(num_of_wheels, num_of_passengers, false);
        } else if (num_of_passengers == 0) {
            //This car should not be able to go as passenger is zero
            return new Car(num_of_wheels, num_of_passengers, false);
        } else {
            return new Car(num_of_wheels, num_of_passengers, true);
        }
    }
}
