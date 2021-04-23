package abstractFactoryTrafficParticipant.configuration;

import abstractFactoryTrafficParticipant.AbstractFactoryTrafficParticipant;
import abstractFactoryTrafficParticipant.abstractProducts.Car;
import abstractFactoryTrafficParticipant.factories.LogicalParticipant;
import abstractFactoryTrafficParticipant.factories.PhysicalParticipant;
import abstractFactoryTrafficParticipant.abstractProducts.Motorcycle;

public class Application {
    private Car privilegedCar;
    private Car notPrivilegedCar;
    private Motorcycle privilegedMotorcyle;
    private Motorcycle notPrivilegedMotorcyle;

    public Application(AbstractFactoryTrafficParticipant factory) {
        privilegedCar = factory.createPrivilegedCar();
        notPrivilegedCar = factory.createNotPrivilegedCar();

        privilegedMotorcyle = factory.createPrivilegedMotorcyle();
        notPrivilegedMotorcyle = factory.createNotPrivilegedMotorcyle();
    }

    public static Application configureApplication(TrafficParticipantType trafficParticipantType) {
        Application app;
        AbstractFactoryTrafficParticipant factory;

        if (trafficParticipantType == TrafficParticipantType.LOGICAL) {
            factory = new LogicalParticipant();
            app = new Application(factory);
        }
        else {
                factory = new PhysicalParticipant();
                app = new Application(factory);
        }

        return app;
    }

    public Car getPrivilegedCar() {
        return privilegedCar;
    }

    public Car getNotPrivilegedCar() {
        return notPrivilegedCar;
    }

    public Motorcycle getPrivilegedMotorcyle() {
        return privilegedMotorcyle;
    }

    public Motorcycle getNotPrivilegedMotorcyle() {
        return notPrivilegedMotorcyle;
    }


}
