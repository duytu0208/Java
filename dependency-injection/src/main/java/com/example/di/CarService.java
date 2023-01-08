package com.example.di;

import lombok.Data;
import lombok.ToString;

@ToString
public class CarService {

    private CarDAO carDAO;

    public CarService(CarDAO carDAO) {
        this.carDAO = carDAO;
    }
}
