package com.bongo.builders;

import com.bongo.beans.IPlaneBuilder;
import com.bongo.beans.Plane;
import com.bongo.beans.Vehicle;

public class IPlaneBuilderImpl implements IPlaneBuilder {

    private Plane plane;

    public IPlaneBuilderImpl() {
        plane = new Plane();
    }

    @Override
    public Plane build() {
        set_has_gas();
        return plane;
    }

    @Override
    public Vehicle set_num_of_wheels(int num_of_wheels) {
        plane.setNum_of_wheels(num_of_wheels);
        return this;
    }

    @Override
    public Vehicle set_num_of_passengers(int num_of_passengers) {
        plane.setNum_of_passengers(num_of_passengers);
        return this;
    }

    private void set_has_gas() {
        if(plane.get_num_of_wheels() != 3) {
            plane.setHas_gas(false);
        } else if(plane.get_num_of_passengers() == 0) {
            plane.setHas_gas(false);
        } else {
            plane.setHas_gas(true);
        }
    }

    @Override
    public Vehicle has_gas() {
        return this;
    }
}
