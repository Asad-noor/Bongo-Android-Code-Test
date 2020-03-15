package com.bongo.builders;

import com.bongo.beans.*;

public class VehicleBuilderDirector {

    private ICarBuilder iCarBuilder;
    private IPlaneBuilder iPlaneBuilder;

    public VehicleBuilderDirector(Vehicle vehicle) {
        if(vehicle instanceof ICarBuilder) {
            this.iCarBuilder = (ICarBuilder) vehicle;
        } else {
            this.iPlaneBuilder = (IPlaneBuilder) vehicle;
        }
    }

    public Car buildCar() {
        return iCarBuilder.build();
    }

    public Plane buildPlane() {
        return iPlaneBuilder.build();
    }
}
