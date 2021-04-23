package abstractFactoryTrafficParticipant.logicalProducts;

import abstractFactoryTrafficParticipant.abstractProducts.Motorcycle;
import abstractFactoryTrafficParticipant.factories.LogicalParticipant;

public class LogicalPrivilegedMotorcycle extends LogicalParticipant implements Motorcycle {

    @Override
    public void createMotorcycle() {
        System.out.println("You create LogicalPrivilegedMotorcycle.");
    }

}
