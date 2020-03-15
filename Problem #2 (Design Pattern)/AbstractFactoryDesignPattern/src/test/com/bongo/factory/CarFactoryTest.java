package com.bongo.factory;

import com.bongo.beans.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTest {

    @Test
    void createVehicleHasNoGasTest() {
        Vehicle car = new CarFactory(0, 2).createVehicle();

        assertFalse(car.has_gas());
    }

    @Test
    void createVehicleHasGasTest() {
        Vehicle car = new CarFactory(4, 2).createVehicle();

        assertTrue(car.has_gas());
    }
}