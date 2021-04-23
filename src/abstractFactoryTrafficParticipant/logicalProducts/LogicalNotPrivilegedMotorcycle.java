package abstractFactoryTrafficParticipant.logicalProducts;

import abstractFactoryTrafficParticipant.abstractProducts.Motorcycle;
import abstractFactoryTrafficParticipant.factories.LogicalParticipant;

public class LogicalNotPrivilegedMotorcycle extends LogicalParticipant implements Motorcycle {

    @Override
    public void createMotorcycle() {
        System.out.println("You create LogicalNotPrivilegedMotorcycle.");
    }

}
