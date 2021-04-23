package abstractFactoryTrafficParticipant.logicalProducts;
import abstractFactoryTrafficParticipant.abstractProducts.Car;
import abstractFactoryTrafficParticipant.factories.LogicalParticipant;

public class LogicalNotPrivilegedCar extends LogicalParticipant implements Car {

    @Override
    public void createCar() {
        System.out.println("You create LogicalNotPrivilegedCar.");
    }

}
