package abstractFactoryTrafficParticipant.physicalProducts;

import abstractFactoryTrafficParticipant.abstractProducts.Car;
import abstractFactoryTrafficParticipant.factories.PhysicalParticipant;

public class PhysicalNotPrivilegedCar extends PhysicalParticipant implements Car {

    @Override
    public void createCar() {
        System.out.println("You create PhysicalNotPrivilegedCar.");
    }
}
