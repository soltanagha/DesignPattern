package abstractFactoryTrafficParticipant.physicalProducts;

import abstractFactoryTrafficParticipant.abstractProducts.Motorcycle;
import abstractFactoryTrafficParticipant.factories.PhysicalParticipant;

public class PhysicalNotPrivilegedMotorcycle extends PhysicalParticipant implements Motorcycle {

    @Override
    public void createMotorcycle() {
        System.out.println("You create PhysicalNotPrivilegedMotorcycle.");
    }

}
