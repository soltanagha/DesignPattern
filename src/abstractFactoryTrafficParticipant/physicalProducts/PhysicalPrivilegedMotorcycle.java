package abstractFactoryTrafficParticipant.physicalProducts;

import abstractFactoryTrafficParticipant.abstractProducts.Motorcycle;
import abstractFactoryTrafficParticipant.factories.PhysicalParticipant;

public class PhysicalPrivilegedMotorcycle extends PhysicalParticipant implements Motorcycle {

    @Override
    public void createMotorcycle() {
        System.out.println("You create PhysicalPrivilegedMotorcycle.");
    }

}
