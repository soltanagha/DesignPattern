package abstractFactoryTrafficParticipant.factories;

import abstractFactoryTrafficParticipant.AbstractFactoryTrafficParticipant;
import abstractFactoryTrafficParticipant.abstractProducts.Car;
import abstractFactoryTrafficParticipant.logicalProducts.LogicalNotPrivilegedCar;
import abstractFactoryTrafficParticipant.logicalProducts.LogicalPrivilegedCar;
import abstractFactoryTrafficParticipant.logicalProducts.LogicalNotPrivilegedMotorcycle;
import abstractFactoryTrafficParticipant.logicalProducts.LogicalPrivilegedMotorcycle;
import abstractFactoryTrafficParticipant.abstractProducts.Motorcycle;
import visitorShortestRoute.ShortestRouteVisitor;

public class LogicalParticipant extends ShortestRouteVisitor implements AbstractFactoryTrafficParticipant {


    public void accept(ShortestRouteVisitor visitor) {
        visitor.visit(this);
    }
    @Override
    public Car createPrivilegedCar() {
        return new LogicalPrivilegedCar();
    }

    @Override
    public Car createNotPrivilegedCar() {
        return new LogicalNotPrivilegedCar();
    }

    @Override
    public Motorcycle createPrivilegedMotorcyle() {
        return new LogicalPrivilegedMotorcycle();
    }

    @Override
    public Motorcycle createNotPrivilegedMotorcyle() {
        return new LogicalNotPrivilegedMotorcycle();
    }

    @Override
    public void visit(LogicalParticipant visitor) {
        visitor.visit(this);
    }
}
