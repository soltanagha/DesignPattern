package visitorShortestRoute;

import abstractFactoryTrafficParticipant.factories.LogicalParticipant;

public abstract class ShortestRouteVisitor {
    public abstract void visit(LogicalParticipant visitor);
}
