package com.bongo.builders;

import com.bongo.beans.Car;
import com.bongo.beans.ICarBuilder;

public class CarBuilderImpl implements ICarBuilder {

    private Car car;

    public CarBuilderImpl() {
        car = new Car();
    }

    @Override
    public Car build() {
        set_has_gas();
        return car;
    }

    @Override
    public ICarBuilder set_num_of_wheels(int num_of_wheels) {
        car.setNum_of_wheels(num_of_wheels);
        return this;
    }

    @Override
    public ICarBuilder set_num_of_passengers(int num_of_passengers) {
        car.setNum_of_passengers(num_of_passengers);
        return this;
    }

    private void set_has_gas() {
        if(car.get_num_of_wheels() != 4) {
            car.setHas_gas(false);
        } else if(car.get_num_of_passengers() == 0) {
            car.setHas_gas(false);
        } else {
            car.setHas_gas(true);
        }
    }

    @Override
    public ICarBuilder has_gas() {
        return this;
    }
}
