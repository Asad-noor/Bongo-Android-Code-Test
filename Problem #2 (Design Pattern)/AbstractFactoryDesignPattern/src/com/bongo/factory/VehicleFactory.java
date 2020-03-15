package com.bongo.factory;

import com.bongo.beans.Vehicle;
import com.bongo.beans.VehicleType;

public class VehicleFactory {

    public static Vehicle createVehicle(VehicleType vehicleType, int num_of_wheels, int num_of_passengers) {
        switch (vehicleType) {
            case Car: return new CarFactory(num_of_wheels, num_of_passengers).createVehicle();

            case Plane: return new PlaneFactory(num_of_wheels, num_of_passengers).createVehicle();

            default: return null;
        }
    }
}
