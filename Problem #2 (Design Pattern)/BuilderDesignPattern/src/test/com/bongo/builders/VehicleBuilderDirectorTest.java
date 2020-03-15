package com.bongo.builders;

import com.bongo.beans.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VehicleBuilderDirectorTest {

    @Test
    void buildCarHasGasReturnFalse() {
        Vehicle vehicleCar = new CarBuilderImpl().set_num_of_wheels(0).set_num_of_passengers(3);

        assertFalse(new VehicleBuilderDirector(vehicleCar).buildCar().has_gas());
    }

    @Test
    void buildCarHasGasReturnTrue() {
        Vehicle vehicleCar = new CarBuilderImpl().set_num_of_wheels(4).set_num_of_passengers(3);

        assertTrue(new VehicleBuilderDirector(vehicleCar).buildCar().has_gas());
    }

    @Test
    void buildPlaneHasGasReturnFalse() {
        Vehicle vehiclePlane = new IPlaneBuilderImpl().set_num_of_wheels(0).set_num_of_passengers(3);

        assertFalse(new VehicleBuilderDirector(vehiclePlane).buildPlane().has_gas());
    }

    @Test
    void buildPlaneHasGasReturnTrue() {
        Vehicle vehiclePlane = new IPlaneBuilderImpl().set_num_of_wheels(3).set_num_of_passengers(3);

        assertTrue(new VehicleBuilderDirector(vehiclePlane).buildPlane().has_gas());
    }
}