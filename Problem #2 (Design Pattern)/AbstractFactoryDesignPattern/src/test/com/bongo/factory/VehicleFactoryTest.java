package com.bongo.factory;

import com.bongo.beans.Vehicle;
import com.bongo.beans.VehicleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleFactoryTest {

    @Test
    void createCarVehicleHasGasTest() {
        Vehicle car = VehicleFactory.createVehicle(VehicleType.Car, 0, 2);

        if (car != null) {
            assertFalse(car.has_gas());
        }
    }

    @Test
    void createPlaneVehicleHasGasTest() {
        Vehicle plane = VehicleFactory.createVehicle(VehicleType.Plane, 0, 2);

        if (plane != null) {
            assertFalse(plane.has_gas());
        }
    }


}