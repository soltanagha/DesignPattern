package visitorShortestRoute;

import abstractFactoryTrafficParticipant.factories.LogicalParticipant;

import java.util.ArrayList;
import java.util.List;

public class ShourtestRoutes {
    // Setup logicalParticipantList collection
    List<LogicalParticipant> logicalParticipantList = new ArrayList<>();

    public void add(LogicalParticipant employee){
        logicalParticipantList.add(employee);
    }

    public void remove(LogicalParticipant employee){
        logicalParticipantList.remove(employee);
    }

    public void accept(ShortestRouteVisitor visitor){
        for(LogicalParticipant logicalParticipant : logicalParticipantList)	{
            logicalParticipant.accept(visitor);
        }
        System.out.println();
    }
}
