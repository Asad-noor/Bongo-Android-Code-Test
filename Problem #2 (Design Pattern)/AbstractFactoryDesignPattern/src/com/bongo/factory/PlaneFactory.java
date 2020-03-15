package com.bongo.factory;

import com.bongo.beans.Plane;
import com.bongo.beans.Vehicle;

public class PlaneFactory extends AbstractVehicleFactory {

    private int num_of_wheels, num_of_passengers;

    public PlaneFactory(int num_of_wheels, int num_of_passengers) {
        this.num_of_wheels = num_of_wheels;
        this.num_of_passengers = num_of_passengers;
    }

    @Override
    protected Vehicle createVehicle() {
        if (num_of_wheels != 3) {
            //This is not a valid plane input so return no gas car
            return new Plane(num_of_wheels, num_of_passengers, false);
        } else if (num_of_passengers == 0) {
            //This plane should not be able to go as passenger is zero
            return new Plane(num_of_wheels, num_of_passengers, false);
        } else {
            return new Plane(num_of_wheels, num_of_passengers, true);
        }
    }
}
