package com.java.pattern.factory;

public class CarFactory {

    public Car getBrand(CarType type) {
        switch (type) {
            case Maruti:
                return new Maruti();
            case Tata:
                return new Tata();
            case Ford:
                return new Ford();
            default:
                return null;
        }
    }
}
