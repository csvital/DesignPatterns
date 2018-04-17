package FactoryMethod.Vehicles;

import FactoryMethod.Vehicle;

public class Volvo implements Vehicle {
    @Override
    public void drive() {
        System.out.println("I'm driving (" + Volvo.class + ")");
    }
}
