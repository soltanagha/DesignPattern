package abstractFactoryTrafficParticipant.factories;

import abstractFactoryTrafficParticipant.AbstractFactoryTrafficParticipant;
import abstractFactoryTrafficParticipant.abstractProducts.Car;
import abstractFactoryTrafficParticipant.abstractProducts.Motorcycle;
import abstractFactoryTrafficParticipant.physicalProducts.PhysicalNotPrivilegedCar;
import abstractFactoryTrafficParticipant.physicalProducts.PhysicalNotPrivilegedMotorcycle;
import abstractFactoryTrafficParticipant.physicalProducts.PhysicalPrivilegedCar;
import abstractFactoryTrafficParticipant.physicalProducts.PhysicalPrivilegedMotorcycle;

public class PhysicalParticipant implements AbstractFactoryTrafficParticipant {

    @Override
    public Car createPrivilegedCar() {
        return new PhysicalPrivilegedCar();
    }

    @Override
    public Car createNotPrivilegedCar() {
        return new PhysicalNotPrivilegedCar();
    }
    @Override
    public Motorcycle createPrivilegedMotorcyle() {
        return new PhysicalPrivilegedMotorcycle();
    }

    @Override
    public Motorcycle createNotPrivilegedMotorcyle() {
        return new PhysicalNotPrivilegedMotorcycle();
    }

}
