package visitorShortestRoute;

import abstractFactoryTrafficParticipant.logicalProducts.LogicalNotPrivilegedCar;
import abstractFactoryTrafficParticipant.factories.LogicalParticipant;
import abstractFactoryTrafficParticipant.logicalProducts.LogicalNotPrivilegedMotorcycle;
import singletonRoadSigns.RoadSignsSingleton;

public class NotPrivilegedShortestRoute extends ShortestRouteVisitor {

    @Override
    public void visit(LogicalParticipant element) {
        RoadSignsSingleton roadSignsSingleton = RoadSignsSingleton.getSingletonInstance();
        roadSignsSingleton.checkRoadSigns("A to B");

        if(element instanceof LogicalNotPrivilegedCar)
            System.out.println("LogicalNotPrivilegedCar time: 7 min, length: 15 km");
        else if(element instanceof LogicalNotPrivilegedMotorcycle)
            System.out.println("LogicalNotPrivilegedMotorcycle time: 6 min, length: 10 km");
    }

}
