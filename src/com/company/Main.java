package com.company;

import abstractFactoryTrafficParticipant.configuration.Application;
import abstractFactoryTrafficParticipant.configuration.TrafficParticipantType;
import abstractFactoryTrafficParticipant.logicalProducts.LogicalNotPrivilegedCar;
import abstractFactoryTrafficParticipant.logicalProducts.LogicalNotPrivilegedMotorcycle;
import singletonRoadSigns.RoadSignsSingleton;
import visitorShortestRoute.NotPrivilegedShortestRoute;
import visitorShortestRoute.PrivilegedShortestRoute;
import visitorShortestRoute.ShourtestRoutes;

public class Main {

    public static void main(String[] args) {


        Application app = Application.configureApplication(TrafficParticipantType.PHYSICAL);
        app.getNotPrivilegedMotorcyle().createMotorcycle();

        // Calculate shourtest route ...
        ShourtestRoutes shourtestRoutes = new ShourtestRoutes();
        shourtestRoutes.add(new LogicalNotPrivilegedCar());
        shourtestRoutes.add(new LogicalNotPrivilegedMotorcycle());

        // ShourtestRoutes are 'visited'
        shourtestRoutes.accept(new PrivilegedShortestRoute());
        shourtestRoutes.accept(new NotPrivilegedShortestRoute());

    }
}
