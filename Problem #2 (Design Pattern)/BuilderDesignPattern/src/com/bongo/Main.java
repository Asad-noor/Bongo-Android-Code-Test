package com.bongo;

import com.bongo.beans.Car;
import com.bongo.beans.Plane;
import com.bongo.beans.Vehicle;
import com.bongo.builders.CarBuilderImpl;
import com.bongo.builders.IPlaneBuilderImpl;
import com.bongo.builders.VehicleBuilderDirector;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicleCar = new CarBuilderImpl().set_num_of_wheels(0).set_num_of_passengers(3);
        Car car = new VehicleBuilderDirector(vehicleCar).buildCar();

        vehicleCar = new CarBuilderImpl().set_num_of_wheels(4).set_num_of_passengers(3);
        Car car2 = new VehicleBuilderDirector(vehicleCar).buildCar();

        Vehicle vehiclePlane = new IPlaneBuilderImpl().set_num_of_wheels(0).set_num_of_passengers(3);
        Plane plane = new VehicleBuilderDirector(vehiclePlane).buildPlane();
    }
}
