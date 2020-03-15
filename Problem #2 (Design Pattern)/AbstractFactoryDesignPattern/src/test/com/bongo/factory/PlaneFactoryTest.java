package com.bongo.factory;

import com.bongo.beans.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaneFactoryTest {

    @Test
    void createVehicleHasNoGasTest() {
        Vehicle plane = new PlaneFactory(2, 4).createVehicle();

        assertFalse(plane.has_gas());
    }

    @Test
    void createVehicleHasGasTest() {
        Vehicle plane = new PlaneFactory(3, 10).createVehicle();

        assertTrue(plane.has_gas());
    }
}