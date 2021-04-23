package visitorShortestRoute;

import abstractFactoryTrafficParticipant.logicalProducts.LogicalNotPrivilegedCar;
import abstractFactoryTrafficParticipant.factories.LogicalParticipant;
import abstractFactoryTrafficParticipant.logicalProducts.LogicalNotPrivilegedMotorcycle;
import singletonRoadSigns.RoadSignsSingleton;

public class PrivilegedShortestRoute extends ShortestRouteVisitor {
    @Override
    public void visit(LogicalParticipant element) {
        RoadSignsSingleton roadSignsSingleton = RoadSignsSingleton.getSingletonInstance();
        roadSignsSingleton.checkRoadSigns("A to B");

        if(element instanceof LogicalNotPrivilegedCar)
            System.out.println("LogicalPrivilegedCar time: 3 min, length: 10 km");
        else if(element instanceof LogicalNotPrivilegedMotorcycle)
            System.out.println("LogicalNotPrivilegedMotorcycle time: 2 min, length: 8 km");
    }

}
