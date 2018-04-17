package FactoryMethod;

import FactoryMethod.Vehicles.Citroen;
import FactoryMethod.Vehicles.Mercedes;
import FactoryMethod.Vehicles.Volvo;

class VehicleFactory {

    Vehicle getVehicle(String carType){

        if(carType == null){
            return null;
        }

        if(carType.equalsIgnoreCase("MERCEDES")){
            return new Mercedes();
        } else if(carType.equalsIgnoreCase("VOLVO")){
            return new Volvo();
        } else if(carType.equalsIgnoreCase("CITROEN")){
            return new Citroen();
        }

        return null;
    }
}
