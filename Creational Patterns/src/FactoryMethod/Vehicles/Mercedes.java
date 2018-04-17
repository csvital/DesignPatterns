package FactoryMethod.Vehicles;

import FactoryMethod.Vehicle;

public class Mercedes implements Vehicle {
    @Override
    public void drive() {
        System.out.println("I'm driving (" + Mercedes.class + ")");
    }
}
