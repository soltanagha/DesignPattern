package abstractFactoryTrafficParticipant;

import abstractFactoryTrafficParticipant.abstractProducts.Car;
import abstractFactoryTrafficParticipant.abstractProducts.Motorcycle;

public interface AbstractFactoryTrafficParticipant {
    Car createPrivilegedCar();
    Car createNotPrivilegedCar();

    Motorcycle createPrivilegedMotorcyle();
    Motorcycle createNotPrivilegedMotorcyle();

}
