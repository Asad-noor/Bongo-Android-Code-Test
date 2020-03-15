package com.bongo;

import com.bongo.beans.Vehicle;
import com.bongo.beans.VehicleType;
import com.bongo.factory.VehicleFactory;

public class Main {

    public static void main(String[] args) {

        Vehicle car = VehicleFactory.createVehicle(VehicleType.Car, 0, 2);

        Vehicle plane = VehicleFactory.createVehicle(VehicleType.Plane, 3, 12);
    }
}
