package FactoryMethod.Vehicles;

import FactoryMethod.Vehicle;

public class Citroen implements Vehicle {
    @Override
    public void drive() {
        System.out.println("I'm driving (" + Citroen.class + ")");
    }
}
