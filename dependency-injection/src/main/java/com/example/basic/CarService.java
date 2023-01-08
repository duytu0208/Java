package com.example.basic;

public class CarService {

    private CarDAO carDAO = new CarDAO();

    public CarService(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

//    private CarDAO carDAO
//    public CarService(CarDAO carDAO) {
//        this.carDAO = new CarDAO();
//    }
}
