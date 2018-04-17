package FactoryMethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle vehicle1 = vehicleFactory.getVehicle("MERCEDES");
        vehicle1.drive();

        Vehicle vehicle2 = vehicleFactory.getVehicle("VOLVO");
        vehicle2.drive();

        Vehicle vehicle3 = vehicleFactory.getVehicle("CITROEN");
        vehicle3.drive();
    }
}
